package logica_programacao;

public class Exercicio60 {
    public static void main(String[] args) {
        int num, n1 = 0, n2 = 1, n3 = 1, i = 0;

        System.out.printf("%d - %d - ", n1,n2);

        do {
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;

            if (i == 19){
                System.out.print(n3);
            }
            else {
                System.out.print(n3 + " - ");
            }
            i += 1;
        }
        while (i < 20);
        }
    }

