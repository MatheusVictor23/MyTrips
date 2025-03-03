package model.Local;
import java.util.ArrayList;
import interfaces.EntidadeListar;


public class Estado implements EntidadeListar{
    private String nome;
    private Pais pais;
    private ArrayList<Cidade> cidades = new ArrayList<Cidade>();

    public Estado(String nome, Pais pais) {
        this.nome = nome;
        this.pais = pais;
        pais.addEstado(this);
    }

    public void addCidade(Cidade cidade) {
        cidades.add(cidade);
    }

    public void listar() {
        System.out.println("  Estado: " + nome);
        for (Cidade cidade : cidades) {
            cidade.listar();
        }
    }

    @Override
    public String toString() {
        return nome;
    }
}