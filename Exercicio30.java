package logica_programacao;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        int quant;
        double vlmc;

        Scanner valor = new Scanner(System.in);

        System.out.println("MAÇÃNS DO SEU ZECA");

        System.out.print("Quantas deseja comprar ? ");
        quant = valor.nextInt();

        if (quant > 12){
            vlmc = 0.40;
        }
        else{
            vlmc = 0.50;
        }

        System.out.printf("Valor total a ser pago : R$%.2f", (quant * vlmc));
    }
}
