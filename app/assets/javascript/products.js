var app = angular.module('swanaudio', []);

app.controller('img-swap', function ($scope) { 
    $scope.images = [{
        id: 1,
        label: '',
        url: ''
    },{
        id: 2,
        label: '',
        url: ''
    }];

    $scope.$watch('', function(id) {

    });
});
