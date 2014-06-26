package com.mlab.sqliteexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Retrieve extends Activity{
	EditText searchid;
 @Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.retrieve);
   searchid = (EditText) findViewById(R.id.txtsearchregid);}
 public void Search(View v){
	String id = searchid.getText().toString();
	
	SQLiteHandler handler = new SQLiteHandler(getApplicationContext());
	//handler.getData()
    String res  =	handler.getData(id);
    Toast.makeText(getApplicationContext(), res, Toast.LENGTH_LONG).show();   
}
}
 