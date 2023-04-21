package com.example.pomoshchnikvozhatogo;

import static com.example.pomoshchnikvozhatogo.R.id.beginning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    Button beginning, senior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


    }
}