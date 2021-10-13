package com.nido.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.nido.library.LibActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    public void openActivity(View view) {
        startActivity(new Intent(this,CustomUIActivity.class));
    }


    public void openLibActivity(View view) {
        startActivity(new Intent(this,LibActivity.class));
    }
}