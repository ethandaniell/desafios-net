// Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        if(num >= 0) {
            if(num % 2 == 0) {
                System.out.println("O número " + num + " é par e positivo.");
            } else {
                System.out.println("O número " + num + " é impar e positivo.");
            }
        } else {
            if(num % 2 == 0) {
                System.out.println("O número " + num + " é par e negativo.");
            } else {
                System.out.println("O número " + num + " é impar e negativo.");
            }
        }

        scanner.close();
        
    }
}
