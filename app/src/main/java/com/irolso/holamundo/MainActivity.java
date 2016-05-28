package com.irolso.holamundo;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Chronometer cronometro = (Chronometer) findViewById(R.id.chronometer);
        cronometro.stop();
        TextView inicio = (TextView) findViewById(R.id.hello1);

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cronometro.start();

            }
        });


    }
}
