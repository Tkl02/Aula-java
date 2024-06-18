package Aula5;

public class Contas {
    private int numeroConta;
    private float saldoConta;
    protected Pessoa titular;

    public Contas(int numeroConta, float saldoConta, Pessoa titular) {
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void sacar(float valor){
        if (valor <= saldoConta) {
            saldoConta -= valor; 
        }
    }
    public void depositar(float valor){
        if (valor > 0) {
            saldoConta += valor;
        }
    }

}