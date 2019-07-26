package com.example.navendu.airtel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by navendu on 24/7/19.
 */

public class ItemAdapter extends ArrayAdapter<Item> {


    private ArrayList<Item> dataSet;
    Context mContext;

    // View lookup cache
    private static class ViewHolder {
        TextView txt1;
        TextView txt2;
        // ImageView info;
    }



    public ItemAdapter(ArrayList<Item> data, Context context) {
        super(context, R.layout.history_item, data);
        this.dataSet = data;
        this.mContext=context;

    }

    private int lastPosition = -1;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Item dataModel = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ItemAdapter.ViewHolder viewHolder; // view lookup cache stored in tag

        final View result;

        if (convertView == null) {

            viewHolder = new ItemAdapter.ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.history_item, parent, false);
            viewHolder.txt1 = (TextView) convertView.findViewById(R.id.tt1);
            viewHolder.txt2 = (TextView) convertView.findViewById(R.id.tt2);
//            viewHolder.info = (ImageView) convertView.findViewById(R.id.item_info);

            result=convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ItemAdapter.ViewHolder) convertView.getTag();
            result=convertView;
        }

        lastPosition = position;

        viewHolder.txt1.setText(dataModel.getDate());
        viewHolder.txt2.setText(dataModel.getValue());
        // viewHolder.info.setOnClickListener(this);
        // viewHolder.info.setTag(position);
        // Return the completed view to render on screen
        return convertView;
    }

}
