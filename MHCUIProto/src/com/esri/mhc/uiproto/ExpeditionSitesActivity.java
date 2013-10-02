package com.esri.mhc.uiproto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

import com.esri.android.map.MapView;
import com.esri.android.map.ags.ArcGISTiledMapServiceLayer;

public class ExpeditionSitesActivity extends Activity implements OnItemClickListener {
	MapView mMapView;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_expedition_sites);
		
		// Retrieve the map and initial extent from XML layout
				mMapView = (MapView)findViewById(R.id.mapExpeditionSites);
				// Add dynamic layer to MapView
				mMapView.addLayer(new ArcGISTiledMapServiceLayer("" +
				"http://services.arcgisonline.com/ArcGIS/rest/services/World_Street_Map/MapServer"));		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.expedition_sites, menu);
		return true;
	}

	@Override
	public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {
		// TODO Auto-generated method stub
//		Intent intent;
//		switch (position) {
//		case 0:
//			intent=new Intent(ExpeditionSitesActivity.this, ExpeditionSitesActivity.class);
//			break;
//
//		}
//		startActivity(intent);
	}

}
