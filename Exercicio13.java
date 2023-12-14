package logica_programacao;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        //Faça um programa que leia dois números inteiros e verifique se o primeiro é múltiplo do segundo.

        Scanner scanner = new Scanner(System.in);

        System.out.println("MULTIPLOS");

        System.out.print("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        if (numero1 % numero2 == 0) {
            System.out.println(numero1 + " é múltiplo de " + numero2);
        } else {
            System.out.println(numero1 + " não é múltiplo de " + numero2);
        }

    }
}
