package com.expensetracker;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import com.database.R;
import com.database.SendData;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);
	}

	
	
	 
    //method to save data to db - onClick attribute in xml
    public void ButtonOnClick(View view){
    	
    	//create a progress bar
		final ProgressDialog dialog = ProgressDialog.show(view.getContext(),"Please Wait", "Accessing Server.....");
          Thread thread = new Thread()
          {
              @Override
              public void run() {
    	   try {
    		
    		EditText firstname,lastname,number,email,password,reenter;
    		//Reference your edit texts
    		firstname= (EditText) findViewById(R.id.txtfirstname);
    		lastname= (EditText) findViewById(R.id.txtlastname);
    		number= (EditText) findViewById(R.id.txtmobile);
    		email= (EditText) findViewById(R.id.edtemail);
    		password= (EditText) findViewById(R.id.txtpassword);
    		reenter= (EditText) findViewById(R.id.txtconfirm);
    	    //get text from edit texts
        	String rcvdfirstname = firstname.getText().toString();
        	String rcvdlastname = lastname.getText().toString();
        	String rcvdnumber = number.getText().toString();
        	String rcvdemail= email.getText().toString();
        	String rcvdpassword = password.getText().toString();
        	String rcvdreenter = reenter.getText().toString();

       
        	
        	
        	//We retrieve and send data via the HttpClient class.
        
        	String url = "http://10.0.2.2/serverfolder/add.php";
            DefaultHttpClient httpclient = new DefaultHttpClient();
            //Create a HTTp post object to hold our data - url
            HttpPost httppost = new HttpPost(url);
            //use HTTPClient to execute the HTTPPost
            // Execute HTTP Post Request
            //encode URL
            ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(3);
            nameValuePairs.add(new BasicNameValuePair("clientid", rcvdclient));
            nameValuePairs.add(new BasicNameValuePair("balance", rcvdbalance));  
            httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            HttpResponse response = httpclient.execute(httppost);
           
       
            //use Input stream to read the http client response
            InputStream inputStream = response.getEntity().getContent();
            
            // Get the response
            //use buffered reader and InputStreamReader to read the input stream
            BufferedReader rd = new BufferedReader(new InputStreamReader(inputStream), 4096);
            String line;
            //initialize StringBuilder
            StringBuilder sb =  new StringBuilder();
            //read everything from the Buffered reader and append the to the
            //string builder
            while ((line = rd.readLine()) != null) 
            {
            		sb.append(line);
            }
            rd.close();
            //our result
            String result = sb.toString();
      
           
            inputStream.close();
            runOnUiThread(new Runnable() {
                public void run() {
                    //once response is received - dismiss dialog
                    dialog.dismiss();
                }
            });
                 
            
           
            //check if response is 4
            if(result.equals("4")){
//need this because of progress bar 
            	Register.this.runOnUiThread(new Runnable() {

                    @Override
                    public void run() {
                        Toast.makeText(Register.this, "Registration Successful", Toast.LENGTH_SHORT).show();

                    }
                });
                }
        
          //check if response is 5
            else if(result.equals("5")){

            	Register.this.runOnUiThread(new Runnable() {

                    @Override
                    public void run() {
                        Toast.makeText(Register.this, "Registration Failed", Toast.LENGTH_SHORT).show();

                    }
                });
                }
          

 				 
     }
    	 //catch exception
            catch (Exception e)
            {
                Toast.makeText(getApplicationContext(), "Error inside set:"+e.toString(), Toast.LENGTH_LONG).show();
            }
              }};thread.start();
    }
}
