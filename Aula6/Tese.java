public class Tese extends Publicacao{
    private int nroPaginas;
    private String instituicao;
    private String resumo;
    private String dataDefesa;

    public Tese(String titulo, String dataPublicacao, double multa, Autor autor, int nroPaginas, String instituicao, String resumo, String dataDefesa) {
        super(titulo, dataPublicacao, multa, autor);
        this.nroPaginas = nroPaginas;
        this.instituicao = instituicao;
        this.resumo = resumo;
        this.dataDefesa = dataDefesa;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getDataDefesa() {
        return dataDefesa;
    }

    public void setDataDefesa(String dataDefesa) {
        this.dataDefesa = dataDefesa;
    }

    @Override
    public void addAutor(Autor autor){
        super.editAutor(0, autor);
    }

}
