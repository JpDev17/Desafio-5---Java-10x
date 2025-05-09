package Desafios4;

public abstract class ContaBancaria implements Conta {
    double saldo;

    public ContaBancaria() {
        this.saldo = 0;
    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void consultarSaldo() {
        System.out.printf("Você tem um saldo no valor de R$%.2f%n", saldo);
    }

    @Override
    public abstract void depositar(double valor);
}

