phonegap-AndroidVersion
=======================

Phonegap Plugin to retrieve the versionName value dynamically

Installation/Configuration
--------------------------

In your res/xml/config.xml file, add the following line:

    <plugin name="AndroidVersion" value="com.raisenllc.plugins.AndroidVersion" />

Copy `AndroidVersion.java` and `AndroidVersion.js` to your project.

Usage
-----
See `index.html` in the `usage` folder for an example of how to use the plugin.

Basically, after importing `AndroidVersion.js`, you should be able to get the versionName value by doing:

	var androidVersion = cordova.require("cordova/plugin/androidversion");
	androidVersion.get(function(version_name){
		console.log('version = ' + version_name);
	}, function(){
	});	

Note that you must do that after deviceready event.
