package com.example.primeiroapp.exemplo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.primeiroapp.R;

public class LayoutInflaterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_inflater);

        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayoutPrincipal);

        LayoutInflater inflater = LayoutInflater.from(this);

        LinearLayout linearLayout = (LinearLayout) inflater.inflate(R.layout.layout_inflate, relativeLayout, false);

        relativeLayout.addView(linearLayout);

        Button btnPlay = (Button) linearLayout.findViewById(R.id.btnPlay);
        Button btnVoltar = (Button) linearLayout.findViewById(R.id.btnVoltar);
        Button btnNext = (Button) linearLayout.findViewById(R.id.btnNext);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickPlay();
            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickVoltar();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickNext();
            }
        });
    }

    private void clickNext() {
        Toast.makeText(this, "Próximo",Toast.LENGTH_LONG).show();
    }

    private void clickVoltar() {
        Toast.makeText(this, "Anterior",Toast.LENGTH_LONG).show();
    }

    private void clickPlay() {
        Toast.makeText(this, "Play",Toast.LENGTH_LONG).show();
        
    }
}
