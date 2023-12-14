package logica_programacao;

import java.util.Scanner;

public class Exercicio59 {
    public static void main(String[] args) {
        String nome;
        int idade, quant = 0, soma = 0, i = 0;

        Scanner valor = new Scanner(System.in);

        do{
            System.out.print("Digite seu nome : ");
            nome = valor.next();

            System.out.print("Idade : ");
            idade = valor.nextInt();

            quant += 1;
            soma += idade;

            i += 1;
        }while (i < 5);

        System.out.print("A média entre as idades digitadas foi de : " + (soma / quant));
    }
}
