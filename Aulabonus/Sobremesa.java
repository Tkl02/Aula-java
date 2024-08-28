public class Sobremesa extends ItemCardapio {
    private String tamanhoPorcao; // pequeno, médio, grande
    private int contagemCalorias;

    public Sobremesa(String nome, double preco, String tamanhoPorcao, int contagemCalorias) {
        super(nome, preco);
        this.tamanhoPorcao = tamanhoPorcao;
        this.contagemCalorias = contagemCalorias;
    }

    @Override
    public double calcularPreco() {
        double precoBase = getPrice();
        switch (tamanhoPorcao.toLowerCase()) {
            case "médio":
                precoBase += 3.0;
                break;
            case "grande":
                precoBase += 5.0;
                break;
        }
        return precoBase;
    }

    @Override
    public String descrever() {
        return "Sobremesa: " + getNome() + ", Tamanho Porção: " + tamanhoPorcao + ", Calorias: " + contagemCalorias + ", Preço: R$ " + calcularPreco();
    }
}
