package com.example.primeiroapp.exemplo5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.primeiroapp.R;

public class SpinnerListActivity extends AppCompatActivity {
    ListView listViewPlanetas;
    Spinner spinnerEscolha;

    String [] opcoes = new String[]{"List view simples", "ListView customizado"};
    String [] planetas = new String[]{"Mercurio","Vênus","Terra","Marte",
            "Júpiter","Saturno","Urano","Netuno","Plutão"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_list);

        listViewPlanetas = (ListView) findViewById(R.id.listViewPlanetas);
        spinnerEscolha = (Spinner) findViewById(R.id.spinnerEscolha);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opcoes);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEscolha.setAdapter(arrayAdapter);

        spinnerEscolha.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Opção selecionada: "+ spinnerEscolha.getSelectedItem().toString(),Toast.LENGTH_LONG).show();

                if (position == 0)
                    chamaListViewSimples();
                else
                    chamaListViewCustomizado();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void chamaListViewCustomizado() {
        final AdapterPlanetas adapterListaCustomizado = new AdapterPlanetas(this, Planeta.getPlanetas());

        listViewPlanetas.setAdapter(adapterListaCustomizado);
        listViewPlanetas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String nomePlaneta = (String) adapterListaCustomizado.getItem(position);
                Toast.makeText(getApplicationContext(),nomePlaneta, Toast.LENGTH_LONG).show();
            }
        });
    }

    private void chamaListViewSimples() {
        final ArrayAdapter<String> adapterListaSimples = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, planetas);

        listViewPlanetas.setAdapter(adapterListaSimples);
        listViewPlanetas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String nomePlaneta = (String) adapterListaSimples.getItem(position);
                Toast.makeText(getApplicationContext(),nomePlaneta, Toast.LENGTH_LONG).show();
            }
        });
    }
}
