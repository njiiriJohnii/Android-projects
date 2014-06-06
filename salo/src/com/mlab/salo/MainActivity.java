package com.mlab.salo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	//decrare the edit texts
	EditText basic,allowance,deductions;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		basic = (EditText)findViewById(R.id.basic);
		allowance=(EditText)findViewById(R.id.allowances);
		deductions=(EditText)findViewById(R.id.dedns);
	}
	public void find(View v){
		String mybasic = basic.getText().toString();
		String myallowance = allowance.getText().toString();
		String mydeductions = deductions.getText().toString();
		
		double con_mybasic = Double.parseDouble(mybasic);
		double con_myallowance = Double.parseDouble(myallowance);
		double con_mydeductions = Double.parseDouble(mydeductions);
		double gross = con_mybasic + con_myallowance;
		double net = (con_mybasic + con_myallowance)-(con_mydeductions);
		Toast.makeText(this, "your gross salary is"+gross,Toast.LENGTH_LONG).show();
		Toast.makeText(this, "your net salo is "+net,Toast.LENGTH_LONG).show();
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
