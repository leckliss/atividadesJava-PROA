package logica_programacao;

import java.util.Scanner;

public class Exercicio02 {
    public static void main (String[]args){
        Scanner leitor = new Scanner(System.in);

        System.out.println(" Digite o raio do círculo: ");
        double raio = leitor.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        double perimetro = 2 * Math.PI * raio;

        System.out.println(" Área do círculo " + area);
        System.out.println(" Perímetro do círculo " + perimetro);
    }
}
