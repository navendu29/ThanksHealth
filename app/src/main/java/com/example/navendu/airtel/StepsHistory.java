package com.example.navendu.airtel;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class StepsHistory extends Fragment {

ItemAdapter i;
ListView gg;
Context jj;

ArrayList<Item> nav;

View v;
    public StepsHistory() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        v= inflater.inflate(R.layout.fragment_steps_history, container, false);
    //    v= inflater.inflate(R.layout.fragment_transactional_history, container, false);
nav=new ArrayList<Item>();
nav.add(new Item("21 july","1010101"));
        nav.add(new Item("22 july","1010101"));
        nav.add(new Item("23 july","1010101"));
        nav.add(new Item("24 july","1010101"));
        nav.add(new Item("22 july","1010101"));
        nav.add(new Item("23 july","1010101"));
        nav.add(new Item("24 july","1010101"));







        gg = v.findViewById(R.id.recyclerView);
//
        //    getActivity().getSupportActionBar().setTitle("CONTACTS");

jj=v.getContext();

                i = new ItemAdapter(nav,jj);
                gg.setAdapter(i);















        // Inflate the layout for this fragment
        return v;
    }
}
