//Escreva um programa que lê o tamanho do lado de um quadrado e imprime um quadrado daquele tamanho com asteriscos. Seu programa deve usar laços de repetição e funcionar para quadrados com lados de todos os tamanhos entre 1 e 20.
// Por exemplo, para lado igual a 5:
// *****
// *****
// *****
// *****
// *****

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado do quadrado [entre 1 a 20]: ");
        int lado = scanner.nextInt();

        if(lado < 1 || lado > 20) {
            System.out.println("Valor inválido! O lado deve estar entre 1 e 20.");
        } else {
            for(int i = 0; i < lado; i++) {
                for(int j = 0; j < lado; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
