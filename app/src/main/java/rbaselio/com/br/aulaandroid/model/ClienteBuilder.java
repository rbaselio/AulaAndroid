package rbaselio.com.br.aulaandroid.model;

public class ClienteBuilder {
    private String nome;
    private String cidade;
    private String uf;
    private String profissao;
    private String empresa;
    private String telefone;
    private String email;

    public ClienteBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public ClienteBuilder setCidade(String cidade) {
        this.cidade = cidade;
        return this;
    }

    public ClienteBuilder setUf(String uf) {
        this.uf = uf;
        return this;
    }

    public ClienteBuilder setProfissao(String profissao) {
        this.profissao = profissao;
        return this;
    }

    public ClienteBuilder setEmpresa(String empresa) {
        this.empresa = empresa;
        return this;
    }

    public ClienteBuilder setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public ClienteBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Cliente createCliente() {
        return new Cliente(nome, cidade, uf, profissao, empresa, telefone, email);
    }


}