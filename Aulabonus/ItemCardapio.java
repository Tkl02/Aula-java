
public abstract class ItemCardapio {
    private String nome;
    private Double price;

    public ItemCardapio(String nome, Double price) {
        if (price < 0) {
            throw new IllegalArgumentException("o preço não pode ser negativo");    
        }
        this.nome = nome;
        this.price = price;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price < 0) {
            throw new IllegalArgumentException("o preço não pode ser negativo");    
        }
        this.price = price;
    }

    public abstract double calcularPreco();         
    
    public abstract String descrever();

}
