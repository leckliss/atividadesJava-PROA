package logica_programacao;

import java.util.Scanner;

public class Exercicio72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = scanner.nextInt();
        scanner.close();

        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(num + " não é um número primo.");
                    return;
                }
            }
            System.out.println(num + " é um número primo.");
        } else {
            System.out.println(num + " não é um número primo.");
        }
    }
}