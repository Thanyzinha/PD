public class Diretor extends Pessoa implements Fornecedor, Departamento {
    public Diretor(String nome, int idade, String cpf, String endereco, String telefone) {
        super(nome, idade, cpf, endereco, telefone);
    }

    @Override
    public void realizarPedido() {
        System.out.println("Diretor realizando pedido...");
    }

    @Override
    public void criarDepartamento() {
        System.out.println("Departamento criado pelo diretor.");
    }

    @Override
    public void cadastrarFuncionarios() {
        System.out.println("Funcionários cadastrados pelo diretor.");
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Diretor: " + getNome() + ", Idade: " + getIdade());
    }

    @Override
    public void atualizarInformacoes() {
        System.out.println("Atualizando informações do diretor...");
    }
}
