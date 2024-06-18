package Aula5;

public class ContaCorrente extends Contas{
    private int tipoConta;

    public ContaCorrente(int numeroConta, float saldoConta,Pessoa titular, int tipoConta) {
        super(numeroConta, saldoConta,titular);
        this.tipoConta = 1;
    }

    @Override
    public void setSaldoConta(float saldoConta){
        if (saldoConta >= 0) {
            super.setSaldoConta(saldoConta);
        }
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }
    
}
