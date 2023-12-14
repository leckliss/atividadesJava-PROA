package logica_programacao;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        // 17. Escreva um programa que leia a idade
        // de uma pessoa e exiba uma mensagem indicando
        // se ela é criança, adolescente, adulto ou idoso.

        Scanner escanear = new Scanner(System.in);

        System.out.println("digite sua idade " );

        int idade = escanear.nextInt();

        if (idade <=12) {
            System.out.println("Criança.");
        }   else if (idade <= 17) {
            System.out.println("Adolescente.");
        } else if (idade <= 59) {
            System.out.println("Adulto.");
        } else {
            System.out.println("Idoso.");
        }
    }
}
