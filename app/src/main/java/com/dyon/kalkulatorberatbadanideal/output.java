package com.dyon.kalkulatorberatbadanideal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class output extends AppCompatActivity {
    TextView tvHasil;
    String hasil = "Hasil Tidak Ditemukan";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);
        hasil = getIntent().getStringExtra("hasil");
        tvHasil = findViewById(R.id.tvOutput1);
        tvHasil.setText("Berat badan ideal\nanda adalah " + hasil + " kg");
    }
}
