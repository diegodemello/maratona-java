package academy.devdogo.maratonajava.javacore.GassociacaoExercicio3.dominio;

public class Conta {
    private int numeroConta;
    private double saldo;

    public Conta() {
    }

    public Conta(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valorDepositado){
        this.saldo += valorDepositado;
    }
}
