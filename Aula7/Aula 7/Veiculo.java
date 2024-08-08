public abstract class Veiculo {
    private String nome;
    private String placa;
    private int ano;
    private double valorLocacao;

    public Veiculo(String nome, String placa, int ano, double valorLocacao) {
        this.nome = nome;
        this.placa = placa;
        this.ano = ano;
        this.valorLocacao = valorLocacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    // metodos abstrato para que a classe veiculos informe o que é preciso
    public abstract double calcularMulta(int renovacoes);

    public abstract int getCotaRenovacoesGratuitas();
}
