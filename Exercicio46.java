package logica_programacao;

import java.util.Scanner;

public class Exercicio46 {
    public static void main (String[]args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = leitor.nextInt();

        int somaPares = 0; // Variável para armazenar a soma dos números pares
        int contador = 2; // Começamos em 2, pois é o primeiro número par

        while (contador <= numero) {
            somaPares += contador; // Adiciona o número par atual à soma

            // Avança para o próximo número par (incrementa de 2 em 2)
            contador += 2;
        }

        System.out.println("A soma dos números pares até " + numero + " é: " + somaPares);

        leitor.close();
    }
}
