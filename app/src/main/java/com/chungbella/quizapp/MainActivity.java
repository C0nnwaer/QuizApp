package com.chungbella.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    Button submitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton = findViewById(R.id.clickButton);
        submitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.i("testButton", "Hey what's up!");
            }
        });
    }
}
