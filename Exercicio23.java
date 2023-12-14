package logica_programacao;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do mês: ");
        String nomeMes = scanner.nextLine().toLowerCase(); // Converte para minúsculas para facilitar a comparação

        int diasNoMes = obterDiasNoMes(nomeMes);

        if (diasNoMes != -1) {
            System.out.println("O mês de " + nomeMes + " possui " + diasNoMes + " dias.");
        } else {
            System.out.println("Nome de mês inválido. Por favor, informe um mês válido.");
        }

        scanner.close();
    }

    private static int obterDiasNoMes(String nomeMes) {
        switch (nomeMes) {
            case "janeiro":
            case "março":
            case "maio":
            case "julho":
            case "agosto":
            case "outubro":
            case "dezembro":
                return 31;
            case "abril":
            case "junho":
            case "setembro":
            case "novembro":
                return 30;
            case "fevereiro":
                return 28; /*Ignora ano bissexto*/
            default:
                return -1; /* ta indicando se o nome é inválido e blablabla*/
        }
    }

}
