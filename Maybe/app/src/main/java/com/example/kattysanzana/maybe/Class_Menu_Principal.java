package com.example.kattysanzana.maybe;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Class_Menu_Principal extends AppCompatActivity {


    Button buttonLogin;
    Button buttonRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class__menu__principal);



        buttonLogin = (Button) findViewById(R.id.button_login);
        buttonRegister = (Button) findViewById(R.id.button_register);

        //INLINE

        buttonLogin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {

                //Ejecución del botón

                Intent button_Login =  new Intent(Class_Menu_Principal.this, LoginActivity.class);
                startActivity(button_Login);







            }

        });
    }
}