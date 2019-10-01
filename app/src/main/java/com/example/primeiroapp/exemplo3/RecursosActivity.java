package com.example.primeiroapp.exemplo3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.primeiroapp.R;

public class RecursosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recursos);

        TextView txtTexto = (TextView) findViewById(R.id.txtTexto);

        txtTexto.setText(R.string.lbl_texto);
    }
}
