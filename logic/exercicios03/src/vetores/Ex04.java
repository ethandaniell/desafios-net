//Leia um vetor de 20 posições e em seguida um valor X qualquer. Seu programa devera fazer uma busca do valor de X no vetor lido e informar a posição em que foi encontrado ou se não foi encontrado.

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[20];

        System.out.println("Digite os 20 valores do vetor: ");
        for(int i = 0; i < 20; i++) {
            System.out.print("Posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Digite o valor de X: ");
        int X = scanner.nextInt();

        int posicao = - 1;
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] == X) {
                posicao = i;
                break;
            }
        }

        if (posicao != -1) {
            System.out.println("O valor " + X + " foi encontrado na posição " + posicao + ".");
        } else {
            System.out.println("O valor " + X + " não foi encontrado no vetor.");
        }

        scanner.close();
    }
}
