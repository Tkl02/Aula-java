package Aula6;

import java.util.Date;
import java.util.List;

// classe
public class Tese extends Publicacao {
    // variaveis
    private int numeroPaginas;
    private String resumo;
    private Date dataDefesa;
    private String instituicao;

    // contrutor
    public Tese(String titulo, Date dataPublicacao, List<Publicacao> referencias, List<Autor> autores,
            int numeroPaginas, String resumo, Date dataDefesa, String instituicao) {
        super(titulo, dataPublicacao, referencias, autores);
        this.numeroPaginas = numeroPaginas;
        this.resumo = resumo;
        this.dataDefesa = dataDefesa;
        this.instituicao = instituicao;
    }
    //getters e setters
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public void setDataDefesa(Date dataDefesa) {
        this.dataDefesa = dataDefesa;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getResumo() {
        return resumo;
    }

    public Date getDataDefesa() {
        return dataDefesa;
    }

    public String getInstituicao() {
        return instituicao;
    }

    //metodo para calcula a multa
    @Override
    public double calcularMulta(int numeroRenovacoes) {
        // Implementação específica para multa de teses
        return numeroRenovacoes > 3 ? (numeroRenovacoes - 3) * 3.0 : 0.0;
    }
}
