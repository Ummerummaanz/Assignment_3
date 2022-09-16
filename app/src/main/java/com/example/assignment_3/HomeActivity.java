package com.example.assignment_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
           private TextView tvToast;
           private TextView  tvCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Intent intent = getIntent();
        String name = getIntent().getExtras().getString("nkey");

        tvToast = findViewById(R.id.tvToast);
        tvToast.setText(name);

        String count = getIntent().getExtras().getString("ckey");

        tvCount = findViewById(R.id.tvCount);
        tvCount.setText(count);

    }

}