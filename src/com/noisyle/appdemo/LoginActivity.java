package com.noisyle.appdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

	}
	
	//点击登陆按钮时调用
	public void onClickBtnLogin(View v) {
		Toast.makeText(this, "登陆成功", Toast.LENGTH_SHORT).show();
		this.finish();
	}
	
	//点击取消按钮时调用
	public void onClickBtnCancelLogin(View v) {
		this.finish();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		switch (item.getItemId()) {
		case R.id.action_test:
			openTest();
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
	
	private void openTest() {
		Intent intent = new Intent(this, TestActivity.class);
		startActivity(intent);
	}
}
