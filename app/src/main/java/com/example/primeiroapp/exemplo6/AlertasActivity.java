package com.example.primeiroapp.exemplo6;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.primeiroapp.R;

public class AlertasActivity extends AppCompatActivity {

    Button btnToast;
    Button btnDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alertas);

        btnToast = (Button) findViewById(R.id.btnToast);
        btnDialog = (Button) findViewById(R.id.btnDialog);

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exibeToast();
            }
        });

        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //exibeAlertaNormal();
                exibeAlertaCustomizado();
            }
        });
    }

    private void exibeAlertaNormal() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(android.R.drawable.ic_menu_info_details);
        builder.setTitle("Título");
        builder.setMessage("Mensagem");

        builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Positivo", Toast.LENGTH_LONG).show();
            }
        });

        builder.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Negativo", Toast.LENGTH_LONG).show();
            }
        });

        builder.setNeutralButton("Talvez", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Talvez", Toast.LENGTH_LONG).show();
            }
        });

        //  builder.setCancelable(false); // se o usuário clicar fora, não fecha
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void exibeAlertaCustomizado() {
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.layout_alertas, null);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(android.R.drawable.ic_menu_info_details);
        builder.setTitle("Título");
        builder.setMessage("Mensagem");
        builder.setView(view);

        builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Positivo", Toast.LENGTH_LONG).show();
            }
        });

        builder.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Negativo", Toast.LENGTH_LONG).show();
            }
        });

        builder.setNeutralButton("Talvez", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Talvez", Toast.LENGTH_LONG).show();
            }
        });

        //  builder.setCancelable(false); // se o usuário clicar fora, não fecha
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void exibeToast() {
        LayoutInflater inflater = getLayoutInflater();

        View view = inflater.inflate(R.layout.layout_alertas, null);    //cria a instância da View com o layout criado
        Toast customToast = new Toast(this);    //instnaciando o Toast customizado
        customToast.setView(view);
        customToast.setDuration(Toast.LENGTH_LONG);
        customToast.show();
    }
}
