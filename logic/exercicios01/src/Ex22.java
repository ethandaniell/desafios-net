//Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles.

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int A = scanner.nextInt();

        System.out.println("Digite um valor: ");
        int B = scanner.nextInt();

        int quociente = A / B;
        int resto = A % B;

        System.out.println("O quociente é igual a " + quociente + " e o resto é igual a " + resto);

        scanner.close();
    }
}
