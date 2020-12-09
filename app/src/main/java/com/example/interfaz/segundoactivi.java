package com.example.interfaz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class segundoactivi extends AppCompatActivity {
    EditText txtNombre, txtTel, txtEmail, txtContraseña;
    Button btnGuardar, btnCancel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_third);
        txtNombre = (EditText) findViewById(R.id.txtName);
        txtTel = findViewById(R.id.txtPhone);
        txtEmail = findViewById(R.id.txtEmail);
        txtContraseña = findViewById(R.id.txtPass);
        btnGuardar = (Button) findViewById(R.id.button6);
        btnCancel = findViewById(R.id.btnCancelar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usuario obj = new usuario(txtNombre.getText().toString(),txtTel.getText().toString(),
                        txtEmail.getText().toString(),txtContraseña.getText().toString());
                Intent intent = new Intent(segundoactivi.this,terceractiv.class);
                intent.putExtra("Datos", obj);
                startActivity(intent);
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
