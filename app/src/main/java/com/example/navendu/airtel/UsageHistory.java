package com.example.navendu.airtel;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class UsageHistory extends Fragment {

    ItemAdapter i;
    ListView gg;
    Context jj;

    ArrayList<Item> nav;

    View v;
    public UsageHistory() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.fragment_usage_history, container, false);
        gg = v.findViewById(R.id.recyclerView1);




        nav=new ArrayList<Item>();
        nav.add(new Item("21 july","6"));
        nav.add(new Item("22 july","7"));
        nav.add(new Item("23 july","8"));
        nav.add(new Item("24 july","9"));







        //    getActivity().getSupportActionBar().setTitle("CONTACTS");

        jj=v.getContext();

        i = new ItemAdapter(nav,jj);
        gg.setAdapter(i);















        // Inflate the layout for this fragment
        return v;
    }

}
