public class Usuarioespecial extends Usuario{

    public Usuarioespecial(String nome, String telefone, String email, String cpf) {
        super(nome, telefone, email, cpf, Integer.MAX_VALUE);
    }
}
