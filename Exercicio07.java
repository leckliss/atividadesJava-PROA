package logica_programacao;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o salário base ao usuário
        System.out.print("Digite o salário base do funcionário: ");
        double salarioBase = scanner.nextDouble();

        // Calcula a comissão (5% do salário base)
        double comissao = 0.05 * salarioBase;

        // Calcula o salário líquido (salário base + comissão)
        double salarioLiquido = salarioBase + comissao;

        // Exibe o resultado
        System.out.println("Salário base: R$" + salarioBase);
        System.out.println("Comissão (5%): R$" + comissao);
        System.out.println("Salário líquido: R$" + salarioLiquido);

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}