import java.util.ArrayList;
import java.util.List;

public class ExemploTabela {
    public static void main(String[] args) {
        // Lista principal que contém outras listas
        List<List<String>> tabela = new ArrayList<>();

        // Criando e adicionando linhas
        List<String> linha1 = new ArrayList<>();
        linha1.add("Nome");
        linha1.add("Idade");
        tabela.add(linha1);

        List<String> linha2 = new ArrayList<>();
        linha2.add("Alice");
        linha2.add("30");
        tabela.add(linha2);

        List<String> linha3 = new ArrayList<>();
        linha3.add("Bob");
        linha3.add("25");
        tabela.add(linha3);

        // Imprimindo a tabela
        for (List<String> linha : tabela) {
            System.out.println(linha);
        }
    }
}
