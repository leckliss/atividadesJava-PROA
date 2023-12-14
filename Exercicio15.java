package logica_programacao;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        //Crie um programa que leia o salário de um funcionário e calcule o novo salário com um aumento de 15%.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tivemos um ajuste salarial com aumento de 15%, descubra seu novo salario!");

        System.out.print("Digite seu salario atual: ");
        double salario = scanner.nextFloat();

        double ajuste = 0.15 * salario;

        double salarionovo = salario + ajuste;

        System.out.print("Esse é o seu novo salario: R$ " + salarionovo);


    }
}
