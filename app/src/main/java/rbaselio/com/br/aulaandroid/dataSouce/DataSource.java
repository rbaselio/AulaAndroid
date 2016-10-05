package rbaselio.com.br.aulaandroid.dataSouce;

import java.util.ArrayList;
import java.util.List;

import rbaselio.com.br.aulaandroid.model.Cliente;


public class DataSource {
    
    public boolean persistirDados(Cliente cliente){
        return true;
    }

    public boolean deletarDados(int id){
        // TODO: 04/10/16 deletar registros
        return true;
    }

    public boolean deletarDados(Cliente cliente){
        // TODO: 04/10/16 deletar registros
        return true;
    }


    public List<String> listarCLientes(){
       List<String> lista = new ArrayList<>();
        lista.add("Roberto");
        lista.add("Marcio");
        lista.add("Paulo");
        lista.add("Paula");
        lista.add("Joao");
        lista.add("Joana");
        lista.add("Luiz");
        lista.add("Luiza");
        lista.add("Gustavo");
        lista.add("Afonso");
        lista.add("Pedro");
        lista.add("Adolfo");
        lista.add("Didi");
        lista.add("Dunha");


        return lista;
    }


}
