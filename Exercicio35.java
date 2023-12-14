package logica_programacao;
import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        float n1, n2, n3, media;

        System.out.print("Informe o primeiro número: ");
        n1 = scanner.nextFloat();

        System.out.print("Informe o segundo número: ");
        n2 = scanner.nextFloat();

        System.out.print("Informe o terceiro número: ");
        n3 = scanner.nextFloat();

        media = (n1+n2+n3)/3;

        if(media >= 7){
            System.out.println("Aprovado");
            System.out.printf("Média: %.2f", media);
        }else{
            System.out.println("Reprovado");
            System.out.printf("Média: %.2f", media);
        }
    }
}
