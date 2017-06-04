package com.example.diegoandres.uniremingtonmanizales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

public class Plataformas extends AppCompatActivity {

    Button btnq10, btncorreo, btnmoodle;
    ImageView btnhome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plataformas);

        btnhome = (ImageView)findViewById(R.id.btnhome);
        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btnmoodle = (Button)findViewById(R.id.btnmoodle);
        btnmoodle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intmoodle = new Intent(Plataformas.this, Moodle.class);
                startActivity(intmoodle);
            }
        });

        btnq10 = (Button)findViewById(R.id.btnq10);
        btnq10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intq10 = new Intent(Plataformas.this, Q10.class);
                startActivity(intq10);
            }
        });

        btncorreo = (Button)findViewById(R.id.btncorreo);
        btncorreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intcorreo = new Intent(Plataformas.this, Correo.class);
                startActivity(intcorreo);
            }
        });


    }
}
