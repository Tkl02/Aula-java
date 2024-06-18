package Aula6;

// classe constuturo, getters e setters
public class Autor {
    private String nome;
    private String titulacao;

    public Autor(String nome, String titulacao) {
        this.nome = nome;
        this.titulacao = titulacao;
    }

    public String getNome() {
        return nome;
    }

    public String getTitulacao() {
        return titulacao;
    }
}
