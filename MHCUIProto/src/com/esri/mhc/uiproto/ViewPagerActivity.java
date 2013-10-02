package com.esri.mhc.uiproto;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;

public class ViewPagerActivity extends FragmentActivity {

	private WelcomePageAdapter pageAdapter;
	
	
	private ImageView imgSPDot1;
	private ImageView imgSPDot2;
	private ImageView imgSPDot3;
	private ImageView imgSPDot4;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_vpager);
		
		imgSPDot1=(ImageView)findViewById(R.id.imgSPDot1);
		imgSPDot2=(ImageView)findViewById(R.id.imgSPDot2);
		imgSPDot3=(ImageView)findViewById(R.id.imgSPDot3);
		imgSPDot4=(ImageView)findViewById(R.id.imgSPDot4);
		
		List<Fragment> fragments = getFragments();

		pageAdapter = new WelcomePageAdapter(getSupportFragmentManager(), fragments);

		ViewPager pager =(ViewPager)findViewById(R.id.viewpager);

		pager.setAdapter(pageAdapter);
		
		pager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener(){
            @Override
            public void onPageSelected(int position) {
            	clearPageIndicator();
            	switch (position) {
            	case 0:
            		imgSPDot1.setImageResource(R.drawable.dot_inactive);
            		break;
            	case 1:
            		imgSPDot2.setImageResource(R.drawable.dot_inactive);
            		break; 
            	case 2:
            		imgSPDot3.setImageResource(R.drawable.dot_inactive);
            		break;
            	case 3:
            		imgSPDot4.setImageResource(R.drawable.dot_inactive);
            		break; 
            	default:
            		imgSPDot1.setImageResource(R.drawable.dot_inactive);
            		break;
            	}
            }			
		});
		
	}
	
	private List<Fragment> getFragments(){
		  List<Fragment> fList = new ArrayList<Fragment>();
		  fList.add(WelcomeMEFragment.newInstance("Missouri Expeditions"));		 
		  fList.add(EPSViewPageFragment.newInstance("Explore", "Sites of Historical and Cultural Heritage"));
		  fList.add(EPSViewPageFragment.newInstance("Plan", "Your Personalized Expeditions and Have Fun"));		   
		  fList.add(EPSViewPageFragment.newInstance("Share", "Your Experiences with Family and Friends"));
		 
		  return fList;
	}
	
	private void clearPageIndicator(){
		imgSPDot1.setImageResource(R.drawable.dot_active);
		imgSPDot2.setImageResource(R.drawable.dot_active);
		imgSPDot3.setImageResource(R.drawable.dot_active);
		imgSPDot4.setImageResource(R.drawable.dot_active);
	}
	
}
