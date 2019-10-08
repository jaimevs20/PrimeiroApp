package com.example.primeiroapp.exemplo4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

import com.example.primeiroapp.R;

public class ComponentesActivity extends AppCompatActivity {

    CheckBox cbWindowsPhone;
    CheckBox cbIOs;
    CheckBox cbAndroid;

    RadioGroup rgSexo;
    RadioButton rbFeminino;
    RadioButton rbMasculino;

    Switch switchNotificacoes;

    Button btnValores;

    EditText editTextSenha;
    EditText editTextTelefone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_componentes);

        cbAndroid = (CheckBox) findViewById(R.id.cbAndroid);
        cbWindowsPhone = (CheckBox) findViewById(R.id.cbWindowsPhone);
        cbIOs = (CheckBox) findViewById(R.id.cbIOs);
        switchNotificacoes = (Switch) findViewById(R.id.switchNotificacoes);
        btnValores = (Button) findViewById(R.id.btnValores);
        rgSexo = (RadioGroup) findViewById(R.id.rgSexo);

        rgSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                boolean fem = R.id.rbFeminino == checkedId;
                boolean masc = R.id.rbMasculino == checkedId;

                if(fem)
                    Toast.makeText(getApplicationContext(),"Feminino", Toast.LENGTH_LONG).show();
                else if(masc)
                    Toast.makeText(getApplicationContext(),"Maculino", Toast.LENGTH_LONG).show();
            }
        });

        cbAndroid.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(getApplicationContext(),"Android selecionado: "+isChecked, Toast.LENGTH_LONG).show();
            }
        });

        switchNotificacoes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(getApplicationContext(),"Notificações: "+isChecked, Toast.LENGTH_LONG).show();
            }
        });

        btnValores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),/* "SO's selecionados: "+getComboBox()+"\n"
                                + "Sexo selecionado: "+getSexo()+"\n"
                                +"Status de Notificações:  "+getStatusNotificacoes()+"\n" */
                        String.format("SO's selecionados: %s \n"
                                + "Sexo selecionado: %s \n"
                                +"Status de Notificações: %s",
                                getComboBox(),
                        getSexo(),
                        getStatusNotificacoes()), Toast.LENGTH_LONG).show();
            }
        });

    }

    private String getStatusNotificacoes() {
        if (switchNotificacoes.isChecked())
            return switchNotificacoes.getTextOn().toString();
        else
            return switchNotificacoes.getTextOff().toString();
    }

    private String getSexo() {
        int idSelecionado = rgSexo.getCheckedRadioButtonId();

        if (idSelecionado == -1)
            return "";
        RadioButton radioButton = (RadioButton) findViewById(idSelecionado);

        return radioButton.getText().toString();
    }

    private String getComboBox() {
        String retorno="";

        if(cbAndroid.isChecked())
            retorno+=cbAndroid.getText().toString();
        if(cbWindowsPhone.isChecked())
            retorno+=cbWindowsPhone.getText().toString();
        if(cbIOs.isChecked())
            retorno+=", "+cbIOs.getText().toString();

        return retorno;

    }
}
