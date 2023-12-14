package logica_programacao;

import java.util.Scanner;

public class Exercicio55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int num = scanner.nextInt();

        int count = 1;
        do {
            System.out.println(num + " x " + count + " = " + (num * count));
            count++;
        } while (count <= 10);
    }
}