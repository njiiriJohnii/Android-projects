package mlab.MySimpleCalc;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Calculator extends Activity {
	//decrare Edit text
	EditText amount,rate,time;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calculator);
		//find your edit text by id from XML layout
		amount =(EditText)findViewById(R.id.amount);
		rate =(EditText)findViewById(R.id.edittextrate);
		time =(EditText)findViewById(R.id.edittexttime);
	}
	//listen to button click
	public void calculate(View v)
	{    //get text from your editText
	 String ouramount = amount.getText().toString();
	 String ourrate = rate.getText().toString();
	 String ourtime = time.getText().toString();
	 //check for empty field
	 if (ouramount == "")
	 {
		 
		 Toast.makeText(this, "Error!!!-----> Please enter amount",Toast.LENGTH_LONG).show();
	 }
	 else if (ourrate == "")
	 {
		 Toast.makeText(this, "Error!----> please enter rate!",Toast.LENGTH_LONG).show();
	 }
	 else
	 {
	 //convert strings to double
	 double con_amount = Double.parseDouble(ouramount);
	 double con_rate = Double.parseDouble(ourrate);
	 double con_time = Double.parseDouble(ourtime);
	 
	 //calculate 
	double ans= con_amount*con_rate/100*con_time;
	//toast the answer
	Toast.makeText(this,"Answer is: "+ans, Toast.LENGTH_LONG).show();
    }	
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
