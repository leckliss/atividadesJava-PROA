package logica_programacao;

import java.util.Scanner;

public class Exercicio57 {
    public static void main(String[] args) {
        int num, i = 1,quant = 0;

        Scanner valor = new Scanner(System.in);

        System.out.print("Digite um número inteiro e veja se ele é ou não primo : ");
        num = valor.nextInt();

        do{
            if(num % i == 0){
                quant += 1;
            }
            i += 1;
        }while(i <= num);

        if (quant == 2) {
            System.out.print("Este é um número primo.");
        }
        else{
            System.out.print("Não é um número primo");
        }
    }
}
