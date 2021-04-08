package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
//Dibuat Oleh Enrico Anderson 10118353 IF8
//8 April 2021
public class LoginActivity extends AppCompatActivity {

    private Button btnLogin;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btn_login);
        btnRegister = findViewById(R.id.btn_register);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        }


        );
        btnRegister.setOnClickListener(new View.OnClickListener() {

         @Override
         public void onClick(View v) {
             Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
             startActivity(intent);
             }
         }


        );

    }








}