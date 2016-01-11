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
            "id": 1,
            "effect": {
                "effectDescription": "Wield the Power of Bananas"
            }
        },
        {
            "name": "Potato IQ",
            "id": 2,
            "effect": {
                "effectDescription": "Have the IQ of a potato. Achievement unlocked."
            }
        }
        ],
        "activeAbilities": [
        {
            "name": "Banana Attack Strike Move Ability",
            "id": 2,
            "minimumDamage": 12,
            "maximumDamage": 14,
            "effect": {
                "effectDescription": "Flying banana pain"
            }
        }
        ]
    };
}]);
