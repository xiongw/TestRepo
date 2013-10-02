package com.esri.mhc.uiproto;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GeoTriggerDialog extends DialogFragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.expedition_geotrigger_dialog, container);
		getDialog().setTitle("Geo Triggered");
		return view;
	}
}
