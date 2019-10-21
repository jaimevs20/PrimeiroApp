package com.example.primeiroapp;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.primeiroapp.exemplo0.PrimeiraActivity;
import com.example.primeiroapp.exemplo1.CalculadoraActivity;
import com.example.primeiroapp.exemplo2.LayoutInflaterActivity;
import com.example.primeiroapp.exemplo3.RecursosActivity;
import com.example.primeiroapp.exemplo4.ComponentesActivity;
import com.example.primeiroapp.exemplo5.SpinnerListActivity;
import com.example.primeiroapp.exemplo7.WebViewActivity;

public class MainActivity extends AppCompatActivity{
    String[] exemplos = new String[] {"Exemplo 0", "Exemplo 1 - Soma", "Exemplo 2 - Inflater", "Exemplo 3 - Estilos",
            "Exemplo 4 - Componentes", "Exemplo 5 - Adapter", "Exemplo 7 - WebView"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listViewMain = (ListView) findViewById(R.id.listViewMain);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, exemplos);
        listViewMain.setAdapter(adapter);

        listViewMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Class classe = null;

                if (position == 0)
                    classe = PrimeiraActivity.class;
                else if (position == 1)
                    classe = CalculadoraActivity.class;
                else if (position == 2)
                    classe = LayoutInflaterActivity.class;
                else if (position == 3)
                    classe = RecursosActivity.class;
                else if (position == 4)
                    classe = ComponentesActivity.class;
                else if (position == 5)
                    classe = SpinnerListActivity.class;
                else if (position == 6)
                    classe = WebViewActivity.class;

                Intent it = new Intent(MainActivity.this, classe);
                startActivity(it);
            }
        });


/*
        Button btnExemplo0 = (Button) findViewById(R.id.btnExemplo0);
        Button btnExemplo1 = (Button) findViewById(R.id.btnExemplo1);
        Button btnExemplo2 = (Button) findViewById(R.id.btnExemplo2);
        Button btnExemplo3 = (Button) findViewById(R.id.btnExemplo3);
        Button btnExemplo4 = (Button) findViewById(R.id.btnExemplo4);
        Button btnExemplo5 = (Button) findViewById(R.id.btnExemplo5);
        Button btnExemplo7 = (Button) findViewById(R.id.btnExemplo7);

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

        btnExemplo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamaExemplo4();
            }
        });

        btnExemplo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamaExemplo5();
            }
        });

        btnExemplo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamaExemplo7();
            }
        });

 */
    }
/*
    private void chamaExemplo7() {
        Intent it = new Intent(this, WebViewActivity.class);
        startActivity(it);
    }

    private void chamaExemplo5() {
        Intent it = new Intent(this, SpinnerListActivity.class);
        startActivity(it);
    }

    private void chamaExemplo4() {
        Intent it = new Intent(this, ComponentesActivity.class);
        startActivity(it);
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

 */
}
