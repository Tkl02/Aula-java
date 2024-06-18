package Aula6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando autores e adicionando na lista
        Autor autor1 = new Autor("João Silva", "PhD");
        Autor autor2 = new Autor("Maria Oliveira", "MSc");
        List<Autor> autores = new ArrayList<>();
        autores.add(autor1);
        autores.add(autor2);

        // Criando publicações e adicionando na lista
        List<Publicacao> referencias = new ArrayList<>();
        Artigo artigo1 = new Artigo("Artigo sobre Java", new Date(), referencias, autores, "Resumo do artigo sobre Java.");
        Livro livro1 = new Livro("Livro de Programação", new Date(), referencias, autores, 3, "Editora XYZ", "123-4567890123");
        Tese tese1 = new Tese("Tese sobre Inteligência Artificial", new Date(), referencias, autores, 250, "Resumo da tese", new Date(), "Universidade ABC");

        // Criando biblioteca e adicionando publicações a biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "Rua das Flores, 123");
        biblioteca.adicionarPublicacao(artigo1);
        biblioteca.adicionarPublicacao(livro1);
        biblioteca.adicionarPublicacao(tese1);

        // Criando usuários criando usuarios
        Usuario usuarioComum = new Usuario("Carlos Souza", "1234-5678", "carlos@example.com", "111.222.333-44");
        UsuarioEspecial usuarioEspecial = new UsuarioEspecial("Ana Lima", "9876-5432", "ana@example.com", "555.666.777-88");

        // Criando empréstimos
        Emprestimo emprestimo1 = new Emprestimo(usuarioComum, artigo1, new Date());
        Emprestimo emprestimo2 = new Emprestimo(usuarioEspecial, livro1, new Date());
        Emprestimo emprestimo3 = new Emprestimo(usuarioEspecial, tese1, new Date());

        // teste nas renovações e multas
        System.out.println("Renovando empréstimos...");
        for (int i = 0; i < 4; i++) {
            emprestimo1.renovarEmprestimo();
            emprestimo2.renovarEmprestimo();
            emprestimo3.renovarEmprestimo();
        }

        // Calculando multas
        System.out.println("Multa do emprestimo1 (Artigo): " + emprestimo1.calcularMulta());
        System.out.println("Multa do emprestimo2 (Livro): " + emprestimo2.calcularMulta());
        System.out.println("Multa do emprestimo3 (Tese): " + emprestimo3.calcularMulta());

        // Listando publicações na biblioteca
        System.out.println("Publicações na Biblioteca:");
        for (Publicacao publicacao : biblioteca.getPublicacoes()) {
            System.out.println("Título: " + publicacao.getTitulo());
        }

        // Detalhando autores das publicações
        System.out.println("Autores do Artigo:");
        for (Autor autor : artigo1.getAutores()) {
            System.out.println("Nome: " + autor.getNome() + ", Titulação: " + autor.getTitulacao());
        }
    }
}
