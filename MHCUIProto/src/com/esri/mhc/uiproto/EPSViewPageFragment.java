package com.esri.mhc.uiproto;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class EPSViewPageFragment extends Fragment {
	private static final String EXTRA_TITLE = "EXTRA_TITLE";
	private static final String EXTRA_SUBTITLE = "EXTRA_SUBTITLE";	
	
	public static final EPSViewPageFragment newInstance(String title, String subTitle) {
		EPSViewPageFragment f = new EPSViewPageFragment();
		Bundle bdl = new Bundle(2);
		bdl.putString(EXTRA_TITLE, title);
		bdl.putString(EXTRA_SUBTITLE, subTitle);
		f.setArguments(bdl);
		return f;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		String title = getArguments().getString(EXTRA_TITLE);
		String subTitle=getArguments().getString(EXTRA_SUBTITLE);
		View v = inflater.inflate(R.layout.view_pager_fragment_eps, container, false);
		TextView titleTextView = (TextView)v.findViewById(R.id.txtSPTitle);
		titleTextView.setText(title);
		TextView subTitleTextView = (TextView)v.findViewById(R.id.txtSPSubTitle);
		subTitleTextView.setText(subTitle);
		return v;
	}
	
}
