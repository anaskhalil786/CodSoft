package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SpActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp);
        Handler handler=new Handler() ;
        handler  .postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SpActivity2.this, MainActivity.class));
                finish();
            }
        },delayMills: 3000);
    }
}