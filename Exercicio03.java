package logica_programacao;

import java.util.Scanner;

public class Exercicio03 {
    public static void main (String[]args){

        Scanner leitor = new Scanner(System.in);

        System.out.println(" Digite a base do triângulo: ");
        double base = leitor.nextDouble();

        System.out.println(" Digite a altura do triângulo: ");
        double altura = leitor.nextDouble();

        double area = (base * altura) / 2;

        System.out.println(" A área do triângulo é: " + area);
    }
}
