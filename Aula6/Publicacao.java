
import java.util.ArrayList;

public abstract class Publicacao {
    private String titulo;
    private String dataPublicacao;
    private ArrayList<Autor> autores;
    private ArrayList<Publicacao> referencias;
    private boolean disponivel;
    private double multa;


    public Publicacao(String titulo, String dataPublicacao, double multa, Autor autor) {
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
        this.autores = new ArrayList<Autor>();
        this.autores.add(autor);
        this.referencias = new ArrayList<Publicacao>();
        this.disponivel = true;
        this.multa = multa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

   public void emprestar(){
        this.disponivel = false;
   }

   public void devolver(){
        this.disponivel = true;
   }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public void addAutor(Autor autor){
        this.autores.add(autor);
    }

    public void removeAutor(Autor autor){
        if(this.autores.size() != 1){
            this.autores.remove(autor);
        }
    }

    public void editAutor(int pos, Autor autor){
        this.autores.set(pos, autor);
    }

    public void addReferencia(Publicacao referencia){
        this.referencias.add(referencia);
    }

    public void removeReferencia(Publicacao referencia){
        this.referencias.remove(referencia);
    }


}
