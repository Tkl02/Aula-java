package Aula5;

public class ContaEspecial extends Contas {
    private int tipoConta;
    private float creditoConta;

    public ContaEspecial(int numeroConta, float saldoConta, Pessoa titular, int tipoConta) {
        super(numeroConta, saldoConta, titular);
        this.tipoConta = 3;
        this.creditoConta = saldoConta * 0.35f;

    }

    public float getCreditoConta() {
        return creditoConta;
    }

    public void setCreditoConta(float creditoConta) {
        this.creditoConta = creditoConta;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }

    @Override
    public void sacar(float valor) {
        if (valor <= (super.getSaldoConta() + creditoConta)) {
            super.setSaldoConta(super.getSaldoConta() - valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

}
