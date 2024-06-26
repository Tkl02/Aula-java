

public class Emprestimo {
    private Publicacao publicacao;
    private Usuario usuario;
    private int qtdRenovacao;

    public Emprestimo(Publicacao publicacao, Usuario usuario) throws Exception {
        if(publicacao.isDisponivel()){
            if(usuario.podeFazerEmprestimo()){
                this.publicacao = publicacao;
                this.usuario = usuario;
                this.publicacao.emprestar();
                this.usuario.realizarEmprestimo();
                this.qtdRenovacao = 0;
            }
            throw new Exception("Limite do usuário atingido");
        }
        throw new Exception("Publicação não disponível");
    }

    public void renovar(){
        this.qtdRenovacao++;
    }

    public void devolver(){
        this.publicacao.devolver();
        this.usuario.devolverEmprestimo();
        double multa = this.calcularMulta();
        System.out.println("Multa: "+multa);
    }

    public double calcularMulta(){
        if(this.qtdRenovacao <= 3){
            return 0;
        }else{
            return (this.qtdRenovacao - 3) * this.publicacao.getMulta();
        }
    }

}
