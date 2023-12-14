package logica_programacao;

import java.util.Scanner;

public class Exercicio54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;

        do {
            System.out.println("Digite um número inteiro:");
            int num = scanner.nextInt();
            sum += num;
            count++;
        } while (count < 5);

        double average = sum / count;
        System.out.println("A média aritmética dos valores lidos é: " + average);
    }
}