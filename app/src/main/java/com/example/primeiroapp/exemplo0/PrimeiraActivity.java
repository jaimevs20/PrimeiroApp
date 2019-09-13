package com.example.primeiroapp.exemplo0;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.primeiroapp.R;

public class PrimeiraActivity extends CicloDeVida {
    EditText editTextIda;
    Button btnMudarTela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);

        btnMudarTela = (Button) findViewById(R.id.btnSegundaTela);
        editTextIda = (EditText) findViewById(R.id.editTextIda);

        btnMudarTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    chamarTela();
            }
        });
    }

    private void chamarTela() {
        Intent it = new Intent(this, SegundaActivity.class);
        it.putExtra("Param_ida", editTextIda.getText().toString());
        startActivity(it);
    }
}
