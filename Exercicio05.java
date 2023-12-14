package logica_programacao;

import java.util.Scanner;

public class Exercicio05 {
    public static void main (String[]args){
        Scanner leitor = new Scanner(System.in);

        System.out.println(" Digite o preço do produto: ");
        double preco = leitor.nextDouble();

        System.out.println(" Digite a quantidade comprada: ");
        int quantidade = leitor.nextInt();

        double valorTotal;

        if (quantidade > 10){
            double desconto = 0.10 * preco * quantidade;
            valorTotal = preco * quantidade - desconto;
        }else {
            valorTotal = preco * quantidade;
        }
        System.out.println(" O valor total a ser pago é: " + valorTotal);
    }
}
