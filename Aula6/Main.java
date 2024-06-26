public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Marcel", "Badeco");
        Publicacao publi = new Livro("Titulo", "31/01/2021", 10.0, autor, 1, "Minha impressora", "123456789");
       //System.out.println("Edicao: "+livro.getEdicao());

       System.out.println(publi);

    }
}
