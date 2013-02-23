package com.raisenllc.plugins;

import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;

@SuppressWarnings("deprecation")
public class AndroidVersion extends Plugin {

	@Override
	public PluginResult execute(String action, JSONArray args, String callbackId) {
		PackageInfo pInfo;
		try {
			pInfo = super.cordova.getActivity().getPackageManager().getPackageInfo(super.cordova.getActivity().getPackageName(), 0);
			String version = pInfo.versionName;
			return new PluginResult(PluginResult.Status.OK, version); 
		} catch (NameNotFoundException e) {
			return new PluginResult(PluginResult.Status.ERROR); 
		}
	}

}
