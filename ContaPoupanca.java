package Desafios4;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void consultarSaldo() {
    }

    @Override
    public void depositar(double valor) {
        if(valor > 0) {
            saldo = valor - (valor * 0.01);
        } else {
            System.out.println("Valor insuficiente, insira outro valor");
        }
    }
}
