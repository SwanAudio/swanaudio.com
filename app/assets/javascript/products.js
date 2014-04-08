'use strict';

var app = angular.module('swanaudio', []);

app.controller('img-swap', ['$scope', '$http', 
  function ($scope, $http) { 
    $http.get('product/list').success(function(data) {
      $scope.products = data;
    });

    $http.get('product/detail/1').success(function(data) {
      $scope.product = data;
      $scope.active_image = data.images[0];
    });

    $scope.swap_image = function(img) {
      $scope.active_image = img;
    };
  }
]);
