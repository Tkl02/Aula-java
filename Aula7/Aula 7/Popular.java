public class Popular extends Veiculo {
    private boolean arCondicionado;

    public Popular(String nome, String placa, int ano, double valorLocacao, boolean arCondicionado) {
        super(nome, placa, ano, valorLocacao);
        this.arCondicionado = arCondicionado;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    @Override
    public double calcularMulta(int renovacoes) {
        int renovacoesPagas = Math.max(0, renovacoes - getCotaRenovacoesGratuitas());
        return renovacoesPagas * getValorLocacao() * 0.1; // Exemplo de cálculo de multa
    }

    @Override
    public int getCotaRenovacoesGratuitas() {
        return 1;
    }
}
