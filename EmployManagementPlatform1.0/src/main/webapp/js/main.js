/*
* @Author: 冯杰
* @Date:   2017-04-11 09:40:07
* @Last Modified by:   Marte
* @Last Modified time: 2017-05-01 14:02:01
*/
(function(angular) {
  'use strict';

  /**
   * 应用程序的主要的模块
   */
  var app = angular.module('app', ['ngRoute']);

  app.config(['$routeProvider', function($routeProvider) {
    $routeProvider
      .when('/register', {
        templateUrl: './register.html',
        /*controller: 'MainController'*/
      })
      .when('/queryJobs',{
        templateUrl:'./jobList.html',
      });
  }]);

})(angular);
