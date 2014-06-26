package mlab.MySimpleCalc;

import java.io.IOException;

import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;


public class Info extends Activity {
	//decrare textview
	TextView tvdata;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.info);
		tvdata = (TextView) findViewById(R.id.textcontent);
		
		TextFilesReader reader = new TextFilesReader(this);
		
		try {
			String result = reader.readTxt("sample.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

