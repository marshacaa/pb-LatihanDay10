package com.example.latihan_day_10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.latihan_day_10.R;

public class CreateAccountActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman3);

        ImageButton emailSignUpButton = findViewById(R.id.emailSignUpButtoncreate);
        ImageButton googleSignUpButton = findViewById(R.id.googleSignUpButton);
        ImageButton facebookSignUpButton = findViewById(R.id.facebookSignUpButton);
        TextView alreadyHaveAccountText = findViewById(R.id.alreadyHaveAccountText);


        emailSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CreateAccountActivity.this, Halaman4Activity.class);
                startActivity(intent);
            }
        });


        googleSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        // Set listener untuk tombol Sign up with Facebook
        facebookSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        alreadyHaveAccountText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
