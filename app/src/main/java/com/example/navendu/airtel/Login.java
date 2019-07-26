package com.example.navendu.airtel;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Login extends AppCompatActivity {

    EditText e1;
    EditText e3;
    String phoneNumber="";
    String password="";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();
    }
    public  void navigate(final View view)
    {

        e1=findViewById(R.id.e1);
        e3=findViewById(R.id.e3);

        phoneNumber= e1.getText().toString();
password=e3.getText().toString();

        //Log.d(TAG, "navigate: ");

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(apiService.base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService api=retrofit.create(apiService.class);
        Call<Auth> call=api.getAuth(phoneNumber,password);
        call.enqueue(new Callback<Auth>() {
            @Override
            public void onResponse(Call<Auth> call, Response<Auth> response) {



                Auth b=response.body();

                String ss=b.getValue();

                if(ss.equals("true"))
                {


                    Intent i = new Intent(getApplicationContext(),MainActivity.class);

                    i.putExtra("rr",phoneNumber);
                    i.putExtra("rrr",password);


                    startActivity(i);


                    finish();
                }
                else
                {           Toast.makeText(getApplicationContext(), "invalid credentials.",
                        Toast.LENGTH_LONG).show();
                    e1.setError("invalid");
                    e3.setError("invalid");
                    Log.i("hello",e1.toString());
                    Log.i("hello",e3.toString());



                }





            }

            @Override
            public void onFailure(Call<Auth> call, Throwable t) {


                e1.setError("invalid");
                e3.setError("invalid");


                Toast.makeText(getApplicationContext(), "navendu",
                        Toast.LENGTH_SHORT).show();

            }
        });




    }
    public  void navigate1(final View view)
    {



        Intent i = new Intent(getApplicationContext(), Partner.class);
        startActivity(i);
        finish();



    }
}
