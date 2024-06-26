import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private String endereco;
    private ArrayList<Publicacao> publicacoes;

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void addPublicacao(Publicacao publicacao){
        this.publicacoes.add(publicacao);
    }

    public void removePublicacao(Publicacao publicacao){
        this.publicacoes.remove(publicacao);
    }
}
