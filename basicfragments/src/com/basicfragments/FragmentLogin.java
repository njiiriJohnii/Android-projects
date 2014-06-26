package com.basicfragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class FragmentLogin  extends Fragment{
	EditText email;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		//v object is useful in finding your views 
		View v = inflater.inflate(R.layout.fragmentlogin, container,false);
		email = (EditText) v.findViewById(R.id.email);
		
		return v;
	}

}
