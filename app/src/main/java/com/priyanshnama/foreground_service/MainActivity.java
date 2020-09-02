package com.priyanshnama.foreground_service;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextInput = findViewById(R.id.editText);

    }

    public void startService(View view){
        ContextCompat.startForegroundService(this,new Intent(
                this,ExampleService.class)
                .putExtra("inputExtra",editTextInput.getText().toString()));
    }

    public void stopService(View view){
        stopService(new Intent(this,ExampleService.class));
    }
}