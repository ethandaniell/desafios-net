//Faça um programa que leia três números e mostre-os em ordem decrescente.  

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite um segundo numero: ");
        int num2 = scanner.nextInt();

        System.out.println("Digite um terceiro numero: ");
        int num3 = scanner.nextInt();

        int maior, medio, menor;

        if(num1 >= num2 && num1 >= num3) {
            maior = num1;
            if (num2 >= num3) {
                medio = num2;
                menor = num3;
            } else {
                medio = num3;
                menor = num2;
            }
        } else if(num2 >= num1 && num2 >= num3) {
            maior = num2;
            if(num1 >= num3) {
                medio = num1;
                menor = num3;
            } else {
                medio = num3;
                menor = num1;
            }
        } else {
            maior = num3;
            if (num2 >= num1) {
                medio = num2;
                menor = num1;
            } else {
                medio = num1;
                menor = num2;
            }
        }

        System.out.println("Ordem decrescente: " + maior + ", " + medio + ", " + menor);

        scanner.close();
        
    }
}
