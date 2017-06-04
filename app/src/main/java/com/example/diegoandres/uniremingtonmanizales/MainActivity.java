package com.example.diegoandres.uniremingtonmanizales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText room, pass;
    private Button Inicio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        room = (EditText)findViewById(R.id.room);
        pass = (EditText)findViewById(R.id.pass);

        Inicio =(Button)findViewById(R.id.btnLogin);
        Inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usuario = room.getText().toString();
                String contraseña = pass.getText().toString();

                switch (v.getId()){
                    case R.id.btnLogin:
                        if (usuario.equals("diego")&&contraseña.equals("12345")){

                            Intent intingresar = new Intent(MainActivity.this, Principal.class);
                            startActivity(intingresar);
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "Información erronea", Toast.LENGTH_SHORT).show();
                        }
                }
            }
        });
    }
}
