//Leia 3 vetores de 9 posições e crie outro com o 1º terço do primeiro, o segundo 3º. do segundo e o ultimo terço do 3º. Escrever o vetor resultante ao final.

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        int[] vetor1 = new int[9];
        int[] vetor2 = new int[9];
        int[] vetor3 = new int[9];
        int[] vetor4 = new int[9];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os 9 valores do primeiro vetor:");
        for (int i = 0; i < 9; i++) {
            System.out.print("Número na posição " + i + ": ");
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Digite os 9 valores do segundo vetor:");
        for (int i = 0; i < 9; i++) {
            System.out.print("Número na posição " + i + ": ");
            vetor2[i] = scanner.nextInt();
        }

        System.out.println("Digite os 9 valores do terceiro vetor:");
        for (int i = 0; i < 9; i++) {
            System.out.print("Número na posição " + i + ": ");
            vetor3[i] = scanner.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            vetor4[i] = vetor1[i];
        }

        for (int i = 3; i < 6; i++) {
            vetor4[i] = vetor2[i];
        }

        for (int i = 6; i < 9; i++) {
            vetor4[i] = vetor3[i];
        }

        System.out.println("\nVetor resultante:");
        for (int i = 0; i < 9; i++) {
            System.out.print(vetor4[i] + " ");
        }

        scanner.close();
    }
}
