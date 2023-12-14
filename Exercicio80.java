package logica_programacao;

import java.util.Scanner;

public class Exercicio80 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int somaIdades = 0;
        int quantidadePessoas = 0;
        String nomePessoa = "";

        System.out.println("Digite 'fim' no nome para encerrar o programa.");

        while (!nomePessoa.equalsIgnoreCase("fim")) {
            System.out.print("Digite o nome da pessoa: ");
            nomePessoa = leitor.nextLine();

            if (!nomePessoa.equalsIgnoreCase("fim")) {
                System.out.print("Digite a idade de " + nomePessoa + ": ");
                int idade = leitor.nextInt();
                leitor.nextLine(); // Limpa o buffer

                somaIdades += idade;
                quantidadePessoas++;
            }
        }

        if (quantidadePessoas > 0) {
            double mediaIdades = (double) somaIdades / quantidadePessoas;
            System.out.println("A média das idades é: " + mediaIdades);
        } else {
            System.out.println("Nenhuma idade foi inserida.");
        }

        leitor.close();

    }
}
