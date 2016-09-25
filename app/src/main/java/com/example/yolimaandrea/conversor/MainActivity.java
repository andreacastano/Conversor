package com.example.yolimaandrea.conversor;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ePesos;
    EditText eDolares;
    Button bConvertir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ePesos= (EditText)findViewById(R.id.ePesos);
        eDolares= (EditText)findViewById(R.id.eDolares);
        bConvertir= (Button) findViewById(R.id.bconvertir);


    bConvertir.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){
        Double pesos,dolares;
            pesos = Double.parseDouble(ePesos.getText().toString());
            dolares=pesos/2900;
            eDolares.setText(dolares.toString());

        }
    });
    }
}
