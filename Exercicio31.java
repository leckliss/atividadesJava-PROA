package logica_programacao;
import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        float salario_minimo, salario_funcionario, qtd_salario;
        String nome;

        System.out.print("Informe o valor atual do salário mínimo: R$");
        salario_minimo = scanner.nextFloat();

        System.out.print("Informe o nome do funcionario: ");
        nome = scanner.next();

       System.out.print("Informe o valor do salário de "+ nome+ ": R$");
        salario_funcionario = scanner.nextFloat();

        qtd_salario = salario_funcionario/salario_minimo;

        if(qtd_salario > 1){
            System.out.printf("%s recebe %.2f salários mínimos%n", nome, qtd_salario);
        } else {
            System.out.printf("%s recebe %.2f salário mínimo%n", nome, qtd_salario);
        }

        scanner.close();
    }

}
