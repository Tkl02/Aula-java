public class ProdutoFisico extends Produto {
    private double peso;

    public ProdutoFisico(String nome, double preco, int quantidade, double peso) {
        super(nome, preco, quantidade);
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso inválido"); 
        }
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double calcularFrete() {
        double valorTotal = 0.0;
        if (peso <= 2) {
            valorTotal = 5.0;

        } else if (peso > 2 && peso <= 5) {
            valorTotal = 10.0;

        } else if (peso > 5 ) {
            valorTotal = getPeso() * 2.5;

        }
        return valorTotal;
    }

    @Override
    public double calcularTotal() {
        return getPreco() * getQuantidade() + calcularFrete();
    }
}
