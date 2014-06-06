package mlab.MySimpleCalc;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Banking extends Activity{
	ListView banks;
	String [] banknames = {"Equity Bank","Co-op","KCB","Barclays Bank"};   
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.banking);
		//find listview by Id
		banks = (ListView) findViewById(R.id.list);
		//create an array adapter to convert the 'banknames'into view objects
		//here we can specify our own list designer
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.desighner,banknames);
		//set the adapter to your list view
		banks.setAdapter(adapter);
		//setaction listener
		 banks.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int pos,
					long arg3) {
				//get clicked name
				String clickedname = banknames[pos];
				Toast.makeText(Banking.this,"Selected:"+clickedname, Toast.LENGTH_LONG).show();
				// TODO Auto-generated method stub
				//get the position.
				if (pos==0){
					Intent web = new Intent(getApplicationContext(),Calculator.class);
					startActivity(web);
				}
				if (pos==1){
					Intent duo = new Intent(Intent.ACTION_CALL,Uri.parse("tel:0725678664"));
					startActivity(duo);
				}
				if (pos==2)	{
					Intent denn = new Intent(getApplicationContext(),Loans.class);
					startActivity(denn);
				}
			}
		});
		
	}

}
