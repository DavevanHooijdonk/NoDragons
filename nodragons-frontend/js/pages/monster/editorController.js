// TODO:
// - Allow undo/redo of removing abilities. If you accidentally click remove, then it should be undoable.
// - Add validation to the min-max damage of active abilities (min <= max).
// - Need to delay load until we have the template data! ( http://stackoverflow.com/questions/16617259/wait-until-scope-variable-is-loaded-before-using-it-in-the-view-in-angular-js )

angular.module('noDragons').controller('monsterEditorController', ['$scope', '$window', '$location', '$routeParams', '$resource', function ($scope, $window, $location, $routeParams, $resource) {
    // Get current route parameter: which monster are we viewing?
    $scope.id = $routeParams.monsterId;

    var monsterResource = $resource('/monstertemplate/:id', {id: $scope.id});

    $scope.monster = monsterResource.get({}, function () {},
        function (fail)
        {
            $window.alert("Could not retrieve monster with id=" + $scope.id + ". Server error " + fail.status + ": " + fail.statusText);
            $location.path('/monsteroverview');
        });

    // Mock object (unused)
    $scope.mockMonster =
    {
        "name": "Peter",
        "id": 5,
        "rank": "BOSS",
        "stats": {
            "maximumHitpoints": 10,
            "zoneOfControl": 2,
            "movementSpeed": 4,
            "physicalResistance": 0,
            "magicalResistance": 0,
            "mentalResistance": 0
        },
        "passiveAbilities": [
        {
            "name": "Banana Passive",
            "id": 0,
            "effect": {
                "description": "Wield the Power of Bananas"
            }
        },
        {
            "name": "Potato IQ",
            "id": 1,
            "effect": {
                "description": "Have the IQ of a potato. Achievement unlocked."
            }
        }
        ],
        "activeAbilities": [
        {
            "name": "Banana Attack Strike Move Ability",
            "id": 0,
            "minimumDamage": 12,
            "maximumDamage": 14,
            "effect": {
                "description": "Flying banana pain"
            }
        }
        ]
    };

    $scope.addPassiveAbility = function ()
    {
        // TODO: There has to be a neater way (factory? where?) of generating a new passive.
        var passives = $scope.monster.passiveAbilities;
        var nextId = passives.reduce(function (prevId, passive) {return Math.max(prevId, passive.id);}, -1) + 1;
        passives.push( {name: "New Passive", id: nextId, effect: {description: ""}} );
        console.log("Added new passive ability with id=" + nextId);
    }

    $scope.removePassiveAbility = function (index)
    {
        var passives = $scope.monster.passiveAbilities;
        passives.splice(index, 1);
    }

    $scope.addActiveAbility = function ()
    {
        // TODO: There has to be a neater way (factory? where?) of generating a new active.
        var actives = $scope.monster.activeAbilities;
        var nextId = actives.reduce(function (prevId, active) {return Math.max(prevId, active.id);}, -1) + 1;
        actives.push( {name: "New Active", id: nextId, minimumDamage: 0, maximumDamage: 0, effect: {description: ""}} );
        console.log("Added new active ability with id=" + nextId);
    }

    $scope.removeActiveAbility = function (index)
    {
        var actives = $scope.monster.activeAbilities;
        actives.splice(index, 1);
    }

    // Used on fieldsets semi-legally to disable controls. This is not !00% legal HTML (and IE does not support).
    $scope.savingInProgress = false;

    $scope.saveMonster = function ()
    {
        $scope.savingInProgress = true;
        monsterResource.save({}, $scope.monster,
            function (success)
            {
                $location.path('/monsteroverview');
            },
            function (fail)
            {
                $scope.savingInProgress = false;
                $window.alert("Failed to save monster: error " + fail.status + " " + fail.statusText);
            }
        );
    }

    $scope.deleteMonster = function ()
    {
        $scope.savingInProgress = true;
        monsterResource.remove({}, {},
            function (success)
            {
                $location.path('/monsteroverview');
            },
            function (fail) {
                $scope.savingInProgress = false;
                $window.alert("Failed to delete monster: error " + fail.status + " " + fail.statusText);
            }
        );
    }
}]);
