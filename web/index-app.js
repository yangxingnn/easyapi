/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var easyapiApp = angular.module('easyapiApp',[
    'ngRoute',
    'ngResource',
    'base.controller'
    
]);

// 定义 一个返回常量的服务
//easyapiApp.constant(key,value);

// 注册一个在模块加载时对该模块进行配置的函数
//easyapiApp.config(callback);

// 注册一个在angularjs加载完后用于对所有模块进行配置的函数
//easyapiApp.run(callback);


easyapiApp.config(function($routeProvider){
    $routeProvider
            .when('/',{
                templateUrl:'app/dashboard/index.html'
            })
            .when('',{
                
            })
            .when('',{
                
            })
            .otherwise({
                redirectTo:'/dashboard'
            });
});