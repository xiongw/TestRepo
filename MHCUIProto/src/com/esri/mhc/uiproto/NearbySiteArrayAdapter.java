package com.esri.mhc.uiproto;

import java.util.List;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.esri.mhc.model.NearbySiteVO;


public class NearbySiteArrayAdapter extends ArrayAdapter<NearbySiteVO> {
	
	private Activity context;
	private List<NearbySiteVO> items;
	
	public NearbySiteArrayAdapter(Activity context, 
			List<NearbySiteVO> items) {
		super(context, R.layout.nearby_list_item, items);
		// TODO Auto-generated constructor stub
		this.context=context;
		this.items=items;
	}
	
	   @Override
		public View getView(int position, View convertView, ViewGroup parent) {
	    	View rowView;
	    	ViewHolder holder;
	    	NearbySiteVO item;

	    	if (convertView==null) {
	        	LayoutInflater inflater = context.getLayoutInflater();
	            rowView = inflater.inflate(R.layout.nearby_list_item, null);
	            ViewHolder viewHolder = new ViewHolder();
	            viewHolder.txtVWName=(TextView)rowView.findViewById(R.id.txtVwNearbySiteName);
	            viewHolder.txtVWMile=(TextView)rowView.findViewById(R.id.txtVWNearbySiteMile);
	            viewHolder.txtWVChallenge=(TextView)rowView.findViewById(R.id.txtVWNearbySiteChallenges);
	            rowView.setTag(viewHolder);
	    	} else {
	    		rowView=convertView;
	    	}
	    	
	    	holder = (ViewHolder) rowView.getTag();
	    	item=items.get(position);
	    	
	    	//set controls
	    	holder.txtVWName.setText(item.getName());
	    	holder.txtVWMile.setText(item.getMile());
	    	holder.txtWVChallenge.setText(item.getChallenge());
	    	
	    	return rowView;
		}    
		
	    private static class ViewHolder {
	        public TextView txtVWName;
	        public TextView txtVWMile;
	        public TextView txtWVChallenge;
	 }
	
}
