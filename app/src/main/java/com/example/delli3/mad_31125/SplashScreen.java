package com.example.delli3.mad_31125;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        getSupportActionBar().hide();


        Thread myThread = new Thread()
        {
            @Override
            public void run() {
                try {
                    sleep(6000);

                   Intent intent = new Intent(getApplicationContext(), Home.class); 
                    startActivity(intent);
                    finish();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        myThread.start();
    }
}
