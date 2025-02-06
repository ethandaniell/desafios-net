// Leia dois vetores de 20 posições e calcule um terceiro vetor contendo, nas posições pares os valores do primeiro e nas posições impares os valores do segundo.

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        int[] vetor1 = new int[20];
        int[] vetor2 = new int[20];
        int[] vetor3 = new int[40];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os 20 valores do primeiro vetor: ");
        for(int i = 0; i < 20; i++) {
            System.out.println("Número na posição " + i + ": ");
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Digite os 20 valores do segundo vetor: ");
        for(int i = 0; i < 20; i++) {
            System.out.println("Número na posição " + i + ": ");
            vetor2[i] = scanner.nextInt();
        }

        int k = 0; // Índice para vetor3
        for (int i = 0; i < 20; i++) {
            if (vetor1[i] % 2 == 0) {
                vetor3[k] = vetor1[i];
                k++;
            }
            if (vetor2[i] % 2 != 0) {
                vetor3[k] = vetor2[i];
                k++;
            }
        }

        System.out.println("\nVetor3 (pares de vetor1 e ímpares de vetor2):");
        for (int i = 0; i < k; i++) { 
            System.out.print(vetor3[i] + " ");
        }

        scanner.close();
    }
}
