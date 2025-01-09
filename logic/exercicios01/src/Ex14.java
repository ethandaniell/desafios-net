//Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor para A: ");
        int A = scanner.nextInt();
        
        System.out.println("Digite um valor para B: ");
        int B = scanner.nextInt();

        System.out.println("O valor de A é igual a " + B + " e o valor de B é igual a " + A );

        scanner.close();
    }
}
