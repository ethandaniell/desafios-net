// Leia um vetor de 40 posições e acumule os valores do primeiro elemento no segundo, deste no terceiro e assim por diante. Ao final, escreva o vetor obtido.

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[40];

        System.out.println("Digite 40 números para preencher o vetor: ");
        for(int i = 0; i < 40; i++) {
            System.out.println("Número na posição " + i + ": ");
            nums[i] = scanner.nextInt();
        }

        for(int i = 1; i < 40; i++) {
            nums[i] += nums[i - 1]; // Soma o valor anterior ao atual
        }

        System.out.println("\nVetor acumulado:");
        for (int i = 0; i < 40; i++) {
            System.out.print(nums[i] + " ");
        }

        scanner.close();
    }   
}
