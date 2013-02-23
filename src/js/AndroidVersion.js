cordova.define("cordova/plugin/androidversion",
	function(require, exports, module) {
		var exec = require("cordova/exec");
		var AndroidVersion = function() {};
	
		var AndroidVersionError = function(code, message) {
			this.code = code || null;
			this.message = message || '';
		};
	
		AndroidVersion.prototype.get = function(success, fail) {
			exec(success, fail, "AndroidVersion", "get", []);
		};
	
		var androidVersion = new AndroidVersion();
		module.exports = androidVersion;
	}
);