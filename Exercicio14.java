package logica_programacao;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        //Escreva um programa que leia a idade de uma pessoa em anos, meses e dias, e calcule quantos dias de vida ela tem.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos descobrir a sua idade em dias? ");

        System.out.print("Digite quantos anos vc tem: ");
        int anos = scanner.nextInt();

        System.out.print("Digite quantos meses vc tem: ");
        int meses = scanner.nextInt();

        System.out.print("Digite quantos dias vc tem: ");
        int dias = scanner.nextInt();

        int resultado = (anos*365) + (meses*30) + dias;

        System.out.print("Você tem " + resultado + " dias de vida!");
    }
}
