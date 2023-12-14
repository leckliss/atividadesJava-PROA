package logica_programacao;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        do{

            System.out.print("Informe o seu nome: ");
            String aluno = scanner.next();

            System.out.print("Informe o período que você estuda\n (M) Matutino/Manhã     (V) Vespertino/Tarde \nSelecione: ");
            char periodo = scanner.next().charAt(0);
            periodo = Character.toLowerCase(periodo);

            switch (periodo){
                case 'm':
                    System.out.println("Bom dia "+ aluno);
                    System.out.println("Tenha uma boa aula");
                    break;
                case 'v':
                    System.out.println("Boa tarde "+ aluno);
                    System.out.println("Tenha uma boa aula");
                    break;
                default:
                    System.out.println("Período inválido");
            }

            boolean validacao = true;

            while (validacao) {
                System.out.print("Deseja continuar? ");
                String resposta = scanner.next().toLowerCase();

                if ( "sim" .equals(resposta) || "s" .equals(resposta) ) {
                    validacao = false;

                } else if ("nao".equals(resposta) || "n".equals(resposta) || "não".equals(resposta)) {
                    validacao = false;
                    continuar = false;
                } else {
                    System.out.println("Resposta inválida");
                }
            }

        }while(continuar);

    }
}
