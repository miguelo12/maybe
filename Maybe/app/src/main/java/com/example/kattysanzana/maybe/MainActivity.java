package com.example.kattysanzana.maybe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {
    private long splashRetraso = 1000;//Esto es para los segundos que se va a retrasar en milisegundos

    @Override
    protected void onCreate(Bundle savedInstances) {
        super.onCreate(savedInstances);
        setContentView(R.layout.class__splash);

        TimerTask task = new TimerTask() {


            @Override
            public void run() {
                Intent NuevoLayout;
                NuevoLayout = new Intent(MainActivity.this, Class_Menu_Principal.class);
                startActivity(NuevoLayout);

                MainActivity.this.finish();

            }
        };

        Timer timer = new Timer();
        timer.schedule(task, splashRetraso);
    }
}



