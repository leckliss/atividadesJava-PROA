package logica_programacao;
import java.util.Scanner;

public class Exercicio21 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Quantas pessoas no grupo? ");
            int totalPessoas = scanner.nextInt();

            int menoresDeIdade = 0;
            int maioresDeIdade = 0;

            for (int i = 0; i < totalPessoas; i++) {
                System.out.print("Informe a idade da pessoa " + (i + 1) + ": ");
                int idade = scanner.nextInt();

                if (idade < 18) {
                    menoresDeIdade++;
                } else {
                    maioresDeIdade++;
                }
            }

            System.out.println("Quantidade de pessoas menores de idade: " + menoresDeIdade);
            System.out.println("Quantidade de pessoas maiores de idade: " + maioresDeIdade);

            scanner.close();
        }
}

