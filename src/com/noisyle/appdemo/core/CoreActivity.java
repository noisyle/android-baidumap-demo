package com.noisyle.appdemo.core;

import android.app.Activity;
import android.widget.Toast;

abstract public class CoreActivity extends Activity {

	protected void showToast(String text) {
		Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
	}
	
	protected void showToast(int resId) {
		Toast.makeText(this, resId, Toast.LENGTH_SHORT).show();
	}
}
