package com.example.primeiroapp.exemplo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.primeiroapp.R;

public class CalculadoraActivity extends AppCompatActivity {
    EditText editText1, editText2;
    Button btnSoma;
    TextView txtXml, txtJava;
    LinearLayout linearXml,linearJava;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        linearXml = (LinearLayout) findViewById(R.id.linearXml);
        txtXml = (TextView) findViewById(R.id.txtXml);
        btnSoma = (Button) findViewById(R.id.btnSoma);

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                efetuarSoma();
            }
        });

    }

    private void efetuarSoma() {
        String soma = getSoma();

        if(!soma.isEmpty()){
            linearXml.setVisibility(View.VISIBLE);
            txtXml.setText(soma);
        }
    }

    private String getSoma() {
        String num1 = editText1.getText().toString(),num2 = editText2.getText().toString();


        if(!num1.isEmpty() && !num2.isEmpty()) {
            int numero1 = Integer.parseInt(num1);
            int numero2 = Integer.parseInt(num2);

            return String.valueOf(numero1+numero2);
        }
        else
            return "";
    }
}
