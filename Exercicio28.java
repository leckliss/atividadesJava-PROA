package logica_programacao;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        float peso, alt, imc;

        Scanner valor = new Scanner(System.in);

        System.out.println("Cálculo de IMC");
        System.out.print("Digite seu peso : (kg) ");
        peso = valor.nextFloat();

        System.out.print("Digite sua altura : (m) ");
        alt = valor.nextFloat();

        imc = (peso / (alt * alt));

        System.out.printf("Seu IMC está igual a : %.2f \n", imc);

        if (imc < 18.4){
            System.out.println("Abaixo do peso");
        }
        else if (imc > 18.4 && imc < 24.9){
            System.out.println("Peso normal");
        }
        else if (imc < 24.9 && imc < 30){
            System.out.println("Acima do peso");
        }
        else if (imc >= 30 && imc < 35){
            System.out.println("Obesidade grau I");
        }
        else if (imc >= 35 && imc < 40){
            System.out.println("Obesidade grau II");
        }
        else{
            System.out.println("Obesidade grau III");
        }
    }
}
