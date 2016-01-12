angular.module('noDragons').controller('overviewController', ['$scope', '$location', '$http', function ($scope, $location, $http) {
    $http.post('http://localhost:8080/allmonstertemplates').then(function (data){
        $scope.templates = data.data;
    });
}]);
