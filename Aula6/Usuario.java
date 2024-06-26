public abstract class Usuario {
    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private int qtdEmprestimo;
    private int limite;

    public Usuario(String nome, String telefone, String email, String cpf, int limite) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.qtdEmprestimo = 0;
        this.limite = limite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getLimite(){
        return this.limite;
    }

    public int getQtdEmprestimo() {
        return qtdEmprestimo;
    }

    public void setQtdEmprestimo(int qtdEmprestimo) {
        this.qtdEmprestimo = qtdEmprestimo;
    }

    public void realizarEmprestimo(){
        this.qtdEmprestimo++;
    }

    public void devolverEmprestimo(){
        this.qtdEmprestimo--;
    }

    public boolean podeFazerEmprestimo(){
        return this.qtdEmprestimo < this.limite;
    }
}
