package com.example.app_indice_imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_peso);
        et2 = (EditText)findViewById(R.id.txt_altura);
        tv1 = (TextView)findViewById(R.id.txt_status);

    }
    public void calcular(View v){

        float peso = Float.parseFloat(et1.getText().toString());
        float altura = Float.parseFloat(et2.getText().toString());

        float resultado = peso/(altura*altura);

        if (resultado < 18.5){

            tv1.setText("Abaixo do Peso "+ resultado);

        }else if(resultado <= 24.9) {

            tv1.setText("Peso Normal "+ resultado);

        }else if (resultado <= 29.9){

            tv1.setText("Sobrepeso "+ resultado);

        }else if (resultado <= 34.9){

            tv1.setText("Obesidade grau I "+ resultado);

        }else if (resultado <= 39.9){

            tv1.setText("Obesidade grau II "+ resultado);

        }else{

            tv1.setText("Obesidade grau III "+ resultado);

        }

    }

}
