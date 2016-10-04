package rbaselio.com.br.aulaandroid.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import rbaselio.com.br.aulaandroid.R;
import rbaselio.com.br.aulaandroid.dataSouce.DataSource;

public class ConsultarClienteActivity extends AppCompatActivity {

    private DataSource ds;
    List<String> nomes = new ArrayList<>();
    ListView listView;
    ArrayAdapter<String> clienteAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_cliente);

        ds = new DataSource();
        nomes = ds.listarCLientes();

        listView = (ListView) findViewById(R.id.lvClientes);

        clienteAdapter = new ArrayAdapter<String>(this, R.layout.detalhe_cliente, nomes);
        listView.setAdapter(clienteAdapter);


    }
}
