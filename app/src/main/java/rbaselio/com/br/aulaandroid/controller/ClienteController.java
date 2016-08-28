package rbaselio.com.br.aulaandroid.controller;

import rbaselio.com.br.aulaandroid.model.Cliente;

public class ClienteController {
    private Cliente cliente;

    public ClienteController(Cliente cliente){
        this.cliente = cliente;
    }
    public ClienteController(){

    }

    public void salvarCliente(Cliente cliente) {
        this.cliente = cliente;

    }

    public void limparCliente() {
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
        return "Cliente{" +
                "nome='" + this.cliente.getNome() + '\n' +
                ", cidade='" + this.cliente.getCidade() + '\n' +
                ", uf='" + this.cliente.getUf() + '\n' +
                ", profissao='" + this.cliente.getProfissao() + '\n' +
                ", empresa='" + this.cliente.getEmpresa() + '\n' +
                ", telefone='" + this.cliente.getTelefone() + '\n' +
                ", email='" + this.cliente.getEmail() + '\n' +
                '}';
    }

}
