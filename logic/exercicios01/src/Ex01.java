// Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.println("Digite o valor de B: ");
        int b = scanner.nextInt();

        System.out.println("Digite o valor de C: ");
        int c = scanner.nextInt();

        int soma = a + b;

        if(soma > c) {
            System.out.println("O resultado de " + a + " + " + b + " é igual a " + soma + ", que é maior que C(" + c + ")");
        } else if(soma < c) {
            System.out.println("O resultado de " + a + " + " + b + " é igual a " + soma + ", que é menor que C(" + c + ")");
        } else {
            System.out.println("O resultado de " + a + " + " + b + " é igual a " + soma + ", que é igual a C(" + c + ")");
        }

        scanner.close();
       
    }
}               