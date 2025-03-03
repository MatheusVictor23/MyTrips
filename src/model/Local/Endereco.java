package model.Local;

public class Endereco {
    private Pais pais;
    private Estado estado;
    private Cidade cidade;
    private Zona zona;

    public Endereco() {
    }

    public Endereco(Pais pais, Estado estado, Cidade cidade, Zona zona) {
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.zona = zona;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public String toString() {
        String endereco = "-País:" + this.pais +
                "\n-Estado: " + this.estado +
                "\n-Cidade: " + this.cidade +
                "\n-Zona da cidade: " + this.zona;

        return endereco;
    }

}
