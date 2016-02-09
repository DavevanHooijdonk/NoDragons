angular.module('noDragons').controller('overviewController', ['$scope', '$location', '$http', function ($scope, $location, $http) {
    $http.get('/allmonstertemplates').then(function (data){
        $scope.templates = data.data;
    });

    $scope.editMonster = function (id)
    {
        $location.path("/monstereditor/" + id);
    }
}]);
