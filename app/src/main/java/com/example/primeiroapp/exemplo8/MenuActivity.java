package com.example.primeiroapp.exemplo8;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.primeiroapp.R;
import com.example.primeiroapp.exemplo2.LayoutInflaterActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    //  INFLANDO O LAYOUT PAI (activity_menu_intent) COM O XML QUE CONTÉM O MENU
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }

    // AO CLICAR EM UM DOS ITENS AS SEGUINTES AÇÕES SERÃO REALIZADAS:
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if(id == R.id.acao_configuracoes){
            Intent intent = new Intent(this, LayoutInflaterActivity.class); // ABRE UMA ACTIVITY QUALQUER, NESTE CASO
            startActivity(intent);
        }

        else if(id == R.id.acao_abrir_browser){
            String url = "https://google.com";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }

        else if(id == R.id.acao_sobre){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);    // AS INFORMAÇÕES SERÃO DESCRITAS EM UM ALERT DIALOG

            builder.setTitle("Sobre o app");    // COM ESTE TÍTULO
            builder.setMessage("Uma mensagem qualquer e bla bla bla bla ...");  // E ESTA MENSAGEM
            builder.setPositiveButton("OK", null);  //BOTÃO DE CONFIRMAÇÃO - setNegative PARA O CONTRÁRIO E ASSIM POR DIANTE
            AlertDialog dialog = builder.create();  // CRIA-SE UM DIÁLOGO COM O QUE FOI CONSTRUÍDO NO CORPO DA JANELINHA
            dialog.show();  // EXIBE
        }

        else if(id == R.id.acao_compartilhar){
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plan");
            intent.putExtra(Intent.EXTRA_SUBJECT,"Compartilhar");   // ASSUNTO DA MENSAGEM
            intent.putExtra(Intent.EXTRA_TEXT, "Texto da Mensagem");    // CORPO DA MENSAGEM
            startActivity(intent);
        }

        else if (id == R.id.acao_sms){
            Uri uri = Uri.parse("sms:99887766");
            Intent intent = new Intent(Intent.ACTION_SENDTO, uri);  //ENVIAR PARA O PARÂMENTRO uri NESTE CASO
            intent.putExtra("sms_body", "Olá");  // CORPO DO SMS, NESTE CASO É "Olá"
            startActivity(intent);
        }

        else if (id == R.id.acao_ligar){
            showLigar();
        }
        return super.onOptionsItemSelected(item);
    }

    private void showLigar() {
        //VERIFICAR SE O USUÁRIO CONCEDEU A PERMISSÃO DE LIGAÇÃO
        int permissao = ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);

        if(permissao != PackageManager.PERMISSION_GRANTED){ // PERMISSÃO CONCEDIDA
            ActivityCompat.requestPermissions
                    (this, new String[]{Manifest.permission.CALL_PHONE},123);   // SOLICITA A PERMISSÃO, PASSANDO O REQUEST CODE (123)
        }
        else    // PERMISSÃO CONCEDIDA
            startActivity(new Intent(Intent.ACTION_CALL).setData(Uri.parse("tel:12345678901")));
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        if(requestCode == 123){
            if((grantResults.length > 0) && (grantResults[0]) == PackageManager.PERMISSION_GRANTED){
                showLigar();
            }
            else
                Toast.makeText(getApplicationContext(),"Permissão não concedida", Toast.LENGTH_LONG).show();
        }

        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

}
