package com.nido.library;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LibActivity extends AppCompatActivity {

    private TextView libTextView;
    private Button libButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib);
    }

    @Override
    protected void onResume() {
        super.onResume();

        libTextView = findViewById(R.id.textView1);
        libButton = findViewById(R.id.button1);

        libButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                libTextView.setText("Changed TextView Text");
                libButton.setText("Changed Button Text");
            }
        });
    }
}