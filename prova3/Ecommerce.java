import java.util.ArrayList;

public class Ecommerce {
    private ArrayList<CarrinhoDeCompra> carrinhoDeCompras;

    public Ecommerce(ArrayList<CarrinhoDeCompra> carrinhoDeCompras) {
        this.carrinhoDeCompras = carrinhoDeCompras;
    }

    public ArrayList<CarrinhoDeCompra> getCarrinhoDeCompras() {
        return carrinhoDeCompras;
    }

    public void setCarrinhoDeCompras(ArrayList<CarrinhoDeCompra> carrinhoDeCompras) {
        this.carrinhoDeCompras = carrinhoDeCompras;
    }

    public void adicionarCompra(CarrinhoDeCompra carrinhoDeCompra) {
        carrinhoDeCompras.add(carrinhoDeCompra);
    }
}
