package Aula5;

public class ContaEmpresarial extends Contas {
    private int tipoConta;

    public ContaEmpresarial(int numeroConta, float saldoConta,PessoaJuridica titular ,int tipoConta) {
        super(numeroConta, saldoConta,titular);
        this.tipoConta = 2;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }
}
