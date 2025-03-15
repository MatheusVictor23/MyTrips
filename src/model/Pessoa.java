package model;

import java.util.ArrayList;

public abstract class Pessoa {
    private String nome;
    private String CPF;
    private String dataNascimento;
    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    public Pessoa() {
    }

    public Pessoa(String nome, String CPF, String dataNascimento) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return this.CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public abstract void listar();

}