package com.mlab.sqliteexample;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

public class SQLiteHandler extends SQLiteOpenHelper {
 private static final String MYDATABASE = "student";
 private static final int VERSION = 1;
	private final String SAMPLE_TABLE_NAME = "trainees";
	//private final String SAMPLE_TABLE_NAME1 = "f";
	protected Context context;
  public SQLiteHandler(final Context connection) {
	//Database is created at this point	
  super(connection, MYDATABASE, null, VERSION);
  this.context = connection;
  
 }
 
 @Override
 public void onCreate(SQLiteDatabase db) {
	 db.execSQL("CREATE TABLE IF NOT EXISTS " +
 			SAMPLE_TABLE_NAME +" (LastName VARCHAR, FirstName VARCHAR, RegId INT(3));");
	 
	 	
 }
 
 public void SaveRecords(String id,String firstname,String lastname){
	 //writing in the database//get writable database
	 SQLiteDatabase db = this.getWritableDatabase();
	 //pass strings to respective columns
	 ContentValues colm = new ContentValues();
	 colm.put("RegId", id);
	 colm.put("FirstName ", firstname);
	 colm.put("LastName ", lastname);
	 //insert into table
long check = db.insert(SAMPLE_TABLE_NAME,null,colm);
	 
	 if(check<1){
		 Toast.makeText(context, "Failed try again", Toast.LENGTH_LONG).show();
		 
	 }
	 
	 else{
		 Toast.makeText(context, "Thank you record saved", Toast.LENGTH_LONG).show();
	 }
 }
 
 
 
 
 
 @Override
 public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
   //db.execSQL("DROP TABLE IF EXIST o");
//  onCreate(db);
 }
 
 //get data
 public void deletData(String id) {
     
	 SQLiteDatabase db = this.getReadableDatabase();
	 final Cursor c = db.rawQuery("SELECT FirstName, LastName,RedId FROM " +
	 			SAMPLE_TABLE_NAME +
	 			" where RedId =  '"+id+"'", null);
	 
	 int count = c.getCount();
	 Toast.makeText(context, "c is"+c, Toast.LENGTH_SHORT).show();
    if(count == 0){//does not exist
 	
 		Toast.makeText(context, "Not Found", Toast.LENGTH_SHORT).show();
 		c.close();
 	}
    else {//exist
    	//create a delete query
    String deleteQuery = "DELETE FROM  trainees where RedId='"+ id +"'";
    db.execSQL(deleteQuery);
  	
  	
  	Toast.makeText(context, "Deleted", Toast.LENGTH_SHORT).show();

    }
}
 
 
 
 
 
 
 
	 
 //get data
 public String getData(String id) {
     
	 SQLiteDatabase db = this.getReadableDatabase();

	 //select data/records based on id provided.
	 final Cursor c = db.rawQuery("SELECT FirstName, LastName,RegId FROM " +
	 			SAMPLE_TABLE_NAME +" where RegId = "+id+"", null);
	 //check number of rows returned
	 
	 int count = c.getCount();
	 //if count is zero, no records
	 
    if(count == 0){
 	
 		Toast.makeText(context, "Not Found", Toast.LENGTH_SHORT).show();
 		c.close();
 	}
    
     String result = "";
     //get columns returned as ints
     int fname = c.getColumnIndex("FirstName");
     int lname = c.getColumnIndex("LastName");
     int regid = c.getColumnIndex("RegId");
     
     for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()) {
    	 //get the string values
         result = result + "FirstName :"+c.getString(fname) + "\n\nLastName: " + c.getString(lname) + "\n\nRegId: " + c.getString(regid) + "\n\n****************\n";
         
         
     }
     //Log.d("", result);
    // String[] array = result.split(" ");
     return result;
    
 
}
 

}
 
