package com.example.adrianch.eva2_5_intents_paso_parametros_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity {

    TextView txtSegun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        txtSegun = (TextView) findViewById(R.id.txtSegun);
        Intent recibirDatos = getIntent();
        String textoYaRecibido = recibirDatos.getStringExtra("textoEnviado");
        txtSegun.setText(""+textoYaRecibido);
    }
}
