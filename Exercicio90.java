package logica_programacao;

import java.util.Scanner;

public class Exercicio90 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            boolean temZero = false;

            for (int i = 0; i < 5; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                int numero = scanner.nextInt();

                if (numero == 0) {
                    temZero = true;
                    break;
                }
            }
            if (temZero) {
                System.out.println("Pelo menos um dos números é igual a zero.");
            } else {
                System.out.println("Nenhum dos números é igual a zero.");
            }
        }
}
