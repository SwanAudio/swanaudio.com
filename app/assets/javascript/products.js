'use strict';

var app = angular.module('swanaudio', []);

app.controller('img-swap', ['$scope', '$http', 
  function ($scope, $http) { 
    $scope.images = [{
      id: 1,
      label: '',
      url: ''
    },{
      id: 2,
      label: '',
      url: ''
    }];

    $http.get('product/list').success(function(data) {
      $scope.products = data
    });

    $scope.$watch('', function(id) {
    });
  }
]);
