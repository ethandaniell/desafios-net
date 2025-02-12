//Considere um vetor de trajetórias de 9 elementos, onde cada elemento possui o valor do próximo elemento do vetor a ser lido.                    
// Índice       1    2    3    4    5    6    7     8     9                      
// Valor       5    7    6    9     2   8    4     0     3            
// Assim, a seqüência da leitura seria 1, 5, 2, 7, 4, 9, 3, 6, 8, 0            
// Faça um algoritmo que seja capaz de ler esse vetor e seguir a trajetória.

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        int[] trajetoria = new int[9];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os 9 valores do vetor de trajetórias:");
        for (int i = 0; i < 9; i++) {
            System.out.print("Valor na posição " + (i + 1) + ": ");
            trajetoria[i] = scanner.nextInt();
        }

        System.out.println("\nSequência da trajetória:");
        int indice = 0; 

        while (indice != 0 || trajetoria[indice] != 0) { 
            System.out.print((indice + 1) + " "); 
            indice = trajetoria[indice]; 

            if (indice == 0) { 
                System.out.print("0");
                break;
            }
        }

        scanner.close();
    }
}
