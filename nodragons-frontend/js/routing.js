/**
 * Created by X086353 on 1/7/2016.
 */

var noDragons = angular.module('noDragons', ['ngRoute', 'ngResource']);

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
        .when('/monstereditor/:monsterId', {
            templateUrl: 'webjars/html/pages/monster/monstereditor.html',
            controller: 'monsterEditorController'
        })
        .otherwise( {
            redirectTo: '/'
        });
}]);

