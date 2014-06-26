package mlab.MySimpleCalc;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Loans extends Activity{
	Spinner loans; 
	String[] bankloans ={"personal loans","School Loans","Students Loans","Farmer"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loans);
		loans = (Spinner) findViewById(R.id.loans);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,bankloans);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		//set adapter to spinner
		
		loans.setAdapter(adapter);
		
	}

}
