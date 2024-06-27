
public class Paciente {
    private String nomePaciente;
    private String enderecoPaciente;
    private String cpfPaciente;
    private String telefone;
    private String dataNascimentoPaciente;
    private String profissao;
    private boolean planoSaude;

    public Paciente(String nomePaciente, String enderecoPaciente, String cpfPaciente, String telefone,
            String dataNascimentoPaciente, String profissao, boolean planoSaude) {
        this.nomePaciente = nomePaciente;
        this.enderecoPaciente = enderecoPaciente;
        this.cpfPaciente = cpfPaciente;
        this.telefone = telefone;
        this.dataNascimentoPaciente = dataNascimentoPaciente;
        this.profissao = profissao;
        this.planoSaude = planoSaude;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getEnderecoPaciente() {
        return enderecoPaciente;
    }

    public void setEnderecoPaciente(String enderecoPaciente) {
        this.enderecoPaciente = enderecoPaciente;
    }

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimentoPaciente() {
        return dataNascimentoPaciente;
    }

    public void setDataNascimentoPaciente(String dataNascimentoPaciente) {
        this.dataNascimentoPaciente = dataNascimentoPaciente;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

}
