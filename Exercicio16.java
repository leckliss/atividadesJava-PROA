package logica_programacao;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        // 16. Faça um programa que verifique se um número é positivo, negativo ou zero.

        Scanner escanear = new Scanner(System.in);

        System.out.println("digite um numero " );

        double numero = escanear.nextDouble();

        if (numero > 0) {
            System.out.println("O número é positivo " + numero);
        } else if (numero < 0) {
            System.out.println("O número é negativo " + numero);
        } else {
            System.out.println("O número é zero " + numero);
        }
    }
}
