package AtividadeJava;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita um número inteiro ao usuário
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Exibe a tabuada de multiplicação até o décimo valor
        System.out.println("Tabuada de multiplicação para o número " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}