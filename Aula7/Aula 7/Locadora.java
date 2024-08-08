import java.util.ArrayList;

public class Locadora {
    private String nome;
    private String endereco;
    private String telefone;
    private ArrayList<Veiculo> veiculosDisponiveis; // "BD" veiculos
    private ArrayList<Cliente> clientes; // "BD" clientes
    private ArrayList<Emprestimo> emprestimos; // "BD" Emprestimo

    // contrutor
    public Locadora(String nome, String endereco, String telefone, ArrayList<Veiculo> veiculosDisponiveis,
            ArrayList<Cliente> clientes, ArrayList<Emprestimo> emprestimos) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.veiculosDisponiveis = veiculosDisponiveis;
        this.clientes = clientes;
        this.emprestimos = emprestimos;
    }

    //getter e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Veiculo> getVeiculosDisponiveis() {
        return veiculosDisponiveis;
    }

    public void setVeiculosDisponiveis(ArrayList<Veiculo> veiculosDisponiveis) {
        this.veiculosDisponiveis = veiculosDisponiveis;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    // metodos da aplicação
    public void cadastroVeiculo(Veiculo veiculo) {
        veiculosDisponiveis.add(veiculo);
    }

    public void startEmprestimo(Veiculo veiculo, Cliente cliente, int renovacoes) {
        Emprestimo emprestimo = new Emprestimo(veiculo, cliente, renovacoes);
        emprestimos.add(emprestimo);
    }
    
    public void endEmprestimo(Emprestimo emprestimo) {
        emprestimos.remove(emprestimo);
    }
    
    public void cadastroCliente(Cliente cliente) {
        clientes.add(cliente);
    }
}
