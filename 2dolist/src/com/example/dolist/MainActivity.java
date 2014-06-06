package com.example.dolist;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.keyEvent;
import android.view.KeyEvent;
import android.view.View;
import android.view.ArrayAdapter;
import android.view.EditText;
import android.view.ListView;





public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ListView myLView=(ListView)findViewByID("R.I.D");
		final EditText myEdt=(EditText)findViewById("R.I.D");
		final ArrayList<string>myItems=new ArrayList<string>();
		final ArrayAdapter<string>aa;"
		aa=newArrayAdapter<string>(this.android.R.Layout.simple_list_item_1,MyITems);
		ListView.setAdapter(aa);
		myEdt.setOnKeyListener(new view.OnKeyListener(){
			public boolean onkey(View V,Int keyCode,KeyEvent event){
				if(event.getAction()==keyEvent.Action_Down)
			   
			if(keycode==keyEvent.keyCode_DPAD_CENTRE)||(keyCode==keyEvent.keyCod_Enter)
			{
				myItems.add(o,MyEdt.getText().toString());
				aa.notifyDataSetChanged();
				mtEdt.setText("");
				return true;
			}
				return false;
			
			}
			
		});


	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
