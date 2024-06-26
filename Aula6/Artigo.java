public class Artigo extends Publicacao{
    private String resumo;

    public Artigo(String titulo, String dataPublicacao, double multa, Autor autor, String resumo) {
        super(titulo, dataPublicacao, multa, autor);
        this.resumo = resumo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
}
