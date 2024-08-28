public class Bebida extends ItemCardapio {
    private String tamanho; // pequeno, médio, grande
    private String temperatura; // quente, frio

    public Bebida(String nome, double preco, String tamanho, String temperatura) {
        super(nome, preco);
        this.tamanho = tamanho;
        this.temperatura = temperatura;
    }

    @Override
    public double calcularPreco() {
        double precoBase = getPrice();
        switch (tamanho.toLowerCase()) {
            case "médio":
                precoBase += 2.0;
                break;
            case "grande":
                precoBase += 4.0;
                break;
        }
        return precoBase;
    }

    @Override
    public String descrever() {
        return "Bebida: " + getNome() + ", Tamanho: " + tamanho + ", Temperatura: " + temperatura + ", Preço: R$ " + calcularPreco();
    }
}
