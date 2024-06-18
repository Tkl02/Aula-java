package Aula5;

public class Main {
    public static void main(String[] args) {
        // Criando Pessoas
        PessoaFisica pessoafisica = new PessoaFisica("João", "123.456.789-00", "111.222.333-44");
        PessoaJuridica pessoajuridica = new PessoaJuridica("Empresa XYZ", "1234567890001", "00.111.222/0001-33");

        // Criando contas
        ContaCorrente contaCorrentePF = new ContaCorrente(1001, 1000, pessoafisica, 1);
        ContaEmpresarial contaEmpresarialPJ = new ContaEmpresarial(2001, 1000, pessoajuridica, 2);
        ContaEspecial contaEspecialPF = new ContaEspecial(3001, 1000, pessoafisica, 3);
        ContaPoupanca contaPoupancaPF = new ContaPoupanca(4001, 1000, pessoafisica, 4);

        // realizando operções de sacar
        contaCorrentePF.sacar(500);
        contaEmpresarialPJ.sacar(500);
        contaEspecialPF.sacar(500);
        contaPoupancaPF.sacar(500);

        // Exibindo informações das contas apos saque
        System.err.println("---".repeat(10)+"SAQUE"+"---".repeat(10));
        System.out.println("Conta Corrente PF:");
        System.out.println("N: "+contaCorrentePF.getNumeroConta() + ", Saldo: " + contaCorrentePF.getSaldoConta());

        System.out.println("\nConta Empresarial PJ:");
        System.out.println("N: "+contaEmpresarialPJ.getNumeroConta() + ", Saldo: " + contaEmpresarialPJ.getSaldoConta());

        System.out.println("\nConta Especial PF:");
        System.out.println("N: "+contaEspecialPF.getNumeroConta() + ", Saldo: " + contaEspecialPF.getSaldoConta());

        System.out.println("\nConta Poupança PF:");
        System.out.println("N: "+contaPoupancaPF.getNumeroConta() + ", Saldo: " + contaPoupancaPF.getSaldoConta());

        System.err.println("---".repeat(20));

        // realizando operções de deposito
        contaCorrentePF.depositar(1000);
        contaEmpresarialPJ.depositar(15000);
        contaEspecialPF.depositar(1000);
        contaPoupancaPF.depositar(1000);

        // informações apos a realização do deposito
        System.err.println("---".repeat(10)+"DEPOSITO"+"---".repeat(10));
        System.out.println("Conta Corrente PF:");
        System.out.println("N: "+contaCorrentePF.getNumeroConta() + ", Saldo: " + contaCorrentePF.getSaldoConta());

        System.out.println("\nConta Empresarial PJ:");
        System.out.println("N: "+contaEmpresarialPJ.getNumeroConta() + ", Saldo: " + contaEmpresarialPJ.getSaldoConta());

        System.out.println("\nConta Especial PF:");
        System.out.println("N: "+contaEspecialPF.getNumeroConta() + ", Saldo: " + contaEspecialPF.getSaldoConta());

        System.out.println("\nConta Poupança PF:");
        System.out.println("N: "+contaPoupancaPF.getNumeroConta() + ", Saldo: " + contaPoupancaPF.getSaldoConta());

        // realizando operções de rendimento
        System.err.println("---".repeat(10)+"RENDIMENTO"+"---".repeat(10));
        contaPoupancaPF.rendimentoConta();
        System.out.println("Conta Poupança PF:");
        System.out.println("N: "+contaPoupancaPF.getNumeroConta() + ", Saldo: " + contaPoupancaPF.getSaldoConta());
        System.err.println("---".repeat(20));

        // realizando operções de creditos
        System.out.println("---".repeat(10)+"CREDITO"+"---".repeat(10));
        System.out.println("Conta Especial PF:");
        contaEspecialPF.sacar(1600);
        System.out.println("N: "+contaEspecialPF.getNumeroConta() + ", Saldo: " + contaEspecialPF.getSaldoConta());
        System.err.println("---".repeat(20));
    }
}
