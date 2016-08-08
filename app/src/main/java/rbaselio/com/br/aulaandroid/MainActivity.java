package rbaselio.com.br.aulaandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

    private Cliente objCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout_solucao);

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
            criaCliente();
            Toast.makeText(getApplicationContext(), objCliente.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        btnLimpar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
            limpar((ViewGroup)findViewById(R.id.formulario));
            Toast.makeText(getApplicationContext(), "Formulario limpo", Toast.LENGTH_SHORT).show();
            }
        });



    }

    private void criaCliente(){
        objCliente = new ClienteBuilder().setNome(editNome.getText().toString())
                                        .setCidade(editCidade.getText().toString())
                                        .setEmail(editEmail.getText().toString())
                                        .setEmpresa(editEmpresa.getText().toString())
                                        .setProfissao(editProfissao.getText().toString())
                                        .setTelefone(editTelefone.getText().toString())
                                        .setUf(editUF.getText().toString())
                                        .createCliente();
    }

    public void limpar(ViewGroup group) {
        objCliente = null;
        int count = group.getChildCount();
        for (int i = 0; i < count; i++) {
            View view = group.getChildAt(i);
             if (view instanceof EditText) {
                ((EditText)view).setText("");
            }
        }
    }
}
