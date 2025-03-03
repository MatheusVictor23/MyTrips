package model.Local;

public class Local {

    // Associação por composição: Um local é composto por nome, endereço.
    private LocalNome nome;
    private Endereco endereco;

    // Associação simples: Local e sua avaliação.

    private Avaliacao avaliacao;

    public Local(LocalNome nome) {
        this.nome = nome;
    }

    public Local(LocalNome nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Local(LocalNome nome, Endereco endereco ,Avaliacao avaliacao) {
        this.nome = nome;
        this.endereco = endereco;
        this.avaliacao = avaliacao;
        endereco.getZona().addLocal(this);
    }

    public LocalNome getNome() {
        return nome;
    }

    public void setNome(LocalNome nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void listar() {
        System.out.println("        Local: " + nome);
    }

    public String toString() {
        String endereco = "\nNome do local: " + this.nome +
                "\nEndereço do local: \n" + this.endereco +
                "\nAvaliação do local: \n" + this.avaliacao;

        return endereco;
    }

}
