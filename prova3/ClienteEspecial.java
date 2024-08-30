public class ClienteEspecial extends Cliente{
    private String docIdentificacao;

    public ClienteEspecial(String nome, String telefone, String endereco, String docIdentificacao) {
        super(nome, telefone, endereco);
        this.docIdentificacao = docIdentificacao;
    }

    public String getDocIdentificacao() {
        return docIdentificacao;
    }

    public void setDocIdentificacao(String docIdentificacao) {
        this.docIdentificacao = docIdentificacao;
    }

    
}
