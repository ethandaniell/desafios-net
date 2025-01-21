// Faça um programa que receba um número e usando laços de repetição calcule e mostre a tabuada desse número.

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int num = scanner.nextInt();

        for(int i = 0; i <= 10; i++) {
            int tabuada = i * num;

            System.out.println(num + " X " + i + " = " + tabuada);
        }

        scanner.close();
    }
}
