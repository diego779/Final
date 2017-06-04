package com.example.diegoandres.uniremingtonmanizales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Principal extends AppCompatActivity {

    ImageView btnsalir;
    Button Sedes, Ubicacion, Comunidad, Programas, Admisiones, Uniremington;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Uniremington = (Button)findViewById(R.id.btnuniremington);
        Uniremington.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intuniremington = new Intent(Principal.this, Uniremington.class);
                startActivity(intuniremington);
            }
        });

        Admisiones = (Button)findViewById(R.id.btnadmisiones);
        Admisiones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intadmisiones = new Intent(Principal.this, Programas.class);
                startActivity(intadmisiones);
            }
        });

        Programas = (Button)findViewById(R.id.btnprogramas);
        Programas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intprogramas = new Intent(Principal.this, Programas.class);
                startActivity(intprogramas);
            }
        });


        Comunidad = (Button)findViewById(R.id.btncomunidad);
        Comunidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intcomunidad = new Intent(Principal.this, Comunidad.class);
                startActivity(intcomunidad);
            }
        });

        Ubicacion = (Button)findViewById(R.id.btnubicacion);
        Ubicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intubicacion = new Intent(Principal.this, Ubicacion.class);
                startActivity(intubicacion);
            }
        });


        Sedes = (Button)findViewById(R.id.btnsedes);
        Sedes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intsedes = new Intent(Principal.this, Sedes.class);
                startActivity(intsedes);
            }
        });




        btnsalir = (ImageView)findViewById(R.id.btnsalir);
        btnsalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intsalir = new Intent(Intent.ACTION_MAIN);
                intsalir.addCategory(Intent.CATEGORY_HOME);
                intsalir.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intsalir);

            }
        });

    }
}
