package com.example.mynewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Button mButton = findViewById(R.id.btn_test5);
/*
给mButton添加点击事件监听
*/
        mButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
/*
显式Intent
*/
                Intent intent = new Intent(ThirdActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}