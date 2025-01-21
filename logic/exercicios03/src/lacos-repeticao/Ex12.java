// Faça um programa para calcular n! (Fatorial de n), sendo que o valor inteiro de n é fornecido pelo usuário. Sabe-se que: N! = 1 * 2 * 3 * … (n – 1) * n 0! = 1, por definição;  

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro não negativo para calcular o fatorial: ");
        int n = scanner.nextInt();

        if(n < 0) {
            System.out.println("Número inválido! O fatorial não é definido para números negativos.");
        } else {
            long fatorial = 1;

            for (int i = 1; i <= n; i++) {
                fatorial *= i;
            }

            System.out.println("O fatorial de " + n + " é: " + fatorial);
        }

        scanner.close();
    }
}
