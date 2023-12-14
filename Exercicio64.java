package logica_programacao;

import java.util.Scanner;

public class Exercicio64 {
    public static void main (String[]args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = leitor.nextInt();

        int fatorial = 1;
        int contador = 1;

        do {
            fatorial *= contador;
            contador++;
        } while (contador <= numero);

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        leitor.close();
    }
}
