//Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int num = scanner.nextInt();
        for(int i = 0; i < 11; i++) {
            int resultado = num * i;
            System.out.println(num + " X " + i + " = " + resultado);
        }

        scanner.close();
    }
}
