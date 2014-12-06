package edu.fau.group4.donateme;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class Tab extends TabActivity
{
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab);
		
		TabHost tabHost = getTabHost();
		TabHost.TabSpec spec;
		Intent intent;
		
		intent = new Intent().setClass(this, Browse.class);
		spec = tabHost.newTabSpec("First").setIndicator("Browse")
		              .setContent(intent);
		tabHost.addTab(spec);
		
		intent = new Intent().setClass(this, Request.class);
		spec = tabHost.newTabSpec("Second").setIndicator("Request")
		              .setContent(intent);
		tabHost.addTab(spec);
	}
	
	public void onLogout(View v) 
	{
		Intent i = new Intent(v.getContext(), Welcomepage.class);	         
		startActivity(i);
	}
} 
