package Aula6;

import java.util.Date;
//classe
public class Emprestimo {
    //variaveis
    private Usuario usuario;
    private Publicacao publicacao;
    private Date dataEmprestimo;
    private int numeroRenovacoes;
    //contrutor
    public Emprestimo(Usuario usuario, Publicacao publicacao, Date dataEmprestimo) {
        this.usuario = usuario;
        this.publicacao = publicacao;
        this.dataEmprestimo = dataEmprestimo;
        this.numeroRenovacoes = 0;
    }

    //getters e setters
    public Usuario getUsuario() {
        return usuario;
    }

    public Publicacao getPublicacao() {
        return publicacao;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setPublicacao(Publicacao publicacao) {
        this.publicacao = publicacao;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setNumeroRenovacoes(int numeroRenovacoes) {
        this.numeroRenovacoes = numeroRenovacoes;
    }

    public int getNumeroRenovacoes() {
        return numeroRenovacoes;
    }

    //metodo de acrecimo de rennovaçoes
    public void renovarEmprestimo() {
        numeroRenovacoes++;
    }

    //metodo que calcula a multa de renovaçoes presente em publicações
    public double calcularMulta() {
        return publicacao.calcularMulta(numeroRenovacoes);
    }
}
