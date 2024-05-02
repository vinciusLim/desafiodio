package desafio_simulacaocontabancaria;

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("1 - Depositar\n" +
                    "2 - Sacar\n" +
                    "3 - Consultar Saldo\n" +
                    "4 - Encerrar");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite valor do depósito");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    break;
                case 2:
                    System.out.println("Digite valor do saque");
                    double saque = scanner.nextDouble();
                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saldo insulficiente");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 4:
                    System.out.println("Programa encerrado");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}