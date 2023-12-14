package logica_programacao;

import java.util.Scanner;

public class Exercico109 {

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

            boolean ehIdentidade = verificarMatrizIdentidade(matriz);

            System.out.println("Matriz 3x3 informada:");
            exibirMatriz(matriz);

            if (ehIdentidade) {
                System.out.println("A matriz é uma matriz identidade.");
            } else {
                System.out.println("A matriz não é uma matriz identidade.");
            }

        }


        private static boolean verificarMatrizIdentidade(int[][] matriz) {

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if ((i != j && matriz[i][j] != 0) || (i == j && matriz[i][j] != 1)) {
                        return false;
                    }
                }
            }
            return true;
        }

        private static void exibirMatriz(int[][] matriz) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
                System.out.println();
            }   }
}
