package logica_programacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio92 {

    public static void main (String[] args){

        Scanner valor = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        int qtd = 5;

        for (int i = 1; i < qtd; i++) {
            System.out.print("Digite um número " + i + ": ");
            int elemento = valor.nextInt();
            lista.add(elemento);
        }

        Collections.sort(lista, Collections.reverseOrder()); // Ordena os elementos em ordem decrescente
        System.out.println(lista);

    }

}
