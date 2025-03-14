public class Cliente extends Pessoa {
    public Cliente(String nome, int idade, String cpf, String endereco, String telefone) {
        super(nome, idade, cpf, endereco, telefone);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Cliente: " + getNome() + ", Idade: " + getIdade());
    }

    @Override
    public void atualizarInformacoes() {
        System.out.println("Atualizando informações do cliente...");
    }
}
