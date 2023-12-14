package logica_programacao;

public class Exercicio37 {
    public static void main (String[] args){
        int contar = 1;
        int soma = 0;

        while (contar <= 100) {
            soma += contar;
            contar++;
        }

        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}
