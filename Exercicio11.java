
package logica_programacao;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Escreva um programa que calcule a média aritmética entre três números reais inseridos pelo usuário.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos calcular a média aritmetica!");

        System.out.print("Digite o primeiro numero: ");
        float numero1 = scanner.nextFloat();

        System.out.print("Digite o segundo numero: ");
        float numero2 = scanner.nextFloat();

        System.out.print("Digite o terceiro numero: ");
        float numero3 = scanner.nextFloat();

        float resultado = (numero1 + numero2 + numero3)/3;

        System.out.print("O resultado da média aritmetica desses numero é: " + resultado);



    }

}