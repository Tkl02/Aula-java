public class main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Estelio Natario", "turvelandi", "456.789.123.99", "(99)99999-9999", "05-12-1989", "Profissional no jogo do Bixo",false);
        Medico medico1 = new Medico("Ricardinho Millus", "onde o sol n bate", "(11)11111-1111", "312.456.789.11", 12.99, "777", "10:15", "11:00", "Psicologia Animal");
        Secretario secretario1 = new Secretario("Rochele Rolex", "anda pela sombra", "(33)33333-3333", "789.123.456.55", 3200.18);
        
        Consulta consulta1 = new Consulta(medico1, paciente1, secretario1, "uma cobra foi mordida por estelio e agora sente varias dores", "zoupdein e ritalina", "positivo apenas para veneno proprio");
 
    }
}

