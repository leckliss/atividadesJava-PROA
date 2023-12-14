package logica_programacao;

import java.util.Scanner;

public class Exercicio78 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = leitor.nextInt();

        System.out.println("Os dígitos do número são:");

        // Transforma o número em positivo para lidar com os dígitos
        if (numero < 0) {
            numero = -numero;
        }

        // Converte o número em uma string para facilitar a separação dos dígitos
        String numeroString = Integer.toString(numero);

        // Exibe cada dígito separadamente
        for (int i = 0; i < numeroString.length(); i++) {
            char digitoChar = numeroString.charAt(i);
            int digito = Character.getNumericValue(digitoChar);
            System.out.println(digito);
        }

        leitor.close();
    }
}
