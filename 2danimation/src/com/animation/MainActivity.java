package com.animation;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.view.Menu;
import android.widget.ImageView;

public class MainActivity extends Activity {
 ImageView ivAnimate;
 AnimationDrawable Animation;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ivAnimate = (ImageView) findViewById(R.id.animate);
		ivAnimate.setBackgroundDrawable(getResources().getDrawable(R.drawable.ship2_1));
		BitmapDrawable frame1 = (BitmapDrawable) getResources().getDrawable(R.drawable.ship2_1);
		BitmapDrawable frame2 = (BitmapDrawable) getResources().getDrawable(R.drawable.ship2_2);
		BitmapDrawable frame3 = (BitmapDrawable) getResources().getDrawable(R.drawable.ship2_3);
		BitmapDrawable frame4 = (BitmapDrawable) getResources().getDrawable(R.drawable.ship2_4);
		//animate frames
		Animation = new AnimationDrawable();
		Animation.addFrame(frame1, 100);
		Animation.addFrame(frame2, 100);
		Animation.addFrame(frame3, 100);
		Animation.addFrame(frame4, 100);
		
		Animation.setOneShot(false);
		ivAnimate.setBackgroundDrawable(Animation);
		Handler handler = new Handler();
		
		handler.postDelayed(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Animation.start();
				
			}
		}, 3000);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
