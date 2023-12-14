package logica_programacao;

import java.util.Scanner;

public class Exercicio73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = scanner.nextInt();
        scanner.close();

        int num1 = 0, num2 = 1;
        System.out.println("A sequência de Fibonacci até " + num + " é: ");

        for (int i = 1; i <= num; ++i) {
            System.out.print(num1 + " ");

            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}