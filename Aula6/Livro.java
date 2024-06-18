package Aula6;

import java.util.Date;
import java.util.List;

//classe
public class Livro extends Publicacao {
    // variaveis
    private int numeroEdicao;
    private String nomeEditora;
    private String isbn;

    // contrutor
    public Livro(String titulo, Date dataPublicacao, List<Publicacao> referencias, List<Autor> autores,
            int numeroEdicao, String nomeEditora, String isbn) {
        super(titulo, dataPublicacao, referencias, autores);
        this.numeroEdicao = numeroEdicao;
        this.nomeEditora = nomeEditora;
        this.isbn = isbn;
    }

    // getters e setters
    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setNumeroEdicao(int numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // sobreescrevendo o metodo que faz o calculo da multa
    @Override
    public double calcularMulta(int numeroRenovacoes) {
        // Implementação específica para multa de livros
        return numeroRenovacoes > 3 ? (numeroRenovacoes - 3) * 1.5 : 0.0;
    }
}
