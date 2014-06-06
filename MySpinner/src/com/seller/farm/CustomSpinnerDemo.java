package com.seller.farm;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

 
public class CustomSpinnerDemo extends Activity implements AdapterView.OnItemSelectedListener{
    String[] strings = {"--Seller Partner--","Farm Products","Product Placement",
            "Products Display", "Equipments", "Signing","Appeal"};
 
    String[] subs = {"--Click-Select One--","All you need!!","Place It Well!!",
            "Nice Diplays!!", "Here they are", "Put Signs to your products","Appeal to the senses"};
 
 
    int arr_images[] = { R.drawable.a,R.drawable.h,
                         R.drawable.d, R.drawable.appeal,
                         R.drawable.equ, R.drawable.f, R.drawable.g};
   
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
 
        Spinner mySpinner = (Spinner)findViewById(R.id.spinner1);
        mySpinner.setOnItemSelectedListener(this);
       
        mySpinner.setAdapter(new MyAdapter(CustomSpinnerDemo.this, R.layout.row, strings));
    }
 
    public class MyAdapter extends ArrayAdapter<String>{
 
        public MyAdapter(Context context, int textViewResourceId,   String[] objects) {
            super(context, textViewResourceId, objects);
        }
 
        @Override
        public View getDropDownView(int position, View convertView,ViewGroup parent) {
           return getCustomView(position, convertView, parent);
        }
 
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }
 
        public View getCustomView(int position, View convertView, ViewGroup parent) {
 
            LayoutInflater inflater=getLayoutInflater();
            View row=inflater.inflate(R.layout.row, parent, false);
            TextView label=(TextView)row.findViewById(R.id.company);
            label.setText(strings[position]);
 
            
            TextView sub=(TextView)row.findViewById(R.id.sub);
            sub.setText(subs[position]);
            ImageView icon=(ImageView)row.findViewById(R.id.image);
            icon.setImageResource(arr_images[position]);
 
            return row;
            }
        }

	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int position,
			long arg3) {
		if(position == 1){
		
		
			}
		
		if(position == 2){
		
			}
if(position == 3){
			
		
			}

if(position == 4){

	}

if(position == 5){
	
	}
if(position == 6){
	
	}
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
   }