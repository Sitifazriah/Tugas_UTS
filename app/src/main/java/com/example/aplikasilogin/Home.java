package com.example.aplikasilogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Home extends AppCompatActivity {
    private ImageView jadwal, daftar, kasir, farmasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        jadwal = (ImageView) findViewById(R.id.jadwal);
        daftar = (ImageView) findViewById(R.id.pasien);
        kasir = (ImageView) findViewById(R.id.kasir);

        jadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, JadwalDokter.class);
                startActivity(intent);

            }
        });


        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Pendaftaran.class);
                startActivity(intent);

            }
        });

        kasir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, DaftarJanji.class);
                startActivity(intent);

            }
        });


    }
}
