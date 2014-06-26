package mlab.MySimpleCalc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainmenu);//access layout
		
	}
	//create a method with the name of the button i.e onclick method
	public void calc(View v){
		//do intent Explicit
		//register calculator .java in the manifest
		Intent cal = new Intent(this,Calculator.class);//specify the target class
		startActivity(cal);
		
		
	}
	public void reg(View v)
	{
		Intent regs = new Intent(this,JoinUs.class);
		startActivity(regs);
	}
	public void bnks(View v){
		Intent bn = new Intent(this,Banks.class);
		startActivity(bn);
	}
	public void bankn(View v){
		Intent bnk = new Intent(this,Banking.class);
		startActivity(bnk);
	}
	public void info(View v){
		Intent in = new Intent(this,Info.class);
		startActivity(in);
	}
}
