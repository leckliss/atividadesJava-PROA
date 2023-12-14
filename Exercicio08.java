package logica_programacao;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o primeiro número ao usuário
        System.out.print("Digite o primeiro número inteiro: ");
        int primeiroNumero = scanner.nextInt();

        // Solicita o segundo número ao usuário
        System.out.print("Digite o segundo número inteiro: ");
        int segundoNumero = scanner.nextInt();

        // Troca os valores usando uma variável temporária
        int temp = primeiroNumero;
        primeiroNumero = segundoNumero;
        segundoNumero = temp;

        // Exibe os valores trocados
        System.out.println("Valores trocados:");
        System.out.println("Primeiro número: " + primeiroNumero);
        System.out.println("Segundo número: " + segundoNumero);

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}