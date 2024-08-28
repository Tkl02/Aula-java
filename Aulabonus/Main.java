public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        // Criando e adicionando bebidas
        Bebida cafe = new Bebida("Café", 5.0, "médio", "quente");
        Bebida suco = new Bebida("Suco de Laranja", 7.0, "grande", "frio");

        pedido.adicionarItem(cafe);
        pedido.adicionarItem(suco);

        // Criando e adicionando lanche
        Lanche sanduiche = new Lanche("Sanduíche", 10.0);
        sanduiche.adicionarIngrediente("Queijo");
        sanduiche.adicionarIngrediente("Presunto");

        pedido.adicionarItem(sanduiche);

        // Criando e adicionando sobremesa
        Sobremesa bolo = new Sobremesa("Bolo de Chocolate", 6.0, "pequeno", 250);

        pedido.adicionarItem(bolo);

        // Mostrando o pedido completo
        pedido.mostrarPedido();
    }
}
