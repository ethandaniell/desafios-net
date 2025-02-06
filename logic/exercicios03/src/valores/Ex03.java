// Leia um vetor de 16 posições e troque os 8 primeiros valores pelos 8 últimos e vice-e-versa. Escreva ao final o vetor obtido.

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[16];

        System.out.println("Digite os 16 valores do vetor:");
        for(int i = 0; i < 16; i++) {
            System.out.print("Posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        for(int i = 0; i < 8; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[i + 8];
            vetor[i + 8] = temp; 
        }

        System.out.println("\nVetor após a troca:");
        for (int i = 0; i < 16; i++) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }
}
