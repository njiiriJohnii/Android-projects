package campus.mlab;

import campus.mlab.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity {
	
	public class Spinners extends Activity
	{
		String [] items = {"Nyeri","Mukoma","Gateiguru","Zimmerman"};
	}
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Spinner spin = (Spinner) findViewById(R.id.spinner);
		ArrayAdapter<string> aa = new ArrayAdapter<string>(this,android.R.layout.simple_dropdown_item_1line);
		aa.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
		spin.setAdapter(aa);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
