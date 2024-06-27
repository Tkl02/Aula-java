
public class Funcionarios {
    private String nomeFunc;
    private String enderecoFunc;
    private String telefoneFunc;
    private String cpfFunc;
    private double salarioFunc;

    public Funcionarios(String nomeFunc, String enderecoFunc, String telefoneFunc, String cpfFunc, double salarioFunc) {
        this.nomeFunc = nomeFunc;
        this.enderecoFunc = enderecoFunc;
        this.telefoneFunc = telefoneFunc;
        this.cpfFunc = cpfFunc;
        this.salarioFunc = salarioFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getEnderecoFunc() {
        return enderecoFunc;
    }

    public void setEnderecoFunc(String enderecoFunc) {
        this.enderecoFunc = enderecoFunc;
    }

    public String getTelefoneFunc() {
        return telefoneFunc;
    }

    public void setTelefoneFunc(String telefoneFunc) {
        this.telefoneFunc = telefoneFunc;
    }

    public String getCpfFunc() {
        return cpfFunc;
    }

    public void setCpfFunc(String cpfFunc) {
        this.cpfFunc = cpfFunc;
    }

    public double getSalarioFunc() {
        return salarioFunc;
    }

    public void setSalarioFunc(double salarioFunc) {
        this.salarioFunc = salarioFunc;
    }

}
