package academy.devdogo.maratonajava.javacore.GassociacaoExercicio2.dominio;

public class Endereco {
    private String endereco;
    private int numero;
    private String cep;

    public Endereco() {
    }

    public Endereco(String endereco, int numero, String cep) {
        this.endereco = endereco;
        this.numero = numero;
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
