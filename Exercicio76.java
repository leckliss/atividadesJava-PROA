package logica_programacao;

import java.util.Scanner;

public class Exercicio76 {
    public static void main (String[]args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = leitor.nextInt();

        int somaPares = 0; // Variável para armazenar a soma dos números pares

        for (int i = 2; i <= numero; i += 2) {
            somaPares += i; // Adiciona o número par atual à soma
        }

        System.out.println("A soma dos números pares até " + numero + " é: " + somaPares);

        leitor.close();
    }
}
