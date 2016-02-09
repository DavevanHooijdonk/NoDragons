// TODO:
// - Allow undo/redo of removing abilities. If you accidentally click remove, then it should be undoable.
// - Add validation to the min-max damage of active abilities (min <= max).

angular.module('noDragons').controller('creatorController', ['$scope', '$location', '$http', function ($scope, $location, $http) {
    // Mock object
    $scope.monster =
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
                "effectDescription": "Wield the Power of Bananas"
            }
        },
        {
            "name": "Potato IQ",
            "id": 1,
            "effect": {
                "effectDescription": "Have the IQ of a potato. Achievement unlocked."
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
                "effectDescription": "Flying banana pain"
            }
        }
        ]
    };

    $scope.addPassiveAbility = function ()
    {
        // TODO: There has to be a neater way (factory? where?) of generating a new passive.
        var passives = $scope.monster.passiveAbilities;
        var nextId = passives.reduce(function (prevId, passive) {return Math.max(prevId, passive.id);}, -1) + 1;
        passives.push( {name: "New Passive", id: nextId, effect: {effectDescription: ""}} );
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
        actives.push( {name: "New Active", id: nextId, minimumDamage: 0, maximumDamage: 0, effect: {effectDescription: ""}} );
        console.log("Added new active ability with id=" + nextId);
    }

    $scope.removeActiveAbility = function (index)
    {
        var actives = $scope.monster.activeAbilities;
        actives.splice(index, 1);
    }
}]);
