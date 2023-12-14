package logica_programacao;

import java.util.Scanner;

public class Exercicio96 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Definindo a matriz 3x3
            int[][] matriz = new int[3][3];

            // Lendo os elementos da matriz
            System.out.println("Digite os elementos da matriz 3x3:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Digite o elemento na posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                    matriz[i][j] = scanner.nextInt();
                }
            }

            // Exibindo a matriz
            System.out.println("Matriz 3x3 informada:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println(); // Nova linha para separar as linhas da matriz
            }
        }
}
