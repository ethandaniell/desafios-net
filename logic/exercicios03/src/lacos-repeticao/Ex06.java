//Faça um programa que leia três valores (A, B, C) e mostre-os na ordem lida.  Em seguida, mostre-os em ordem crescente e decrescente.

import java.util.Arrays;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor para A: ");
        int A = scanner.nextInt();

        System.out.println("Digite um valor para B: ");
        int B = scanner.nextInt();

        System.out.println("Digite um valor para C: ");
        int C = scanner.nextInt();

        int[] numsOriginal = {A, B, C};
        int[] nums = numsOriginal.clone();

        Arrays.sort(nums);

        System.out.println("\nValores na ordem lida:");
        for (int i = 0; i < numsOriginal.length; i++) {
            System.out.print(numsOriginal[i] + " ");
        }

        System.out.println("\n\nValores em ordem crescente:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("\n\nValores em ordem decrescente:");
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }

        scanner.close();
    }
}
