package logica_programacao;

import java.util.Scanner;

public class Exercicio58 {
    public static void main(String[] args) {
        int num, n1 = 0, n2 = 1, n3 = 1, i = 0;

        Scanner valor = new Scanner(System.in);

        System.out.println("Sequência de Fibonacci");
        System.out.print("Até qual número deseja ? ");
        num = valor.nextInt();

        if (num == 2) {
            System.out.printf("%d - %d", n1, n2);
        }
        else if( num == 1){
            System.out.print(n1);
        }
        else if(num > 2){
            System.out.printf("%d - %d - ", n1,n2);
        }

        if (num > 2) {
            do {
                if (i == num) {
                    System.out.print(n3);
                } else {
                    System.out.print(n3 + " - ");
                }
                n1 = n2;
                n2 = n3;
                n3 = n1 + n2;

                i += 1;
            }
            while (i < num - 2);
        }
    }
}
