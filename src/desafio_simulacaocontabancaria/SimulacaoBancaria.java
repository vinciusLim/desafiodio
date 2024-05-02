package desafio_simulacaocontabancaria;

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean emExecucao = true;

        while (emExecucao) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
//                    System.out.println("Digite valor do deposito");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo atual:" + saldo);
                    break;
                case 2:
//                    System.out.println("Digite valor do saque");
                    double saque = scanner.nextDouble();
                    if (saque > saldo) {

                        System.out.println("Saldo insulficiente.");
                    }else{
                        saldo -= saque;
                        System.out.println("Saldo atual:" + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual:" + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    emExecucao = false;
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}