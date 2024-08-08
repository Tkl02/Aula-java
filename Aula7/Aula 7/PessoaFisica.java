public class PessoaFisica extends Cliente {
    private String cpf;
    private boolean temEmprestimoAtivo;
    //contrutor
    public PessoaFisica(String nome, String telefone, String endereco, String cpf, boolean temEmprestimoAtivo) {
        super(nome, telefone, endereco);
        this.cpf = cpf;
        this.temEmprestimoAtivo = temEmprestimoAtivo;
    }
    //getters e setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isTemEmprestimoAtivo() {
        return temEmprestimoAtivo;
    }

    public void setTemEmprestimoAtivo(boolean temEmprestimoAtivo) {
        this.temEmprestimoAtivo = temEmprestimoAtivo;
    }

    public boolean temEmprestimoAtivo() {
        return temEmprestimoAtivo;
    }

    public void setEmprestimoAtivo(boolean temEmprestimoAtivo) {
        this.temEmprestimoAtivo = temEmprestimoAtivo;
    }
}
