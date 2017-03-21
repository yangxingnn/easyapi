/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
angular.module('base.controller',[])
        .controller('baseCtrl',['$scope','$location',function($scope,$location){
                
                
                $scope.getNavActiveClass = function(pagePath){
                    console.log($location.path())
                    if($location.path()){
                        
                    }
//                    return 'active';
                };
        }]);



