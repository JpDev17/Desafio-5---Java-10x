package Desafios4;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente() {
        super();
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        if(valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Saldo insuficiente, insira outro valor");
        }
    }
}
