// Leia dois vetores de 4 posições. Verifique e escreva se um é anagrama de outro. Ex:      ARARA                      ARARA – são anagramas

import java.util.Arrays;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        char[] vetor1 = new char[4];
        char[] vetor2 = new char[4];

         Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 4 caracteres para o primeiro vetor:: ");
        for(int i = 0; i < 4; i++) {
            System.out.println("Caractere na posição " + i + ": ");
           vetor1[i] = scanner.next().charAt(0);
        }

        System.out.println("Digite 4 caracteres para o segundo vetor: ");
        for(int i = 0; i < 4; i++) {
            System.out.println("Caractere na posição " + i + ": ");
            vetor2[i] = scanner.next().charAt(0);
        }

        Arrays.sort(vetor1);
        Arrays.sort(vetor2);

        if(Arrays.equals(vetor1, vetor2)) {
            System.out.println("Os vetores são anagramas.");
        } else {
            System.out.println("Os vetores não são anagramas.");
        }

        scanner.close();
    }
}
