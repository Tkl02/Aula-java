public class Luxo extends Veiculo {
    private int quantidadeAirbags;
    private int tamanhoPortaMalas;
    private boolean gpsIntegrado;

    public Luxo(String nome, String placa, int ano, double valorLocacao, int quantidadeAirbags, int tamanhoPortaMalas,
            boolean gpsIntegrado) {
        super(nome, placa, ano, valorLocacao);
        this.quantidadeAirbags = quantidadeAirbags;
        this.tamanhoPortaMalas = tamanhoPortaMalas;
        this.gpsIntegrado = gpsIntegrado;
    }

    public int getQuantidadeAirbags() {
        return quantidadeAirbags;
    }

    public void setQuantidadeAirbags(int quantidadeAirbags) {
        this.quantidadeAirbags = quantidadeAirbags;
    }

    public int getTamanhoPortaMalas() {
        return tamanhoPortaMalas;
    }

    public void setTamanhoPortaMalas(int tamanhoPortaMalas) {
        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }

    public boolean isGpsIntegrado() {
        return gpsIntegrado;
    }

    public void setGpsIntegrado(boolean gpsIntegrado) {
        this.gpsIntegrado = gpsIntegrado;
    }

    // sobreescrevendo o metodo de calcular a multa (usando polimorfismo)
    @Override
    public double calcularMulta(int renovacoes) {
        int renovacoesPagas = Math.max(0, renovacoes - getCotaRenovacoesGratuitas());
        return renovacoesPagas * getValorLocacao() * 0.3; // Exemplo de cálculo de multa
    }

    // verificando as renovaçoes do veiculo
    @Override
    public int getCotaRenovacoesGratuitas() {
        return 5;
    }
}
