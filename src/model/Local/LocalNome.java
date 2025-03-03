package model.Local;

public class LocalNome {
    private String nome;

    public LocalNome() {
    }

    public LocalNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        String nome = this.getNome();

        return nome;
    }
}
