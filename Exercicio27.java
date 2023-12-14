package logica_programacao;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        String nome, sexo;
        int idade;

        Scanner valor = new Scanner(System.in);

        System.out.print("Nome : ");
        nome = valor.next();

        System.out.print("Sexo (M/F) : ");
        sexo = valor.next().toUpperCase();

        while (!sexo.equals("M") && !sexo.equals("F")){
            System.out.print("Sexo inválido, digite novamente");

            System.out.print("Sexo (M/F) : ");
            sexo = valor.next().toUpperCase();
        }
        System.out.print("Idade : ");
        idade = valor.nextInt();

        if (sexo.equals("M") && idade >= 65){
            System.out.println(String.format("Olá %s, você possui %d anos e pode se aposentar", nome, idade));
        }
        else if (sexo.equals("F") && idade >= 60){
            System.out.println(String.format("Olá %s, você possui %d anos e pode se aposentar", nome, idade));
        }
        else{
            System.out.println(String.format("Olá %s, você possui %d anos e não pode se aposentar", nome, idade));
        }
    }
}
