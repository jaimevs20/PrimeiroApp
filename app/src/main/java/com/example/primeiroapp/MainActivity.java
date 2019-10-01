package com.example.primeiroapp;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.primeiroapp.exemplo0.PrimeiraActivity;
import com.example.primeiroapp.exemplo1.CalculadoraActivity;
import com.example.primeiroapp.exemplo2.LayoutInflaterActivity;
import com.example.primeiroapp.exemplo3.RecursosActivity;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnExemplo0 = (Button) findViewById(R.id.btnExemplo0);
        Button btnExemplo1 = (Button) findViewById(R.id.btnExemplo1);
        Button btnExemplo2 = (Button) findViewById(R.id.btnExemplo2);
        Button btnExemplo3 = (Button) findViewById(R.id.btnExemplo3);

        btnExemplo0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chamaExemplo0();
                //Toast.makeText(MainActivity.this,"Ex 0 acionado",Toast.LENGTH_LONG).show();
            }
        });

        btnExemplo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamaExemplo1();
            }
        });

        btnExemplo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamaExemplo2();
            }
        });

        btnExemplo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamaExemplo3();
            }
        });
    }

    private void chamaExemplo3() {
        Intent it = new Intent(this, RecursosActivity.class);
        startActivity(it);
    }

    private void chamaExemplo2() {
        Intent it = new Intent(this, LayoutInflaterActivity.class);
        startActivity(it);
    }

    private void chamaExemplo1() {
        Intent it = new Intent(this, CalculadoraActivity.class);
        startActivity(it);
    }

    private void chamaExemplo0() {
        Intent it = new Intent(this, PrimeiraActivity.class);
        startActivity(it);
    }
}
