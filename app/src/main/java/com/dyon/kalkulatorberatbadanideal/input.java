package com.dyon.kalkulatorberatbadanideal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class input extends AppCompatActivity {
    EditText etTinggi, etBerat;
    RadioButton rbLaki, rbPerempuan;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        etTinggi = findViewById(R.id.etInput1);
        etBerat = findViewById(R.id.etInput2);
        rbLaki = findViewById(R.id.rbInput1);
        rbPerempuan= findViewById(R.id.rbInput2);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(v -> {
            String strTinggi = etTinggi.getText().toString();
            int tinggi = Integer.parseInt(strTinggi);
            String strBerat = etBerat.getText().toString();
            int berat = Integer.parseInt(strBerat);
            boolean laki = rbLaki.isChecked();
            boolean perempuan = rbPerempuan.isChecked();
            String hasil = "";

            if (laki){
                hasil = String.valueOf((tinggi - 100) * 90 / 100);
            }
            if (perempuan) {
                hasil = String.valueOf((tinggi - 100) * 80 / 100);
            }
            Intent intent = new Intent(input.this, output.class);
            intent.putExtra("hasil", hasil);
            startActivity(intent);
//            Intent intent = new Intent(input.this, output.class);
//            intent.putExtra("tinggi", etTinggi.getText().toString());
//            intent.putExtra("berat", etBerat.getText().toString());
//            intent.putExtra("laki", rbLaki.isChecked());
//            intent.putExtra("perempuan", rbPerempuan.isChecked());
//            startActivity(intent);
        });
    }
}
