package com.example.kattysanzana.maybe;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class MenuPrincipal extends Activity {

    Button buttonLogin;
    Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal);

        /**
        buttonLogin = (Button) findViewById(R.id.button_login);
        buttonRegister = (Button) findViewById(R.id.button_register);

        //INLINE

        buttonLogin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                //Ejecución del botón

                Intent button_Login =  new Intent(MenuPrincipal.this, LoginActivity.class);
                startActivity(button_Login);
            }

        });
        **/
    }
}