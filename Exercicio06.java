package logica_programacao;

import java.util.Scanner;

public class Exercicio06 {
    public static void main (String[]args){
        Scanner leitor = new Scanner(System.in);

        System.out.println(" Digite um número inteiro: ");
        int numero = leitor.nextInt();

        if (numero % 2==0){
            System.out.println(numero + " é um número par. ");
        }else {
            System.out.println(numero + " é um número ímpar. ");
        }
    }
}
