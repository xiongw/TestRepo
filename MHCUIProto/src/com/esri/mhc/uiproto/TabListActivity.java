package com.esri.mhc.uiproto;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.TabActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

import com.esri.mhc.model.NearbySiteVO;

public class TabListActivity extends Activity {

	List<NearbySiteVO> sites = new ArrayList<NearbySiteVO>();
	NearbySiteArrayAdapter adapter;
	TabHost tabHost;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tab_list);

		tabHost = (TabHost) findViewById(android.R.id.tabhost);//R.id.tabhost will nto find anything, weired!
		tabHost.setup();

		TabSpec spec1 = tabHost.newTabSpec("TAB 1");
		spec1.setContent(R.id.tab1);
		spec1.setIndicator("TAB 1");

		TabSpec spec2 = tabHost.newTabSpec("TAB 2");
		spec2.setIndicator("TAB 2");
		spec2.setContent(R.id.tab2);

		TabSpec spec3 = tabHost.newTabSpec("TAB 3");
		spec3.setContent(R.id.tab3);
		spec3.setIndicator("TAB 3");
		tabHost.addTab(spec1);
		tabHost.addTab(spec2);
		tabHost.addTab(spec3);

		sites.add(new NearbySiteVO("Rockcliffe Mansion", "0.2 mile",
				"4 challenges"));
		sites.add(new NearbySiteVO("Mark Twain Cave", "0.41 mile",
				"3 challenges"));
		sites.add(new NearbySiteVO("Rockcliffe Mansion", "0.57 mile",
				"1 challenges"));
		sites.add(new NearbySiteVO("Cave Hollow West Wing", "0.75 mile",
				"3 challenges"));

		adapter = new NearbySiteArrayAdapter(this, sites);
		ListView listView = (ListView) findViewById(R.id.listVWTabExpedition);
		listView.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tab_list, menu);
		return true;
	}

}
