package Aula5;

public class ContaPoupanca extends Contas{
    private int tipoConta;

    public ContaPoupanca(int numeroConta, float saldoConta,Pessoa titular, int tipoConta) {
        super(numeroConta, saldoConta, titular);
        this.tipoConta = 4;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }
    
    public void rendimentoConta(){
        float saldoConta = getSaldoConta();
        float rendimentoConta = saldoConta * 0.05f;
        depositar(rendimentoConta);
    }

}
