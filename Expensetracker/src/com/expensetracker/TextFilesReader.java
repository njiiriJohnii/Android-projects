package com.expensetracker;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import android.content.Context;
import android.content.Intent;
//this class is used to read textfiles and return 
//the contents as a string
public class TextFilesReader {

	Context g;
	public TextFilesReader(Context c){
		this.g = c;
		
	}

	//Method receives a string i.e "sample.txt"
	   public String readTxt(String a) throws IOException{

		   
		   
	    //InputStream inputStream = g.getResources().openRawResource(R.raw.hym1);
	    InputStream inputStream = g.getResources().getAssets().open("myfiles/"+a);
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		     
		     int i;
		  try {
		   i = inputStream.read();
		   while (i != -1)
		      {
		       byteArrayOutputStream.write(i);
		       i = inputStream.read();
		      }
		      inputStream.close();
		  } catch (IOException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
		  
		     return byteArrayOutputStream.toString();
		    }	
	
	
}
