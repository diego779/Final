package com.example.diegoandres.uniremingtonmanizales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Sedes extends AppCompatActivity {

    Button Boyaca, Bucaramanga, Cucuta, Medellin, Manizales, Monteria, Pasto, Pereira, Yopal;
    ImageView btnhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sedes);

        Bucaramanga = (Button)findViewById(R.id.btnbucaramanga);
        Bucaramanga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intbucaramanga = new Intent(Sedes.this, Bucaramanga.class);
                startActivity(intbucaramanga);

            }
        });


        btnhome = (ImageView)findViewById(R.id.btnhome);
        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        Boyaca = (Button)findViewById(R.id.btnboyaca);
        Boyaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intboyaca = new Intent(Sedes.this, Boyaca.class);
                startActivity(intboyaca);
            }
        });

    }
}
