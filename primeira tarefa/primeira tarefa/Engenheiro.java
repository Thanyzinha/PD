public class Engenheiro extends Pessoa implements Fornecedor {
    public Engenheiro(String nome, int idade, String cpf, String endereco, String telefone) {
        super(nome, idade, cpf, endereco, telefone);
    }

    @Override
    public void realizarPedido() {
        System.out.println("Engenheiro realizando pedido...");
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Engenheiro: " + getNome() + ", Idade: " + getIdade());
    }

    @Override
    public void atualizarInformacoes() {
        System.out.println("Atualizando informações do engenheiro...");
    }
}
