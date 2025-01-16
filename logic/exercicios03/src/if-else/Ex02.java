// Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo  

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int num = scanner.nextInt();

        if(num > 0) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é negativo.");
        }

        scanner.close();
    }
}
