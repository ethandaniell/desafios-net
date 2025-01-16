// Faça um programa que peça dois números e verifique (usando if e else) e imprima o maior deles  

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite mais um número: ");
        int num2 = scanner.nextInt();

        if(num1 > num2) {
            System.out.println("O primeiro número é maior.");
        } else {
            System.out.println("O segundo número é maior.");
        }

        scanner.close();
    }
}
