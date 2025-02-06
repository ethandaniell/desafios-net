//Leia um vetor de 5 posições contendo os caracteres de um numero. Em seguida escreva esse numero por extenso.

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        char[] vetor = new char[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 5 dígitos (um caractere por vez):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Dígito na posição " + (i + 1) + ": ");
            vetor[i] = scanner.next().charAt(0);
        }

        String[] numerosPorExtenso = {
            "zero", "um", "dois", "três", "quatro", 
            "cinco", "seis", "sete", "oito", "nove"
        };

        System.out.println("\nNúmero por extenso:");
        for (int i = 0; i < 5; i++) {
            
            int digito = Character.getNumericValue(vetor[i]);

            if (digito >= 0 && digito <= 9) {
                System.out.print(numerosPorExtenso[digito] + " ");
            } else {
                System.out.print("[Caractere inválido] ");
            }
        }

        scanner.close();
    }
}
