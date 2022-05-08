package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        TextView tv = findViewById(R.id.tv);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.MESSAGE_STRING);
        if(message != null){
            if(tv != null){
                tv.setText(message);
            }
        }
    }
}