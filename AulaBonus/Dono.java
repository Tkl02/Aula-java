package AulaBonus;

public class Dono extends Petshop{
    private String nomeDono;
    private String telefone;
    private String endereco;
    public Dono(String nome, String tipo, String dataEntrada, Arraylist<Animal> animais, Arraylist<Dono> donos,
            String nomeDono, String telefone, String endereco) {
        super(nome, tipo, dataEntrada, animais, donos);
        this.nomeDono = nomeDono;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    public String getNomeDono() {
        return nomeDono;
    }
    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
