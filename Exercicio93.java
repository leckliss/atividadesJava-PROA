package logica_programacao;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio93 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite 5 nomes
        String[] nomes = new String[5];
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        Arrays.sort(nomes);

        System.out.println("Nomes em ordem alfabética: ");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

}
