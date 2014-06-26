package com.mlab.sqliteexample;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	EditText regid,firstname,lastname;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		regid = (EditText) findViewById(R.id.txtregid);
		firstname = (EditText) findViewById(R.id.txtfirstname);
		lastname = (EditText) findViewById(R.id.txtlastname);
		}
	//do on click for the button
	public void Save(View v) {
		String ourid = regid.getText().toString();
		String ourfirstname = firstname.getText() .toString();
		String ourlastname = lastname.getText().toString();
		//call sqlite handler  - passing your three String variables
		SQLiteHandler handler = new SQLiteHandler(getApplicationContext());
		handler.SaveRecords(ourid, ourfirstname, ourlastname);
	}
	public void Search(View v){
		Intent ser = new Intent(this,Retrieve.class);
		startActivity(ser);
	}

	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;*/
	}


