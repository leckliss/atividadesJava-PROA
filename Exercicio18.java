package logica_programacao;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        // 18. Crie um programa que leia
        // dois números inteiros e exiba o maior deles.

        Scanner escanear = new Scanner(System.in);

        System.out.println("digite um numero inteiro ");
        int numero1 = escanear.nextInt();

        System.out.println("digite outro numero inteiro ");
        int numero2 = escanear.nextInt();

        if(numero1==numero2){
            System.out.println("Números iguais: " + numero1 + numero2);
        }else if(numero1>numero2){
            System.out.println("Primeiro é maior: " + numero1);
        }else{
            System.out.println("Segundo é maior: " + numero2);
        }
    }
}
