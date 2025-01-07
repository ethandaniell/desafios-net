// Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores, caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor para A: ");
        int a = scanner.nextInt();

        System.out.println("Digite um valor para B: ");
        int b = scanner.nextInt();

        if(a != b) {
           int c = a * b;
           System.out.println("O valor de C é igual a " + c);
        } else {
            int c = a + b;
            System.out.println("O valor de C é igual a " + c);
        }

        scanner.close();
    }
}
