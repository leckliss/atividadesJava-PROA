package logica_programacao;

import java.util.Scanner;

public class Exercicio04 {
    public static void main (String[]args){
        Scanner leitor = new Scanner(System.in);

        System.out.println(" Digite a primeira nota: ");
        double nota1 = leitor.nextDouble();

        System.out.println(" Digite a segunda nota: ");
        double nota2 = leitor.nextDouble();

        System.out.println(" Digite a terceira nota: ");
        double nota3 = leitor.nextDouble();

        if (nota1 >=0 && nota1 <=10 && nota2 >=0 && nota2 <=10 && nota3 >=0 && nota3 <=10){
            double media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / (2+3+5);

            System.out.println(" A média ponderada é: " + media);
        }else {
            System.out.println(" Por favor, insira notas válidas entre 0 e 10. ");
        }
    }
}
