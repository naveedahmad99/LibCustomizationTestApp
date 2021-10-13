package com.nido.testapp;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.nido.library.LibActivity;

public class CustomUIActivity extends LibActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Here we are overriding our library ui
        setTitle("Custom Title");
        setContentView(R.layout.activity_custom);
    }
}
