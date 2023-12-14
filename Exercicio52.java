package logica_programacao;

public class Exercicio52 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        do {
            sum += num;
            num++;
        } while (num <= 100);

        System.out.println("A soma dos números de 1 a 100 é: " + sum);
    }
}