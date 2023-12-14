package logica_programacao;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o seu nome: ");
        String nome = scanner.next();

        System.out.print("Informe a sua idade: ");
        int idade = scanner.nextInt();

        if(idade > 0 && idade < 16){
            System.out.println(nome + ", você não pode votar");
        } else if ((idade >= 16 && idade < 18) || idade > 70){
            System.out.println(nome + ", o seu voto é opcional");
        } else if (idade >= 18 && idade <= 70){
            System.out.println(nome + ", seu voto é obrigatório");
        } else {
            System.out.println("Idade inválida");
        }

    }
}
