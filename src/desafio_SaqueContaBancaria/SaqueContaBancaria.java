package desafio_SaqueContaBancaria;

import java.util.Scanner;

public class SaqueContaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double limiteDiario = scanner.nextDouble();

        double saqueTotal = 0;

        for (int i = 1;; i++) {
            double saque = scanner.nextDouble();

            if (saque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            }

            if (saqueTotal + saque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }
            saqueTotal += saque;
            double limiteRestante = limiteDiario - saqueTotal;
            System.out.println("Saque realizado. Limite restante: " + limiteRestante);
        }

        scanner.close();
    }
}
