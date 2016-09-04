package rbaselio.com.br.aulaandroid.controller;

import android.widget.EditText;

import java.util.HashMap;

import rbaselio.com.br.aulaandroid.model.Cliente;


public class ClienteController {
    private Cliente cliente;



    public void limparCliente() {
        if (this.cliente == null) return;

        this.cliente.setNome("");
        this.cliente.setCidade("");
        this.cliente.setUf("");
        this.cliente.setProfissao("");
        this.cliente.setEmail("");
        this.cliente.setTelefone("");
        this.cliente.setEmail("");
    }

    @Override
    public String toString() {
        return cliente.toString();
    }

    public void salvarCliente(HashMap<String, EditText> myMap) {
        if (this.cliente == null) cliente = new Cliente();

        cliente.setNome(myMap.get("editNome").getText().toString());
        cliente.setCidade(myMap.get("editCidade").getText().toString());
        cliente.setEmail(myMap.get("editUF").getText().toString());
        cliente.setEmpresa(myMap.get("editEmpresa").getText().toString());
        cliente.setProfissao(myMap.get("editProfissao").getText().toString());
        cliente.setTelefone(myMap.get("editTelefone").getText().toString());
        cliente.setUf(myMap.get("editEmail").getText().toString());

    }
}
