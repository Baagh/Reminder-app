package com.example.marodikro.reminderapp;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView mNumber=(TextView)findViewById(R.id.mnumber);
        final TextView result=(TextView)findViewById(R.id.result);

        new CountDownTimer(10000,1000){
           public void onTick(long millisecondUntilDone){
             mNumber.setText("Time : " + String.valueOf(millisecondUntilDone/1000));
           }
           public void onFinish(){
               result.setText("Done!!!");
           }
        }.start();
    }
}
