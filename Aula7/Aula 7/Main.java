
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculosDisponiveis = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();

        // criando o sistema base sda locadora
        Locadora locadora = new Locadora("Locadora XYZ", "Rua Principal, 123", "1234-5678", veiculosDisponiveis,
                clientes, emprestimos);

        /*
         * adicionei verificações ao tentar alugar um carros, então primeiro deve-se
         * cadastra o carro no sistema
         * dps cadastro o cliente, so então o codigo vai dar sequencia
         */

        Scanner scanner = new Scanner(System.in);
        int opcao;
        // inicialização do sistema com while pra n encerra o sistema "sem querer"
        do {
            // menuzinho base
            System.out.println("-=- MENU -=-");
            System.out.println("1 {cadastrar novo veiculo}");
            System.out.println("2 {cadastrar novo cliente}");
            System.out.println("3 {realizar emprestimo}");
            System.out.println("4 {finalizar emprestimo}");
            System.out.println("5 {sair}");
            System.out.print("escolha uma opçao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            // switch case que ira chamar as funçoes de acordo com a opção selecionada
            switch (opcao) {
                case 1:
                    cadastrarVeiculo(locadora, scanner);
                    break;
                case 2:
                    cadastrarCliente(locadora, scanner);
                    break;
                case 3:
                    realizarEmprestimo(locadora, scanner);
                    break;
                case 4:
                    finalizarEmprestimo(locadora, scanner);
                    break;
                case 5:
                    System.out.println("adeus ... ;) ");
                    break;
                default:
                    System.out.println("opção invalida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }

    // separação de funçoes para organização do codigo.

    // função para cadastra o carro no sistema
    private static void cadastrarVeiculo(Locadora locadora, Scanner scanner) {
        System.out.println("escolha o tipo de veiculo:");
        System.out.println("1 {Popular}");
        System.out.println("2 {SUV}");
        System.out.println("3 {Luxo}");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // limpando o cache

        System.out.print("nome: ");
        String nome = scanner.nextLine();

        System.out.print("placa: ");
        String placa = scanner.nextLine();
        System.out.print("ano: ");
        int ano = scanner.nextInt();
        System.out.print("valor da locação: ");
        double valorLocacao = scanner.nextDouble();
        scanner.nextLine(); // limpando o cache

        Veiculo veiculo = null;
        switch (tipo) {
            case 1:
                System.out.print("Possui ar-condicionado (true/false): ");
                boolean arCondicionado = scanner.nextBoolean();
                veiculo = new Popular(nome, placa, ano, valorLocacao, arCondicionado);
                break;
            case 2:
                System.out.print("Tamanho do porta-malas: ");
                int tamanhoPortaMalas = scanner.nextInt();
                scanner.nextLine(); // limpando o cache.
                System.out.print("Tipo de tração: ");
                String tipoTracao = scanner.nextLine();
                System.out.print("Tipo de combustivel: ");
                String tipoCombustivel = scanner.nextLine();
                veiculo = new SUV(nome, placa, ano, valorLocacao, tamanhoPortaMalas, tipoTracao, tipoCombustivel);
                break;
            case 3:
                System.out.print("Quantidade de airbags: ");
                int quantidadeAirbags = scanner.nextInt();
                System.out.print("Tamanho do porta-malas: ");
                int tamanhoPortaMalasLuxo = scanner.nextInt();
                System.out.print("Possui GPS integrado (true/false): ");
                boolean gpsIntegrado = scanner.nextBoolean();
                veiculo = new Luxo(nome, placa, ano, valorLocacao, quantidadeAirbags, tamanhoPortaMalasLuxo,
                        gpsIntegrado);
                break;
            default:
                System.out.println("Tipo de veiculo inválido.");
                return;
        }

        locadora.cadastroVeiculo(veiculo);
        System.out.println("Veiculo cadastrado com sucesso!");
    }

    // função para poder cadastra o cliente no sistema
    private static void cadastrarCliente(Locadora locadora, Scanner scanner) {
        System.out.println("Escolha o tipo de cliente:");
        System.out.println("1 {Pessoa Fisica}");
        System.out.println("2 {Pessoa Juridica}");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // limpando o cache.

        System.out.print("nome: ");
        String nome = scanner.nextLine();
        System.out.print("telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("endereço: ");
        String endereco = scanner.nextLine();

        Cliente cliente = null;
        switch (tipo) {
            case 1:
                System.out.print("CPF: ");
                String cpf = scanner.nextLine();
                cliente = new PessoaFisica(nome, telefone, endereco, cpf, false);
                break;
            case 2:
                System.out.print("CNPJ: ");
                String cnpj = scanner.nextLine();
                System.out.print("Nome do representante: ");
                String nomeRepresentante = scanner.nextLine();
                cliente = new PessoaJuridica(nome, telefone, endereco, cnpj, nomeRepresentante);
                break;
            default:
                System.out.println("Tipo de cliente inválido.");
                return;
        }

        locadora.cadastroCliente(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    // funça para poder adicionar o uma locação com verificações de carro e cliente
    // no sistema
    private static void realizarEmprestimo(Locadora locadora, Scanner scanner) {
        System.out.print("Placa do veiculo: ");
        String placa = scanner.nextLine();
        Veiculo veiculo = locadora.getVeiculosDisponiveis().stream()
                .filter(v -> v.getPlaca().equals(placa))
                .findFirst()
                .orElse(null);

        if (veiculo == null) {
            System.out.println("Veiculo não encontrado.");
            return;
        }

        System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        Cliente cliente = locadora.getClientes().stream()
                .filter(c -> c.getNome().equals(nomeCliente))
                .findFirst()
                .orElse(null);

        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }

        if (cliente instanceof PessoaFisica && ((PessoaFisica) cliente).temEmprestimoAtivo()) {
            System.out.println("Cliente já possui um empréstimo ativo.");
            return;
        }

        System.out.print("Número de renovações: ");
        int renovacoes = scanner.nextInt();
        scanner.nextLine(); // limpando o cache.

        @SuppressWarnings("unused")
        Emprestimo emprestimo = new Emprestimo(veiculo, cliente, renovacoes);
        locadora.startEmprestimo(veiculo, cliente, renovacoes);

        if (cliente instanceof PessoaFisica) {
            ((PessoaFisica) cliente).setEmprestimoAtivo(true);
        }

        System.out.println("Empréstimo realizado com sucesso!");
    }

    // chamando minha função para poder remover o carro e o cliente da locadora
    private static void finalizarEmprestimo(Locadora locadora, Scanner scanner) {
        System.out.print("Placa do veiculo: ");
        String placa = scanner.nextLine();
        Emprestimo emprestimo = locadora.getEmprestimos().stream()
                .filter(e -> e.getVeiculo().getPlaca().equals(placa))
                .findFirst()
                .orElse(null);

        if (emprestimo == null) {
            System.out.println("Empréstimo não encontrado.");
            return;
        }

        locadora.endEmprestimo(emprestimo);

        if (emprestimo.getCliente() instanceof PessoaFisica) {
            ((PessoaFisica) emprestimo.getCliente()).setEmprestimoAtivo(false);
        }

        System.out.println("Empréstimo finalizado com sucesso!");
        System.out.println("Valor total do empréstimo: " + emprestimo.getValorTotal());
    }
}
