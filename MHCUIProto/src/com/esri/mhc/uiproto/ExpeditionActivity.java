package com.esri.mhc.uiproto;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.esri.mhc.model.ExpeditionVO;

public class ExpeditionActivity extends Activity implements OnItemClickListener {

	ExpeditionArrayAdapter adapter;
	List<ExpeditionVO> sites = new ArrayList<ExpeditionVO>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_expedition);

		sites.add(new ExpeditionVO("Haunted Hannival", "5 sites"));
		sites.add(new ExpeditionVO("Walk in Mark Twain's Shoes", "3 sites"));
		sites.add(new ExpeditionVO("Hannibal Wineries", "4 sites"));
		sites.add(new ExpeditionVO("Ride the Riverboats", "6 sites"));
		sites.add(new ExpeditionVO("Tom and Huck", "3 sites"));
		sites.add(new ExpeditionVO("Haunted Hannival", "4 sites"));
		sites.add(new ExpeditionVO("Haunted Hannival", "5 sites"));
		adapter = new ExpeditionArrayAdapter(this, sites);
		ListView listView = (ListView) findViewById(R.id.listVWExpedtions);
		listView.setAdapter(adapter);

		listView.setOnItemClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.expedition, menu);
		return true;
	}

	@Override
	public void onItemClick(AdapterView<?> adapter, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		Intent intent;
		switch (position) {
		case 0:
			intent = new Intent(ExpeditionActivity.this,
					ExpeditionSitesActivity.class);
			break;
		default:
			intent = new Intent(ExpeditionActivity.this,
					ExpeditionSitesActivity.class);
			break;
		}
		startActivity(intent);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Toast.makeText(this, "MenuItem " + item.getTitle() + " selected.",
		// Toast.LENGTH_SHORT).show();
		 String title=item.getTitle().toString();
		 if (title.equalsIgnoreCase("trigger")){
				FragmentManager fm = getFragmentManager();
				GeoTriggerDialog dialog = new GeoTriggerDialog();
				dialog.setRetainInstance(true);
				dialog.show(fm, "GeoTriggeredDlgUniqTag");			
		 }
		return true;
	}

}
