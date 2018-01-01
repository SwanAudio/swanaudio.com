var map = {
  'app': 'assets/javascripts',
  '@angular':'assets/lib/@angular',
  'rxjs':'assets/lib/rxjs',
  'angulartics2': 'assets/lib/angulartics2/bundles/core.umd',
  'angulartics2/ga': 'assets/lib/angulartics2/bundles/ga.umd',
};

var packages = {
  'app': {main: 'main.js', defaultExtension: 'js'},
  'rxjs': {defaultExtension: 'js'},
  'assets/lib': {defaultExtension: 'js'},
};

var ngPackageNames = [
  'animations',
  'common',
  'compiler',
  'core',
  'forms',
  'router',
  'http',
  'platform-browser',
  'platform-browser-dynamic',
  'router'
];

function packIndex(pkgName) {
  packages['@angular/'+pkgName] = { main: 'index.js', defaultExtension: 'js' };
}

function packUmd(pkgName) {
  packages['@angular/'+pkgName] = { main: '/bundles/' + pkgName + '.umd.js', defaultExtension: 'js' };
}

// Most environments should use UMD; some (Karma) need the individual index files
function addAngularModulesToMap(pkgName) {
  map['@angular/'+pkgName] = 'assets/lib/angular__' + pkgName;
}

// Add package entries for angular packages
var setPackageConfig = System.packageWithIndex ? packIndex : packUmd;
ngPackageNames.forEach(setPackageConfig);

// Add map entries for angular packages
ngPackageNames.forEach(function(pkgName){
  addAngularModulesToMap(pkgName)
});

System.config({
  map : map,
  packages: packages
});

System.import('app')
  .catch(console.error.bind(console));
