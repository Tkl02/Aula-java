
public class Medico extends Funcionarios {
    private String crmMedico;
    private String horarioInicoMedico;
    private String horarioFimMedico;
    private String especialidadeMedico;

    public Medico(String nomeFunc, String enderecoFunc, String telefoneFunc, String cpfFunc, double salarioFunc,
            String crmMedico, String horarioInicoMedico, String horarioFimMedico, String especialidadeMedico) {
        super(nomeFunc, enderecoFunc, telefoneFunc, cpfFunc, salarioFunc);
        this.crmMedico = crmMedico;
        this.horarioInicoMedico = horarioInicoMedico;
        this.horarioFimMedico = horarioFimMedico;
        this.especialidadeMedico = especialidadeMedico;
    }

    public String getCrmMedico() {
        return crmMedico;
    }

    public void setCrmMedico(String crmMedico) {
        this.crmMedico = crmMedico;
    }

    public String getHorarioInicoMedico() {
        return horarioInicoMedico;
    }

    public void setHorarioInicoMedico(String horarioInicoMedico) {
        this.horarioInicoMedico = horarioInicoMedico;
    }

    public String getHorarioFimMedico() {
        return horarioFimMedico;
    }

    public void setHorarioFimMedico(String horarioFimMedico) {
        this.horarioFimMedico = horarioFimMedico;
    }

    public String getEspecialidadeMedico() {
        return especialidadeMedico;
    }

    public void setEspecialidadeMedico(String especialidadeMedico) {
        this.especialidadeMedico = especialidadeMedico;
    }

}
