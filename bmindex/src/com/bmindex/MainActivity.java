package com.bmindex;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText height,weight;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		height = (EditText) findViewById(R.id.textheight);
		weight = (EditText) findViewById(R.id.textweight);
		
	}
	public void Clicked(View v){
		String ourheight = height.getText().toString();
		String ourweight = weight.getText().toString();
		//convert to double
		double con_height = Double.parseDouble(ourheight);
		double con_weight = Double.parseDouble(ourweight);
		//call compute method passing your weight and height
		System.loadLibrary("first");
		double answer =  Compute(con_weight, con_height);
		
		Toast.makeText(this, "BMI is:"+answer, Toast.LENGTH_LONG).show();
	}
	public native double Compute(double w,double h);

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
