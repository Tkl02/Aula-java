package Aula6;

import java.util.ArrayList;
import java.util.List;

// classe contrutora
public class Biblioteca {
    private String nome;
    private String endereco;
    private List<Publicacao> publicacoes;

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.publicacoes = new ArrayList<>();
    }

    // gerando getters e setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setPublicacoes(List<Publicacao> publicacoes) {
        this.publicacoes = publicacoes;
    }
    // funcao que adiciona publicação 
    public void adicionarPublicacao(Publicacao publicacao) {
        publicacoes.add(publicacao);
    }
    
    public List<Publicacao> getPublicacoes() {
        return publicacoes;
    }
}
