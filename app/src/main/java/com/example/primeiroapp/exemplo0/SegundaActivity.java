package com.example.primeiroapp.exemplo0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.primeiroapp.R;

public class SegundaActivity extends Debug {
    TextView txtRecebido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        txtRecebido = (TextView) findViewById(R.id.textRecebido);

        Bundle bundle = getIntent().getExtras();
        txtRecebido.setText(bundle.getString("Param_ida"));
    }
}
