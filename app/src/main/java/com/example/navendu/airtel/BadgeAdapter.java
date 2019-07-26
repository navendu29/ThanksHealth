package com.example.navendu.airtel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by navendu on 25/7/19.
 */

public class BadgeAdapter extends ArrayAdapter<BadgeItem> {




    private ArrayList<BadgeItem> dataSet;
    Context mContext;

    // View lookup cache
    private static class ViewHolder {
        TextView txt1;
        ImageView txt2;
        // ImageView info;
    }



    public BadgeAdapter(ArrayList<BadgeItem> data, Context context) {
        super(context, R.layout.badge_item, data);
        this.dataSet = data;
        this.mContext=context;

    }

    private int lastPosition = -1;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        BadgeItem dataModel = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        BadgeAdapter.ViewHolder viewHolder; // view lookup cache stored in tag

        final View result;

        if (convertView == null) {

            viewHolder = new BadgeAdapter.ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.badge_item, parent, false);
            viewHolder.txt1 = (TextView) convertView.findViewById(R.id.t);
            viewHolder.txt2 = (ImageView) convertView.findViewById(R.id.ii);
//            viewHolder.info = (ImageView) convertView.findViewById(R.id.item_info);

            result=convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (BadgeAdapter.ViewHolder) convertView.getTag();
            result=convertView;
        }

        lastPosition = position;

        viewHolder.txt1.setText(dataModel.getName());

        viewHolder.txt2.setImageResource(dataModel.getId());

        // viewHolder.info.setOnClickListener(this);
        // viewHolder.info.setTag(position);
        // Return the completed view to render on screen
        return convertView;
    }





}
