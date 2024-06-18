package Aula6;

import java.util.Date;
import java.util.List;

//classe
public class Artigo extends Publicacao {
    private String resumo;

    // contrutor da classe
    public Artigo(String titulo, Date dataPublicacao, List<Publicacao> referencias, List<Autor> autores,
            String resumo) {
        super(titulo, dataPublicacao, referencias, autores);
        this.resumo = resumo;
    }
    //getters e setters
    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    //sobreescrevendo o metodo para calcular a multa
    @Override
    public double calcularMulta(int numeroRenovacoes) {
        // Implementação específica para multa de artigos
        return numeroRenovacoes > 3 ? (numeroRenovacoes - 3) * 2.0 : 0.0;
               //A linha de código return numeroRenovacoes > 3 ? (numeroRenovacoes - 3) * 2.0 : 0.0; é uma expressão condicional (ou operador ternário) que calcula a multa com base no número de renovações.
    }
}
