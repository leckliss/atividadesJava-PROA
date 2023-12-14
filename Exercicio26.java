package logica_programacao;

import java.util.Scanner;

public class Exercicio26 {
        public static void main(String[] args) {
            int cod, quant, preco, c123 = 150, c456 = 80, c789 = 95, vltotal = 0, soma = 0;
            String cont;

            Scanner valor = new Scanner(System.in);

            System.out.println(" --- Lojas Fit --- \n" +
                    "123 - Whey Protein\n" +
                    "456 - Creatina\n" +
                    "789 - Pré Treino\n" +
                    "------------------");
            while (true){
                System.out.print("Código do produto : ");
                cod = valor.nextInt();

                while (cod != 123 && cod != 456 && cod != 789){
                    System.out.println("Código inválido, digite novamdente");
                    System.out.print("Código do produto : ");
                    cod = valor.nextInt();
                }

                System.out.print("Quantidade escolhida : ");
                quant = valor.nextInt();

                if (cod == 123){
                    soma = c123 * quant;
                    vltotal += soma;
                }
                else if (cod == 456){
                    soma = c456 * quant;
                    vltotal += soma;
                }
                else if (cod == 789){
                    soma = c789 * quant;
                    vltotal += soma;
                }

                System.out.print("Deseja outro produto ? (S ou N) ");
                cont = valor.next().toUpperCase();

                if (cont.equals("N")){
                    break;
                }
            }
            System.out.print("Valor total da compra : R$" + vltotal);
        }
}
