package logica_programacao;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do aluno: ");
        String aluno = scanner.nextLine();

        System.out.print("Informe a nota do " + aluno+ ": ");
        double nota = scanner.nextDouble();

        char conceito;

        if (nota >= 9.0) {
            conceito = 'A';
        } else if (nota >= 7.0) {
            conceito = 'B';
        } else if (nota >= 5.0) {
            conceito = 'C';
        } else if (nota >= 3.0) {
            conceito = 'D';
        } else {
            conceito = 'F';
        }


        System.out.print("nota do "+ aluno+": "+nota+"\nConceito: "+ conceito);

        scanner.close();
    }

}
