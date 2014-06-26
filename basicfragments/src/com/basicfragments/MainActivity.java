package com.basicfragments;

import android.os.Bundle;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void clicked (View v){
		Fragment fr= null;
		if (v == findViewById(R.id.btnlogin))
		{
			fr= new FragmentLogin();
		}
		if(v == findViewById(R.id.btninfo))
		{
			fr= new FragmentAbout();
		}
		if (v == findViewById(R.id.btnreg))
		{
			fr= new FragmentReg();
		}
		
		//switch/replace
		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();
		ft.replace(R.id.fragment_space, fr);
		ft.commit();
		
		
		
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
