public class Emprestimo {
    //variaveis
    private Veiculo veiculo;
    private Cliente cliente;
    private int renovacoes;
    private double valorTotal;

    //contrutor
    public Emprestimo(Veiculo veiculo, Cliente cliente, int renovacoes) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.renovacoes = renovacoes;
        this.valorTotal = calcValorTotal(); //chamando a função para entregar o calculo
    }

    //getter e setters
    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getRenovacoes() {
        return renovacoes;
    }

    public void setRenovacoes(int renovacoes) {
        this.renovacoes = renovacoes;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    // metodo para calcular o valor final
    private double calcValorTotal() {
        double valor = veiculo.getValorLocacao();
        double Multa = veiculo.calcularMulta(renovacoes);
        return valor + Multa;
    }
}
