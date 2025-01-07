//  Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        int antecessor = num - 1;
        int sucessor = num + 1;

        System.out.println("O antecessor do número " + num + " é o número " + antecessor + " e o número sucessor é " + sucessor);

        scanner.close();
    }
}
