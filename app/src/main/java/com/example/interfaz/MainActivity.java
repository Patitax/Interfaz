package com.example.interfaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtUsuario, txtContraseña;
    Button btnLogin, btnRegister;
    int num = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsuario = (EditText) findViewById(R.id.editText);
        txtContraseña = findViewById(R.id.editText1);
        btnLogin = (Button) findViewById(R.id.button);
        btnRegister = findViewById(R.id.button2);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num++;
                Intent intent = new Intent(MainActivity.this, segundoactivi.class);
                startActivity(intent);
            }
        });
    }

}