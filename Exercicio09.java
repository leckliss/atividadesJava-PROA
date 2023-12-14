package logica_programacao;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o valor do depósito mensal ao usuário
        System.out.print("Digite o valor do depósito mensal: ");
        double depositoMensal = scanner.nextDouble();

        // Solicita a taxa de juros mensal ao usuário
        System.out.print("Digite a taxa de juros mensal (em decimal): ");
        double taxaJurosMensal = scanner.nextDouble();

        // Define o número de meses
        int meses = 12;

        // Calcula o montante após 12 meses
        double montante = calcularMontante(depositoMensal, taxaJurosMensal, meses);

        // Exibe o resultado
        System.out.println("O montante após 12 meses é: R$" + montante);

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }

    // Função para calcular o montante após um determinado número de meses
    public static double calcularMontante(double depositoMensal, double taxaJurosMensal, int meses) {
        double montante = 0;
        for (int i = 0; i < meses; i++) {
            montante += depositoMensal;
            montante *= (1 + taxaJurosMensal);
        }
        return montante;
    }
}