package logica_programacao;

import java.util.Scanner;

public class Exercicio56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo:");
        int num = scanner.nextInt();

        System.out.println("Os divisores do número " + num + " são:");

        int count = 1;
        do {
            if (num % count == 0) {
                System.out.println(count);
            }
            count++;
        } while (count <= num);
    }
}