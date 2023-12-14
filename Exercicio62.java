package logica_programacao;

public class Exercicio62 {
    public static void main(String[] args){

        int valor = 0;

        do {
            if(valor % 2 == 1){
                System.out.println(valor);
            }

            valor++;
        } while(valor <= 50);

    }
}
