package com.example.adrianch.eva2_5_intents_paso_parametros_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Principal extends AppCompatActivity {

    Button btn;
    EditText editxtparam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        btn = (Button) findViewById(R.id.btn);
        editxtparam = (EditText) findViewById(R.id.editxtparam);
    }

    public void enClick(View v) {
        Intent enviarString = new Intent(this, Secundaria.class);
        String mensaje = editxtparam.getText().toString();
        enviarString.putExtra("textoEnviado", mensaje);
        startActivity(enviarString);
    }
}
