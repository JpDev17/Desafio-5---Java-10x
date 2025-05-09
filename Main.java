package Desafios4;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("============ CONTA CORRENTE ============");
        System.out.print("Digite o valor do seu saldo: R$");
        double valorSaldoContaCorrente = sc.nextDouble();
        System.out.print("Digite o valor de depósito: R$");
        double valorDepositoContaCorrente = sc.nextDouble();

        ContaCorrente conta = new ContaCorrente(valorSaldoContaCorrente);
        conta.depositar(valorDepositoContaCorrente);
        conta.consultarSaldo();

        System.out.println("============ CONTA POUPANÇA ============");
        System.out.print("Digite o valor do seu saldo: R$");
        double valorSaldoContaPoupanca = sc.nextDouble();
        System.out.print("Digite o valor de depósito: R$");
        double valorDepositoContaPoupanca = sc.nextDouble();

        ContaCorrente contaDois = new ContaCorrente(valorSaldoContaPoupanca);
        contaDois.depositar(valorDepositoContaPoupanca);
        contaDois.consultarSaldo();

        sc.close();
    }
}
