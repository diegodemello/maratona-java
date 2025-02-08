package academy.devdogo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;

    static {
        System.out.println("Dentro do bloco de inicialização estático de pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização de pessoa 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de pessoa 2");
    }


    public Pessoa(String nome) {
        System.out.println("Dentro do construtor pessoa");
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua());
        System.out.println(this.endereco.getCep());
    }
}
