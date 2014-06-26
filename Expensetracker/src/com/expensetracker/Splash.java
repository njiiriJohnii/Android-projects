package com.expensetracker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity {
	private int displayTime = 5000;
 @Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.splash);
	Thread splashThread = new Thread(){
		int wait=0;
		public void run(){
			try{
				super.run();
				while(wait< displayTime){
					sleep(100);
					wait +=100;
				}
			}
			catch (Exception e){}
			finally{
				Intent inte = new Intent(Splash.this,MainActivity.class);
				startActivity(inte);
				finish();
			}
		}
	};
	splashThread.start();
}

}
