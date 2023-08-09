package com.example.todolist;

import

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.todolist.databinding.ActivityDatainset2Binding;...



public class DatainsetActivity2 extends AppCompatActivity {
  ActivityDatainset2Binding binding ;
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        binding=ActivityDatainset2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.putExtra( name: "title",binding.Title.getText().toString());
                intent.putExtra( name: "disp",binding.disp.getText().toString());
                setResult(RESULT_OK,intent);
                finish();
            }
        });


    }
}