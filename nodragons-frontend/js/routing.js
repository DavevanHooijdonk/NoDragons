/**
 * Created by X086353 on 1/7/2016.
 */

var noDragons = angular.module('noDragons', ['ngRoute']);

noDragons.config(['$routeProvider', function ($routeProvider) {
    $routeProvider
        .when('/', {
            templateUrl: 'webjars/html/pages/mainpage.html',
            controller: 'mainpageController'
        })

        .when('/monsteroverview', {
            templateUrl: 'webjars/html/pages/monster/overview.html',
            controller: 'overviewController'
        })
        .when('/monstercreator', {
            templateUrl: 'webjars/html/pages/monster/creator.html',
            controller: 'creatorController'
        });
}]);

