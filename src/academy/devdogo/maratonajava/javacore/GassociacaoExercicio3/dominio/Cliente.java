package academy.devdogo.maratonajava.javacore.GassociacaoExercicio3.dominio;

public class Cliente {
    private String nome;
    private int idade;
    private String cpf;
    private Conta conta;

    public Cliente() {
    }

    public Cliente(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public Cliente(String nome, int idade, String cpf, Conta conta) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public void imprime(){
        System.out.println("=========================");
        System.out.println("Nome do Titular: " + nome);
        System.out.println("Idade do Titular: " + idade);
        System.out.println("CPF do Titular: " + cpf);
        System.out.println("Número da conta: " + getConta().getNumeroConta());
        System.out.println("Saldo na conta: " + getConta().getSaldo());
        System.out.println("=========================");
    }
}
