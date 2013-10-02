package com.esri.mhc.uiproto;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class WelcomeMEFragment extends Fragment {
	private static final String EXTRA_TITLE = "EXTRA_TITLE";	
	
	public static final WelcomeMEFragment newInstance(String title) {
		WelcomeMEFragment f = new WelcomeMEFragment();
		Bundle bdl = new Bundle(1);
		bdl.putString(WelcomeMEFragment.EXTRA_TITLE, title);
		f.setArguments(bdl);
		return f;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		String title = getArguments().getString(EXTRA_TITLE);
		View v = inflater.inflate(R.layout.view_pager_fragment_me, container, false);
		TextView titleTextView = (TextView) v.findViewById(R.id.txtWelcomeTitle);
		titleTextView.setText(title);
//		ImageView logoImg=(ImageView)v.findViewById(R.id.imgLogo);
//		logoImg.setImageResource(R.drawable.dot_active);
//		logoImg.setScaleType(ImageView.ScaleType.CENTER_CROP);
		//logoImg.setImageDrawable(getResources().getDrawable(R.drawable.dot_inactive));
		return v;
	}
	
}
