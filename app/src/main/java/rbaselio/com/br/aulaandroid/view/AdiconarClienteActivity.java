package rbaselio.com.br.aulaandroid.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

import rbaselio.com.br.aulaandroid.R;
import rbaselio.com.br.aulaandroid.controller.ClienteController;

public class AdiconarClienteActivity extends AppCompatActivity {
    private final String TAG= "MAIN";

    private Button btnSalvar;
    private Button btnLimpar;

    private EditText editNome;
    private EditText editCidade;
    private EditText editUF;
    private EditText editProfissao;
    private EditText editEmpresa;
    private EditText editTelefone;
    private EditText editEmail;


    private ClienteController clienteController = new ClienteController();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG,"onCreate-------"+this.getClass().getSimpleName());
        setContentView(R.layout.activity_main);

        btnSalvar = (Button) findViewById(R.id.btnSalvar);
        btnLimpar = (Button) findViewById(R.id.btnLimpar);

        editNome = (EditText)  findViewById(R.id.editNome);
        editCidade = (EditText)  findViewById(R.id.editCidade);
        editUF = (EditText)  findViewById(R.id.editUF);
        editProfissao = (EditText)  findViewById(R.id.editProfissao);
        editEmpresa = (EditText)  findViewById(R.id.editEmpresa);
        editTelefone = (EditText)  findViewById(R.id.editTelefone);
        editEmail = (EditText)  findViewById(R.id.editEmail);



        btnSalvar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
            salvaCliente();
            Toast.makeText(getApplicationContext(), clienteController.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        btnLimpar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
            limparCliente((ViewGroup)findViewById(R.id.formulario));
            Toast.makeText(getApplicationContext(), "Formulario limpo", Toast.LENGTH_SHORT).show();
            }
        });



    }

    private void salvaCliente(){
        HashMap<String, EditText> myMap = new HashMap<>();
        myMap.put("editNome", editNome);
        myMap.put("editCidade", editCidade);
        myMap.put("editUF", editUF);
        myMap.put("editProfissao", editProfissao);
        myMap.put("editEmpresa", editEmpresa);
        myMap.put("editTelefone", editTelefone);
        myMap.put("editEmail", editEmail);

        clienteController.salvarCliente(myMap);
    }

    public void limparCliente(ViewGroup group) {
        clienteController.limparCliente();
        int count = group.getChildCount();
        for (int i = 0; i < count; i++) {
            View view = group.getChildAt(i);
             if (view instanceof EditText) {
                ((EditText)view).setText("");
            }
        }
        editNome.requestFocus();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"onPause-------"+this.getClass().getSimpleName());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG,"onStop-------"+this.getClass().getSimpleName());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"onDestroy----"+this.getClass().getSimpleName());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"onResume-----"+this.getClass().getSimpleName());
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG,"onRestart----"+this.getClass().getSimpleName());
    }



}
