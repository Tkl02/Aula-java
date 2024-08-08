public class SUV extends Veiculo {
    private int tamanhoPortaMalas;
    private String tipoTracao;
    private String tipoCombustivel;

    public SUV(String nome, String placa, int ano, double valorLocacao, int tamanhoPortaMalas, String tipoTracao,
            String tipoCombustivel) {
        super(nome, placa, ano, valorLocacao);
        this.tamanhoPortaMalas = tamanhoPortaMalas;
        this.tipoTracao = tipoTracao;
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getTamanhoPortaMalas() {
        return tamanhoPortaMalas;
    }

    public void setTamanhoPortaMalas(int tamanhoPortaMalas) {
        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }

    public String getTipoTracao() {
        return tipoTracao;
    }

    public void setTipoTracao(String tipoTracao) {
        this.tipoTracao = tipoTracao;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    // sobrescrevendo o metodo para calcular a multa com polimorfismo
    @Override
    public double calcularMulta(int renovacoes) {
        int renovacoesPagas = Math.max(0, renovacoes - getCotaRenovacoesGratuitas());
        return renovacoesPagas * getValorLocacao() * 0.2; // Exemplo de cálculo de multa
    }

    // verificando a quantidade de renovaçoes
    @Override
    public int getCotaRenovacoesGratuitas() {
        return 3;
    }
}
