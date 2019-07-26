package com.example.navendu.airtel;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class Profile extends Fragment {
    public Profile() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment








/*

        Intent i=  getActivity().getIntent();

        racf=i.getStringExtra("rr");

        password=i.getStringExtra("rrr");
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(apiService.base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService api=retrofit.create(apiService.class);
        Call<Employee> call=api.getProfilehero(racf,password);
        call.enqueue(new Callback<Employee>() {
            @Override
            public void onResponse(Call<Employee> call, Response<Employee> response) {
                Employee b=response.body();

                v1.setText(b.getName()+"");
                v2.setText(b.getRacf()+"");
                v3.setText(b.getPhoneno()+"");
                v4.setText(b.getLeaves()+"");
                v5.setText(b.getLeavestaken()+"");
                v6.setText(b.getWorkfromhome()+"");



            }

            @Override
            public void onFailure(Call<Employee> call, Throwable t) {


                Toast.makeText(f, "No Internet Connection",
                        Toast.LENGTH_LONG).show();

            }
        });



*/


        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

}
