//Faça um Programa que peça um número inteiro e determine se ele e par ou ímpar. Dica: utilize o operador módulo (resto da divisão).  

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = scanner.nextInt();

        if(valor % 2 == 0) {
            System.out.println("É par.");
        } else {
            System.out.println("É impar.");
        }

        scanner.close();
    }
}
