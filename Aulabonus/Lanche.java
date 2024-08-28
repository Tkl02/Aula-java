import java.util.ArrayList;
import java.util.List;

public class Lanche extends ItemCardapio {
    private List<String> ingredientes;

    public Lanche(String nome, double preco) {
        super(nome, preco);
        this.ingredientes = new ArrayList<>();
    }

    public void adicionarIngrediente(String ingrediente) {
        ingredientes.add(ingrediente);
    }

    @Override
    public double calcularPreco() {
        return getPrice() + (ingredientes.size() * 1.5);
    }

    @Override
    public String descrever() {
        return "Lanche: " + getNome() + ", Ingredientes: " + ingredientes + ", Preço: R$ " + calcularPreco();
    }
}
