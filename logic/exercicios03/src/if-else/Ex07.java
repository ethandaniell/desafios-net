//Faça um programa que leia três números, verifique (usando if e else), e mostre o maior deles.  

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite um segundo numero: ");
        int num2 = scanner.nextInt();

        System.out.println("Digite um terceiro numero: ");
        int num3 = scanner.nextInt();

        if(num1 > num2 && num1 > num3) {
            System.out.println("O maior é " + num1);
        } else if(num2 > num1 && num2 > num3) {
            System.out.println("O maior é " + num2);
        } else {
            System.out.println("O maior é " + num3);
        }

        scanner.close();
    }
}
