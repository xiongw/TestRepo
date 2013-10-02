package com.esri.mhc.uiproto;

import java.util.List;

import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.esri.mhc.model.ExpeditionVO;

public class ExpeditionArrayAdapter extends ArrayAdapter<ExpeditionVO> {
	private Activity context;
	private List<ExpeditionVO> items;

	public ExpeditionArrayAdapter(Activity context, List<ExpeditionVO> items) {
		super(context, R.layout.expedition_list_item, items);
		// TODO Auto-generated constructor stub
		this.context = context;
		this.items = items;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View rowView;
		ViewHolder holder;
		ExpeditionVO item;

		if (convertView == null) {
			LayoutInflater inflater = context.getLayoutInflater();
			rowView = inflater.inflate(R.layout.expedition_list_item, null);
			ViewHolder viewHolder = new ViewHolder();
			viewHolder.txtVWExpeditionName = (TextView) rowView
					.findViewById(R.id.txtVWExpeditionName);
			viewHolder.txtVWExpeditionSite = (TextView) rowView
					.findViewById(R.id.txtVWExpeditionSite);
			rowView.setTag(viewHolder);
		} else {
			rowView = convertView;
		}

		holder = (ViewHolder) rowView.getTag();
		item = items.get(position);
		
		// set controls
		holder.txtVWExpeditionName.setText(item.getName());
		holder.txtVWExpeditionSite.setText(item.getSite());
		
		int i=position % 6;
		switch (i) {
		case 0:
			rowView.setBackgroundColor(Color.parseColor("#088A08"));
			break;
		case 1:
			rowView.setBackgroundColor(Color.parseColor("#2B74BD"));
			break;
		case 2:
			rowView.setBackgroundColor(Color.parseColor("#E77471"));
			break;
		case 3:
			rowView.setBackgroundColor(Color.parseColor("#EAC117"));
			break;
		case 4:
			rowView.setBackgroundColor(Color.parseColor("#B6B6B4"));
			break;
		case 5:
			rowView.setBackgroundColor(Color.parseColor("#1569C7"));
			break;	
		default:
			rowView.setBackgroundColor(Color.parseColor("#088A08"));
			break;
		}

		return rowView;
	}

	private static class ViewHolder {
		public TextView txtVWExpeditionName;
		public TextView txtVWExpeditionSite;
	}
}
