package logica_programacao;

import java.util.Scanner;

public class Exercicio48 {
    public static void main (String[]args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = leitor.nextInt();

        System.out.println("Os dígitos do número são:");

        // Transforma o número em positivo para lidar com os dígitos
        if (numero < 0) {
            numero = -numero;
        }

        // Inicia o processo de separação dos dígitos
        while (numero > 0) {
            int digito = numero % 10; // Obtém o último dígito do número

            System.out.println(digito); // Exibe o dígito

            numero /= 10; // Remove o último dígito do número para continuar separando os dígitos
        }

        leitor.close();
    }
}
