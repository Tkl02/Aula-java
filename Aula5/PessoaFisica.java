package Aula5;

public class PessoaFisica extends Pessoa{
    private String cpf;

    public PessoaFisica(String nome, String rg, String cpf) {
        super(nome, rg);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
