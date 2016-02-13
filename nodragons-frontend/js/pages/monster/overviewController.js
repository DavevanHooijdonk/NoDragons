angular.module('noDragons').controller('overviewController', ['$scope', '$location', '$http', '$window', function ($scope, $location, $http, $window) {
    $scope.serverActionInProgress = false;

    $http.get('/allmonstertemplates').then(function (data){
        $scope.templates = data.data;
    });

    $scope.editMonster = function (id)
    {
        $location.path("/monstereditor/" + id);
    }

    $scope.createMonster = function ()
    {
        $scope.serverActionInProgress = true;
        $http.post('/createmonstertemplate').then(
            function (result)
            {
                $location.path('/monstereditor/' + result.data);
            },
            function (fail)
            {
                $scope.serverActionInProgress = false;
                $window.alert("Failed to create new monster. Server error: " + fail.status + " " + fail.statusText);
            }
        );
    }
}]);
