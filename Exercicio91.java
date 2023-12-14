package logica_programacao;

import java.util.Scanner;

public class Exercicio91 {

    public static void main (String[] args){

        Scanner valor = new Scanner(System.in);
        int num;
        int somap = 0;
        int soman = 0;

        for (int n=1; n<=10; n++){
            System.out.println("Escreva o numero " + n + ":");
            num = valor.nextInt();

            if (num > 0){
                somap = num + somap;
            } else if (num < 0) {
                soman = num + soman;
            }
        }

        System.out.println("Soma dos positivos : " + somap  );
        System.out.println("Soma dos negativos : " + soman);

    }
}
