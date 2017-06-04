package com.example.diegoandres.uniremingtonmanizales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Principal extends AppCompatActivity {

    ImageView btnsalir;
    Button Sedes;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

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
