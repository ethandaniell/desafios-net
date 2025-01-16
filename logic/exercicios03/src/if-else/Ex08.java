// Faça um programa que leia três números, verifique (usando if e else) e mostre o maior e o menor deles;  

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite um segundo numero: ");
        int num2 = scanner.nextInt();

        System.out.println("Digite um terceiro numero: ");
        int num3 = scanner.nextInt();

        int maior, menor;

        if(num1 >= num2 && num1 >= num3) {
            maior = num1;
            if (num2 >= num3) {
                menor = num3;
            } else {
                menor = num2;
            }
        } else if(num2 >= num1 && num2 >= num3) {
            maior = num2;
            if(num1 >= num3) {
                menor = num3;
            } else {
                menor = num1;
            }
        } else {
            maior = num3;
            if (num2 >= num1) {
                menor = num1;
            } else {
                menor = num2;
            }
        }

        System.out.println("O maior é " + maior + " e o menor é " + menor);

        scanner.close();
        
    }
}
