package logica_programacao;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        // 19. Faça um programa que receba três notas
        // de um aluno e exiba se ele foi aprovado ou reprovado.
        // A média para aprovação é 7.

        Scanner escanear = new Scanner(System.in);

        System.out.println("Entre com o 1 nota:");
        double nota1 = escanear.nextDouble();

        System.out.println("Entre com o 2 nota:");
        double nota2 = escanear.nextDouble();

        System.out.println("Entre com o 3 nota:");
        double nota3 = escanear.nextDouble();

        double media = (nota1 + nota2 + nota3)/3;

        System.out.printf("o media das 3 notas é: %.2f ", media);

        if(media>=7){
            System.out.println("aluno aprovado!");
        }else if(media==7){
            System.out.println("aluno recuperacao!");
        }else{
            System.out.println("aluno de reprovado!");
        }

    }
}
