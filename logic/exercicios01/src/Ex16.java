// Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é equilátero, isósceles ou escaleno.

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho de um lado do triângulo: ");
        double lado1 = scanner.nextDouble();

        System.out.println("Digite o tamanho de outro lado do triângulo: ");
        double lado2 = scanner.nextDouble();

        System.out.println("Digite o tamanho de outro lado do triângulo: ");
        double lado3 = scanner.nextDouble();

        if(lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
                System.out.println("Este triângulo é equilatero");
            } else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Este triângulo é isósceles");
            } else {
                System.out.println("Este triângulo é escaleno");
            }
        } else {
            System.out.println("Não é um triângulo válido");
        }

        scanner.close();
    }
}