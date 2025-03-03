package model.Local;
import java.util.ArrayList;


public class Zona {
    private String nome;
    private Cidade cidade;
    private ArrayList<Local> locais = new ArrayList<Local>();

    public Zona(String nome, Cidade cidade) {
        this.nome = nome;
        this.cidade = cidade;
        cidade.addZona(this);
    }

    public void addLocal(Local local) {
        locais.add(local);
    }

    public void listar() {
        System.out.println("      Zona: " + nome);
        for (Local local : locais) {
            local.listar();
        }
    }

    @Override
    public String toString() {
        return nome;
    }
}
