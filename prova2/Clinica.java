import java.util.ArrayList;

// criação abstrata das clicas com pacientes e funcionarios.s

public abstract class Clinica {
    private String nome;
    private String endereco;
    private String crm;
    private String cpnj;
    private ArrayList<Funcionarios> funcionario;
    private ArrayList<Paciente> pacientes;

    public Clinica(String nome, String endereco, String crm, String cpnj, ArrayList<Funcionarios> funcionario,
            ArrayList<Paciente> pacientes) {
        this.nome = nome;
        this.endereco = endereco;
        this.crm = crm;
        this.cpnj = cpnj;
        this.funcionario = funcionario;
        this.pacientes = pacientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getCpnj() {
        return cpnj;
    }

    public void setCpnj(String cpnj) {
        this.cpnj = cpnj;
    }

    public ArrayList<Funcionarios> getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(ArrayList<Funcionarios> funcionario) {
        this.funcionario = funcionario;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

}
