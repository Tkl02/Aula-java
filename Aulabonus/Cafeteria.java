import java.util.ArrayList;

public class Cafeteria {

    private String nome;
    private String cnpj;
    private ArrayList<ItemPedido> itemPedidos;
    private ArrayList<ItemCardapio> itemCardapios;

    public Cafeteria(String nome, String cnpj, ArrayList<ItemPedido> itemPedidos,
            ArrayList<ItemCardapio> itemCardapios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.itemPedidos = itemPedidos;
        this.itemCardapios = itemCardapios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<ItemPedido> getItemPedidos() {
        return itemPedidos;
    }

    public void setItemPedidos(ArrayList<ItemPedido> itemPedidos) {
        this.itemPedidos = itemPedidos;
    }

    public ArrayList<ItemCardapio> getItemCardapios() {
        return itemCardapios;
    }

    public void setItemCardapios(ArrayList<ItemCardapio> itemCardapios) {
        this.itemCardapios = itemCardapios;
    }

}