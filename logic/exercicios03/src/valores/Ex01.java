//Leia um vetor de 12 posições e em seguida ler também dois valores X e Y quaisquer correspondentes a duas posições no vetor. Ao final seu programa deverá escrever a soma dos valores encontrados nas respectivas posições X e Y.

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[12];

        System.out.println("Digite 12 números para preencher o vetor: ");
        for(int i = 0; i < 12; i++) {
            System.out.println("Número na posição " + i + ": ");
            nums[i] = scanner.nextInt();
        }

        System.out.print("\nDigite o valor de X (posição no vetor): ");
        int X = scanner.nextInt();
        System.out.print("Digite o valor de Y (posição no vetor): ");
        int Y = scanner.nextInt();

        if(X < 0 || X >= 12 || Y < 0 || Y >= 12) {
            System.out.println("As posições X e Y devem estar entre 0 e 11.");
        } else {
            int soma = nums[X] + nums[Y];
            System.out.println("\nA soma dos valores nas posições " + X + " e " + Y + " é: " + soma);
        }

        scanner.close();;
    }
    
}