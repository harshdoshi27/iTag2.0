var mainApp = angular.module("mainApp", ['ngRoute','ngStorage']);
//var mainApp = angular.module("mainApp", ['ngRoute','localStorageService']);

mainApp.config(function($routeProvider) {
	$routeProvider
		.when('/dashboard', {
			templateUrl: './pages/dashboard.html',
			controller: 'dashboardController'
		}).when('/home', {
			templateUrl: './pages/home.html',
			controller: 'homeController'
		}).when('/userInfo', {
			templateUrl: './pages/userInfo.html',
			controller: 'userInfoController'
		}).when('/eventInfo', {
			templateUrl: './pages/eventInfo.html',
			controller: 'eventInfoController'
		}).when('/reviewInfo', {
			templateUrl: './pages/reviewInfo.html',
			controller: 'reviewInfoController'
		}).when('/thankyou', {
			templateUrl: './pages/thankyou.html',
			controller: 'thankyouController'
		})
		.otherwise({
			redirectTo: '/home'
		});
});

/*mainApp.controller('StudentController', function($scope, $http) {
	$scope.message = "Click on the hyper link to view the students list.";
	$http.get("https://whispering-woodland-9020.herokuapp.com/getAllBooks")
    .then(function(response) {
      $scope.data = response.data;
    });

	
});
*/
