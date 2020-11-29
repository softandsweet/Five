package com.example.mynewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mButton = findViewById(R.id.btn_test);
/*
mButton添加点击事件监听
*/
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecongActivity.class);
                startActivity(intent);
            }
        });
        mButton = findViewById(R.id.btn_test2);
/*
给mButton添加监听
*/
        mButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
/*
显式Intent，
*/
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
        Button myButton = (Button)findViewById(R.id.btn_test3);
        myButton.setOnClickListener(new View.OnClickListener(){
            /*
            添加监听

             */
            @Override
            public void onClick (View v){
                Toast.makeText(MainActivity.this,"暂无权限",Toast.LENGTH_SHORT).show();
            }//点击后弹出Toast显示“暂无权限”

        });
        myButton = (Button)findViewById(R.id.btn_test4);
        myButton.setOnClickListener(new View.OnClickListener(){
            /*
            添加监听

             */
            @Override
            public void onClick (View v){
                Toast.makeText(MainActivity.this,"暂无权限",Toast.LENGTH_SHORT).show();
            }//点击后弹出Toast显示“暂无权限”

        });












    }



}
