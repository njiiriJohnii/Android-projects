package com.expensetracker;

import java.io.IOException;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Info extends Activity {
	TextView txtd;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.info);
		txtd = (TextView) findViewById(R.id.textcontent);
		// listen to the text view 
		txtd.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				//create intent and Share 
				Intent sharingIntent = new Intent(Intent.ACTION_SEND);
				sharingIntent.setType("text/plain");
				sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT,txtd.getText());
				startActivity(Intent.createChooser(sharingIntent, "share using"));
				
				
			}
		});
		// here we create an object for TextFileReader class
		TextFilesReader reader = new TextFilesReader(this);
		//access readTxt method passing your text file
		String result = null;
		try{
			result = reader.readTxt("sample.txt");
		}catch(IOException e){
			e.printStackTrace();
		}
		//set the  result to text view
		txtd.setText(result);
	}

}
