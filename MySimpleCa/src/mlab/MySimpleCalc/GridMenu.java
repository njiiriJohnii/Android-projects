package mlab.MySimpleCalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

public class GridMenu extends Activity{
ImageView imgtwitter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gridmenu);
		imgtwitter = (ImageView) findViewById(R.id.img2);
		imgtwitter.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
 Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_LONG).show();
			}
		});
		//do facebook
	
	}
	//button click listener
	public void onButtonClicker(View v){
	switch(v.getId()){
	case R.id.feature1:
		//to do Intents
	Toast.makeText(this, "Feature1 Click", Toast.LENGTH_LONG).show();
	break;	
	
case R.id.feature2:
	Toast.makeText(this, "Feature2 Click", Toast.LENGTH_LONG).show();	
	 break;
	
case R.id.feature4:
	//to do
	break;
	}			
	}
		
}
