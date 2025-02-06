// Leia um vetor de 10 posições e verifique se existem valores iguais e os escreva.

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os 10 valores do vetor");
        for(int i = 0; i < 10; i++) {
            System.out.println("Número na posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("\nValores repetidos encontrados:");
        boolean temRepetidos = false;

        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (vetor[i] == vetor[j]) { 
                    System.out.println(vetor[i]);
                    temRepetidos = true;
                    break; 
                }
            }
        }

        if (!temRepetidos) {
            System.out.println("Não há valores repetidos no vetor.");
        }


        scanner.close();
    }
}
