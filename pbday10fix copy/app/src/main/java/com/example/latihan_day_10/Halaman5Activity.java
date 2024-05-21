package com.example.latihan_day_10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.latihan_day_10.R;

public class Halaman5Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman5); // Pastikan halaman5.xml ada di direktori res/layout

        // Inisialisasi elemen UI
        Button skipButton = findViewById(R.id.skipButton);

        // Set listener untuk tombol "Skip"
        skipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigasi ke halaman6.xml
                Intent intent = new Intent(Halaman5Activity.this, Halaman6Activity.class);
                startActivity(intent);
            }
        });
    }
}
