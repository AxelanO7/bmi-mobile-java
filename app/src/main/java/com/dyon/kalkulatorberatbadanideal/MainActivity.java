package com.dyon.kalkulatorberatbadanideal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStart = findViewById(R.id.btnWelcome);

        btnStart.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, input.class));
        });
    }
}
