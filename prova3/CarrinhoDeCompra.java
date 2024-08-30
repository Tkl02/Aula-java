import java.util.ArrayList;

public class CarrinhoDeCompra {
    private ArrayList<Produto> produtos;
    private ArrayList<Cliente> clientes;

    public CarrinhoDeCompra(ArrayList<Produto> produtos, ArrayList<Cliente> clientes) {
        this.produtos = new ArrayList<Produto>();
        this.clientes = clientes;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void adicionarProduto(Produto produto, Cliente cliente) {

        if (cliente instanceof PessoaFisica) {

            if (produtos.size() <= 3) {
                produtos.add(produto);
            } else {
                System.out.println("Limite de produtos atingido");
            }
        }

        else if (cliente instanceof PessoasJuridica) {
            if (produtos.size() <= 10) {
                produtos.add(produto);
            } else {
                System.out.println("Limite de produtos atingido");
            }
        }
        else if (cliente instanceof ClienteEspecial) {
            produtos.add(produto);
        } 
        else {
            System.out.println("Cliente não cadastrado");
        }

    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public void calcularTotalCompra() {
        double total = 0;

        for (Produto produto : produtos) {
            total += produto.getPreco();
        }

        System.out.println("Total da compra: " + total);
    }

}
