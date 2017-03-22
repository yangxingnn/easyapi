/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
angular.module('base.controller',[])
        .controller('baseCtrl',['$scope','$location','$interval',function($scope,$location,$interval){
                
                $interval(function(){
                    $scope.currentTime = new Date();
                },1000);
                
                $scope.currentUser = 'manager';
                
                $scope.getNavActiveClass = function(pagePath){
                    console.log($location.path())
                    if($location.path().indexOf(pagePath)!==-1){
                        return 'active';
                    }
//                    return 'active';
                };
        }]);



