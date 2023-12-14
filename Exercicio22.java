package logica_programacao;

import java.util.Scanner;

public class Exercicio22 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Informe o salário do funcionário: R$ ");
            double salario = scanner.nextDouble();

            /*Aqui ele ta verificando se o salário é maior que R$ 2000*/
            if (salario > 2000) {
                /*bonus = 10%*/
                double bonus = salario * 0.10;
                System.out.println("Bônus: R$ " + bonus);
            } else {
                /* bonus = 5% */
                double bonus = salario * 0.05;
                System.out.println("Bônus: R$ " + bonus);
            }

            scanner.close();
        }

}
