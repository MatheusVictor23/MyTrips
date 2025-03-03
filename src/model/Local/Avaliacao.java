package model.Local;

public class Avaliacao {
    String dataFrequentou;
    String comentario;
    int avaliacao;

    public Avaliacao() {
    }

    public Avaliacao(String dataFrequentou, String comentario, int avaliacao) {
        this.dataFrequentou = dataFrequentou;
        this.comentario = comentario;
        this.avaliacao = avaliacao;
    }

    public String getDataFrequentou() {
        return dataFrequentou;
    }

    public void setDataFrequentou(String dataFrequentou) {
        this.dataFrequentou = dataFrequentou;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        if (avaliacao >= 1 && avaliacao <= 5) {
            this.avaliacao = avaliacao;
        } else {
            System.err.println("A avaliação deve ser classificada de 1 a 5 estrelas");
        }

    }

    public String toString() {
        String dados = "-Data em que frequentou: " + this.dataFrequentou +
                "\n-Comentários sobre o local: " + this.comentario +
                "\n-Avaliação(Estrelas): " + this.avaliacao;

        return dados;
    }

}
