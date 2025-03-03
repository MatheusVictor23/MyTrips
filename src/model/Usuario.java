package model;

import java.util.ArrayList;

import interfaces.EntidadeListar;
import model.Administração.Administracao;
import model.Local.Local;

//Herança: Usuário herda os atributos da classe Pessoa.

public class Usuario extends Pessoa implements EntidadeListar {

    // Modificadores de acesso

    private String telefone;
    private String email;
    private Administracao admin;

    // Associação por Agregação: Um usuário agrega vários locais.

    private ArrayList<Local> locais = new ArrayList<Local>();

    // Sobrecarga da classe Usuário

    public Usuario() {
    }

    public Usuario(String nome, String CPF, String dataNascimento) {
        super(nome, CPF, dataNascimento);
    }

    public Usuario(String nome, String CPF, String dataNascimento, String telefone) {
        super(nome, CPF, dataNascimento);
        this.telefone = telefone;
    }

    public Usuario(String nome, String CPF, String dataNascimento, String telefone, String email) {
        super(nome, CPF, dataNascimento);
        this.telefone = telefone;
        this.email = email;
    }

    public Usuario(String nome, String CPF, String dataNascimento, String telefone, String email, Administracao admin) {
        super(nome, CPF, dataNascimento);
        this.telefone = telefone;
        this.email = email;
        this.admin = admin;
        setAdmin(admin);
    }

    public void addLocal(Local local) {
        if (!this.locais.contains(local.getNome())) {
            this.locais.add(local);
        }
    }

    // Polimorfismo e Reescrita do método Listar()

    @Override
    public void listar() {
        System.out.printf("\n\n********* %s Locais já visitados  *********\n",getNome());
        for (Local local : this.locais) {
            System.out.println(local + "\n");
        }
        System.out.println("\n*********************************************************\n\n");
    }

    // Relacionamento bidirecional entre a classe Admin e Usuário

    public void setAdmin(Administracao admin) {
        this.admin = admin;
        admin.addUsuario(this);
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Utilizei o método toString para facilitar a listagem dos usuários.

    public String toString() {
        String usuario = "\nNome do Usuário: " + getNome() +
                "\nCPF do usuário: " + getCPF() +
                "\nData de Nascimento: " + getDataNascimento() +
                "\nTelefone: " + this.email +
                "\nEmail: " + this.email;

        return usuario;
    }

}
