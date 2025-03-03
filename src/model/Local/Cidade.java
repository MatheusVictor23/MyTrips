package model.Local;
import java.util.ArrayList;

public class Cidade {
    private String nome;
    private Estado estado;
    private ArrayList<Zona> zonas = new ArrayList<Zona>();

    public Cidade(String nome, Estado estado) {
        this.nome = nome;
        this.estado = estado;
        estado.addCidade(this);
    }

    public void addZona(Zona zona) {
        zonas.add(zona);
    }

    public void listar() {
        System.out.println("    Cidade: " + nome);
        for (Zona zona : zonas) {
            zona.listar();
        }
    }

    @Override
    public String toString() {
        return nome;
    }
}
