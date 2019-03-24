package com.example.timer;

import android.net.IpSecManager;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        final Handler handler = new Handler();
        Runnable run = new Runnable() {
            @Override
            public void run() {
                //Insert code to be run every second
                System.out.println("Runnable has run, and a second must have passed...");
                handler.postDelayed(this, 1000);
            }
        };
        handler.post(run);
        */

        new CountDownTimer(10000,1000){
          public void onTick(long milliSecondsUntilDone){
              //Countdown is couting down
              System.out.println("Seconds left" + String.valueOf(milliSecondsUntilDone/1000));
          }
          public void onFinish(){
              //Counter is finished after 10 seconds
              System.out.println("Done! Countdown timer finished");
          }
        }.start();
    }
}
