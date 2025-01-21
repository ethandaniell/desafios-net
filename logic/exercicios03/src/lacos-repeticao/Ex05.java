//Faça um programa que receba a idade de dez pessoas e que calcule e mostre a quantidade de pessoas com idade maior ou igual a 18 anos.

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cont = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

            if (idade >= 18) {
                cont++;
            }
        }

        System.out.println("Quantidade de pessoas com 18 anos ou mais: " + cont);

        scanner.close();
    }
}
