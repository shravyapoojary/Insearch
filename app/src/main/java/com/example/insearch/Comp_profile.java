package com.example.insearch;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Comp_profile extends AppCompatActivity {
ImageView back;
Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp_profile);

        back = findViewById(R.id.back1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Comp_profile.this, Company_Home.class);
                startActivity(intent);
            }

        });
        save=findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Comp_profile.this, Company_Home.class);
                Toast.makeText(Comp_profile.this,"Edit saved",Toast.LENGTH_LONG).show();
                startActivity(intent);
            }

        });
    }
}