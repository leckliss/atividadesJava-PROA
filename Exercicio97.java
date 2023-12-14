package logica_programacao;

import java.util.Scanner;

public class exercicio97 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            int[][] matriz = new int[2][2];

            System.out.println("Digite os elementos da matriz 2x2:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print("Digite o elemento na posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                    matriz[i][j] = scanner.nextInt();
                }
            }

            int soma = 0;
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    soma += matriz[i][j];
                }
            }

            System.out.println("Matriz 2x2 informada:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("A soma de todos os elementos da matriz é: " + soma);
        }
}
