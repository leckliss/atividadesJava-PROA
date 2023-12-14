package logica_programacao;

import java.util.Scanner;

public class Exercicio49 {
    public static void main (String[]args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = leitor.nextInt();

        int fatorial = 1; // Inicializa o fatorial como 1

        // Calcula o fatorial usando um loop while
        int contador = 1;
        while (contador <= numero) {
            fatorial *= contador; // Multiplica o fatorial pelo contador
            contador++; // Incrementa o contador para avançar para o próximo número
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        leitor.close();
    }
}
