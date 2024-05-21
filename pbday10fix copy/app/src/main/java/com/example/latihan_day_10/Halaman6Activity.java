package com.example.latihan_day_10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.latihan_day_10.R;

public class Halaman6Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman6); // Pastikan halaman6.xml ada di direktori res/layout

        Button continueButton = findViewById(R.id.continueButton);

        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigasi ke halaman7.xml
                Intent intent = new Intent(Halaman6Activity.this, Halaman7Activity7.class);
                startActivity(intent);
            }
        });
    }
}
