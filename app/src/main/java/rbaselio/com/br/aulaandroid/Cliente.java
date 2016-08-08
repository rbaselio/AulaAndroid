package rbaselio.com.br.aulaandroid;


public class Cliente {

    private String nome;
    private String cidade;
    private String uf;
    private String profissao;
    private String empresa;
    private String telefone;
    private String email;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cliente(String nome, String cidade, String uf, String profissao, String empresa, String telefone, String email) {
        this.nome = nome;
        this.cidade = cidade;
        this.uf = uf;
        this.profissao = profissao;
        this.empresa = empresa;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\n' +
                ", cidade='" + cidade + '\n' +
                ", uf='" + uf + '\n' +
                ", profissao='" + profissao + '\n' +
                ", empresa='" + empresa + '\n' +
                ", telefone='" + telefone + '\n' +
                ", email='" + email + '\n' +
                '}';
    }
}
