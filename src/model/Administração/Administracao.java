package model.Administração;

import java.util.ArrayList;

import interfaces.EntidadeListar;
import model.Pessoa;
import model.Usuario;

public class Administracao extends Pessoa implements EntidadeListar{
    
    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    public Administracao(){}

    public Administracao(String nome, String CPF, String dataNascimento){
        super(nome,CPF,dataNascimento);
    }

    public void addUsuario(Usuario usuario){
        if(!this.usuarios.contains(usuario.getNome())) {
            this.usuarios.add(usuario);
        }
    }
    

    @Override
    public void listar() {
        System.out.println("*********  Usuários *********\n");
        for(Usuario usuario : this.usuarios){
            System.out.println(usuario+"\n");
        }
        System.out.println("\n*****************************\n\n");
    }
}
