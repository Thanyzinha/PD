public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Toni", 30, "123.456.789-00", "Rua A, 123", "5555-1234");
        Engenheiro engenheiro = new Engenheiro("Ana", 35, "987.654.321-00", "Rua B, 456", "5555-5678");
        Diretor diretor = new Diretor("Carlos", 45, "111.222.333-44", "Rua C, 789", "5555-9101");
        Gerente gerente = new Gerente("Mariana", 40, "222.333.444-55", "Rua D, 101", "5555-1212");

        System.out.println("\n=== Informações dos Participantes ===");
        cliente.mostrarInformacoes();
        engenheiro.mostrarInformacoes();
        diretor.mostrarInformacoes();
        gerente.mostrarInformacoes();

        System.out.println("\n=== Ações do Engenheiro ===");
        engenheiro.realizarPedido();

        System.out.println("\n=== Ações do Diretor ===");
        diretor.realizarPedido();
        diretor.criarDepartamento();
        diretor.cadastrarFuncionarios();

        System.out.println("\n=== Ações do Gerente ===");
        gerente.realizarPedido();
        gerente.criarDepartamento();
        gerente.cadastrarFuncionarios();
    }
}
