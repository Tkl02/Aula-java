public class ProdutoDigital extends Produto{
    private int tamanhoArquivo;

    public ProdutoDigital(String nome, double preco, int quantidade, int tamanhoArquivo) {
        super(nome, preco, quantidade);
        if (tamanhoArquivo <= 0) {
            throw new IllegalArgumentException("Tamanho inválido");
            
        }
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public int getTamanho() {
        return tamanhoArquivo;
    }

    public void setTamanho(int tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }
    
    @Override
    public double calcularTotal(){
        return getPreco() * getQuantidade();
    }

}
