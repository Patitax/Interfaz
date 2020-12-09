package com.example.interfaz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class terceractiv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_second);
        Intent intent = getIntent();
        usuario obj = (usuario) intent.getSerializableExtra("Datos");
        String nom = obj.getNombre().toString();
        Toast.makeText(this,"Bienvenido "+nom,Toast.LENGTH_LONG).show();
    }
}
