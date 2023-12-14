package logica_programacao;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio94 {

    public static void main (String[] args){
        Scanner valor = new Scanner(System.in);
        int num;
        ArrayList<Integer> Par = new ArrayList<>();

        for (int n=1; n<=7; n++){
            System.out.println("Escreva o numero " + n + ":");
            num = valor.nextInt();

            if (num % 2 == 0){
                Par.add(num);
            } else {

            }
        }

        System.out.println("numeros pares são : " + Par  );

    }
}
