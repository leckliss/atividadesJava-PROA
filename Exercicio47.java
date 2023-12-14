package logica_programacao;

public class Exercicio47 {
    public static void main (String[]args){
        int numero = 1; // Começamos com o primeiro número ímpar

        while (numero <= 50) {
            System.out.println(numero); // Mostra o número ímpar atual

            // Avança para o próximo número ímpar (incrementa de 2 em 2)
            numero += 2;
        }
    }
}
