package logica_programacao;

import java.util.Scanner;

public class Exercicio74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
        int[] ages = new int[5];
        double totalAge = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome da " + (i + 1) + "ª pessoa: ");
            names[i] = scanner.next();
            System.out.println("Digite a idade da " + (i + 1) + "ª pessoa: ");
            ages[i] = scanner.nextInt();
            totalAge += ages[i];
        }
        scanner.close();

        System.out.println("A média das idades é: " + (totalAge / 5));
    }
}