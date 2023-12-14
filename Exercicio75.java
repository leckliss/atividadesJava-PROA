package logica_programacao;

public class Exercicio75 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1;
        System.out.println("Os primeiros 20 números da sequência de Fibonacci são: ");

        for (int i = 1; i <= 20; ++i) {
            System.out.print(num1 + " ");

            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}