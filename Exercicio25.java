package logica_programacao;

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de faltas do aluno: ");
        int numeroFaltas = scanner.nextInt();

        if (numeroFaltas > 15) {
            System.out.println("Situação do aluno: Reprovado por falta.");
        } else {
            System.out.println("Situação do aluno: Aprovado.");
        }

        scanner.close();
    }
}
