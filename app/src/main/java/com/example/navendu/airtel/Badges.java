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

public class Badges extends Fragment {


    BadgeAdapter i;
    ListView gg;
    Context jj;

    ArrayList<BadgeItem> nav;

    View v;

    public Badges() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        v= inflater.inflate(R.layout.fragment_badges, container, false);
        //    v= inflater.inflate(R.layout.fragment_transactional_history, container, false);
        nav=new ArrayList<BadgeItem>();
        nav.add(new BadgeItem("health",R.drawable.health1));

        nav.add(new BadgeItem("health",R.drawable.airtel));
        nav.add(new BadgeItem("traveller",R.drawable.health));
        nav.add(new BadgeItem("Foodie",R.drawable.airtel));
        nav.add(new BadgeItem("Netolcolic",R.drawable.health1));
        nav.add(new BadgeItem("Spender",R.drawable.airtel));







        gg = v.findViewById(R.id.recyclerView33);
//
        //    getActivity().getSupportActionBar().setTitle("CONTACTS");

        jj=v.getContext();

        i = new BadgeAdapter(nav,jj);
        gg.setAdapter(i);















        // Inflate the layout for this fragment
        return v;

    }

}
