package logica_programacao;

import java.util.Scanner;

public class Exercicio98 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[][] matriz = new int[3][3];

            System.out.println("Digite os elementos da matriz 3x3:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Digite o elemento na posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                    matriz[i][j] = scanner.nextInt();
                }
            }

            int somaDiagonalPrincipal = 0;
            for (int i = 0; i < 3; i++) {
                somaDiagonalPrincipal += matriz[i][i];
            }


            System.out.println("Matriz 3x3 informada:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("A soma dos elementos da diagonal principal é: " + somaDiagonalPrincipal);
        }
}
