package com.example.navendu.airtel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();

        ImageView i2 = (ImageView) findViewById(R.id.im1);
        Picasso.with(this)
                .load(R.drawable.health)
                .into(i2);

        ImageView i3 = (ImageView) findViewById(R.id.im2);
        Picasso.with(this)
                .load(R.drawable.airtel1)
                .into(i3);



        Thread myth = new Thread() {
            public void run() {
                try {
                    sleep(1000);
                    Intent i = new Intent(getApplicationContext(), Login.class);
                    startActivity(i);
                    finish();

                } catch (InterruptedException e) {


                }


            }

        };

        myth.start();
    }
}
