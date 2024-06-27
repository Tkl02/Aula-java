public class Consulta {

    private Medico medico;
    private Paciente pacientes;
    private Secretario secretario;
    private String sintomas;
    private String medicamentos;
    private String exames;
    
    public Consulta(Medico medico, Paciente pacientes, Secretario secretario, String sintomas, String medicamentos,
            String exames) {
        this.medico = medico;
        this.pacientes = pacientes;
        this.secretario = secretario;
        this.sintomas = sintomas;
        this.medicamentos = medicamentos;
        this.exames = exames;
    }
    public Medico getMedico(Medico medico1) {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public Paciente getPacientes() {
        return pacientes;
    }
    public void setPacientes(Paciente pacientes) {
        this.pacientes = pacientes;
    }
    public Secretario getSecretario() {
        return secretario;
    }
    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }
    public String getSintomas() {
        return sintomas;
    }
    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }
    public String getMedicamentos() {
        return medicamentos;
    }
    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }
    public String getExames() {
        return exames;
    }
    public void setExames(String exames) {
        this.exames = exames;
    }
    

}
