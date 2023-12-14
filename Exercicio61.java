package logica_programacao;

import java.util.Scanner;

public class Exercicio61 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int valor, cont, par;

        System.out.print("Informe um valor: ");
        valor = scanner.nextInt();

        cont = 1;
        par = 0;

        do{
            if(cont % 2 == 0){
                par = par + cont;
            }

            cont++;
        } while( cont <= valor);

        System.out.println("Resultado da soma dos números entre 1 e "+ valor + " é : " + par);
    }
}
