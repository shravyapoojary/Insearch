package com.example.insearch;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Internship extends AppCompatActivity {
Button add;
ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internship);
        add=findViewById(R.id.add);
        add.setOnClickListener(v -> {
            Toast.makeText(Internship.this,"Internship added successfully",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Internship.this, Company_Home.class);
            startActivity(intent);
        });
        back=findViewById(R.id.back);
        back.setOnClickListener(v -> {
            Intent intent = new Intent(Internship.this, Company_Home.class);
            startActivity(intent);
        });

    }
}