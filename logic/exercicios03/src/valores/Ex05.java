// Leia um vetor de 40 posições. Contar e escrever quantos valores pares ele possui.

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[40];
        int cont = 0;

        System.out.println("Digite 40 números para preencher o vetor: ");
        for(int i = 0; i < 40; i++) {
            System.out.println("Número na posição " + i + ": ");
            nums[i] = scanner.nextInt();
            System.out.println();
        }
        
        for (int i = 0; i < 40; i++) {
            if (nums[i] % 2 == 0) { 
                cont++;
                System.out.print(nums[i] + " "); 
            }
        }

        System.out.println("\nTotal de valores pares: " + cont);

        scanner.close();
    }
}
