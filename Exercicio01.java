package logica_programacao;

import java.util.Scanner;

public class Exercicio01 {
    public static void main (String[]args){
        Scanner leitor = new Scanner(System.in);

        System.out.println(" Digite o primeiro número inteiro: ");
        int numero1 = leitor.nextInt();

        System.out.println(" Digite o segundo número inteiro: ");
        int numero2 = leitor.nextInt();

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        int divisao = numero2 != 0 ? numero1 / numero2 : 0;

        System.out.println(" Soma: " + soma);
        System.out.println(" Subtração: " + subtracao);
        System.out.println(" Multiplicação: " + multiplicacao);
        System.out.println(" Divisão: " + divisao);

    }
}
