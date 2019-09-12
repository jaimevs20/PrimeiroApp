package com.example.primeiroapp;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.primeiroapp.exemplo0.PrimeiraActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnExemplo0 = (Button) findViewById(R.id.btnExemplo0);

        btnExemplo0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chamaExemplo0();
                //Toast.makeText(MainActivity.this,"Ex 0 acionado",Toast.LENGTH_LONG).show();
            }
        });
    }

    private void chamaExemplo0() {
        Intent it = new Intent(this, PrimeiraActivity.class);
        startActivity(it);
    }
}
