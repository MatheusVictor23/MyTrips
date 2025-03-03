package model.Local;
import java.util.ArrayList;
import interfaces.EntidadeListar;


public class Pais implements EntidadeListar{
    private String nome;
    private ArrayList<Estado> estados = new ArrayList<Estado>();

    public Pais(String nome) {
        this.nome = nome;
    }

    public void addEstado(Estado estado) {
        estados.add(estado);
    }

    public void listar() {
        System.out.println("*********** Listagem País ***********\n");
        System.out.println("País: " + nome);
        for (Estado estado : estados) {
            estado.listar();
        }
        System.out.println("**************************************\n");
    }

    public String toString() {
        return nome;
    }
}