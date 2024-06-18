package Aula6;

// bibliotecas
import java.util.Date;
import java.util.List;

// classe contrutora
public abstract class Publicacao {
    private String titulo;
    private Date dataPublicacao;
    private List<Publicacao> referencias;
    private List<Autor> autores;

    public Publicacao(String titulo, Date dataPublicacao, List<Publicacao> referencias, List<Autor> autores) {
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
        this.referencias = referencias;
        this.autores = autores;
    }

    // gerando getters e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public void setReferencias(List<Publicacao> referencias) {
        this.referencias = referencias;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public List<Publicacao> getReferencias() {
        return referencias;
    }

    public List<Autor> getAutores() {
        return autores;
    }
    // declarando um metodo abstrato
    public abstract double calcularMulta(int numeroRenovacoes);
}
