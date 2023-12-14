package logica_programacao;
import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //Crie um programa que leia o peso e a altura de uma pessoa e exiba o seu Índice de Massa Corporal (IMC).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Descobrindo seu IMC");

        System.out.print("Digite o seu peso: ");
        float peso = scanner.nextFloat();

        System.out.print("Digite a sua altura(em metros): ");
        float altura = scanner.nextFloat();

        float resultado = peso / (altura * altura);

        System.out.println("Seu IMC é: " + resultado);

    }

}
