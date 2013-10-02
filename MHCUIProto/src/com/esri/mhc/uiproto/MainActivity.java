package com.esri.mhc.uiproto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainActivity extends Activity implements OnItemClickListener {

	private ListView listView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		listView=(ListView)findViewById(R.id.listVWActivities);
		listView.setOnItemClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {
		// TODO Auto-generated method stub
		Intent intent;
		switch (position) {
		case 0:
			intent=new Intent(MainActivity.this, ViewPagerActivity.class);
			break;
		case 1:
			intent=new Intent(MainActivity.this, TabListActivity.class);
			break;
		case 2:
			intent=new Intent(MainActivity.this, ExpeditionActivity.class);
			break;
		case 3:
			intent=new Intent(MainActivity.this, VideoActivity.class);
			break;			
		default:
			intent=new Intent(MainActivity.this, ViewPagerActivity.class);
			break;
		}
		startActivity(intent);
	}
	
	
	

}
