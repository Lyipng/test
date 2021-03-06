package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String MESSAGE_STRING = "com.example.test";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);

        final EditText edit = findViewById(R.id.edit);
        Button bt = findViewById(R.id.bt_send);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = edit.getText().toString();
                Intent intent = new Intent(MainActivity.this,MessageActivity.class);
                intent.putExtra(MESSAGE_STRING,message);
                startActivity(intent);
            }
        });

    }

}