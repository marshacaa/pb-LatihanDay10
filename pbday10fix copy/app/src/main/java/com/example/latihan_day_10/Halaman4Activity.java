package com.example.latihan_day_10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Halaman4Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman4);


        Button noThanksButton = findViewById(R.id.noThanksButton);


        noThanksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Halaman4Activity.this, Halaman5Activity.class);
                startActivity(intent);
            }
        });
    }
}
