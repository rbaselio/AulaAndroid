package rbaselio.com.br.aulaandroid.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import rbaselio.com.br.aulaandroid.R;
import rbaselio.com.br.aulaandroid.controller.ClienteController;
import rbaselio.com.br.aulaandroid.dataSouce.DataSource;

public class ConsultarClienteActivity extends AppCompatActivity {

    private ClienteController cliente;
    List<String> nomes = new ArrayList<>();
    ListView listView;
    ArrayAdapter<String> clienteAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_cliente);

        cliente = new ClienteController();
        nomes = cliente.listarDados();

        listView = (ListView) findViewById(R.id.lvClientes);

        clienteAdapter = new ArrayAdapter<>(this, R.layout.detalhe_cliente, nomes);
        listView.setAdapter(clienteAdapter);
    }
}
