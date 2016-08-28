package rbaselio.com.br.aulaandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import rbaselio.com.br.aulaandroid.controller.ClienteController;
import rbaselio.com.br.aulaandroid.model.ClienteBuilder;

public class MainActivity extends AppCompatActivity {


    private Button btnSalvar;
    private Button btnLimpar;

    private EditText editNome;
    private EditText editCidade;
    private EditText editUF;
    private EditText editProfissao;
    private EditText editEmpresa;
    private EditText editTelefone;
    private EditText editEmail;


    private ClienteController clienteController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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


        clienteController = new ClienteController();


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
        clienteController.salvarCliente(new ClienteBuilder()
                                            .setNome(editNome.getText().toString())
                                            .setCidade(editCidade.getText().toString())
                                            .setEmail(editEmail.getText().toString())
                                            .setEmpresa(editEmpresa.getText().toString())
                                            .setProfissao(editProfissao.getText().toString())
                                            .setTelefone(editTelefone.getText().toString())
                                            .setUf(editUF.getText().toString())
                                            .createCliente()
                                        );
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
}
