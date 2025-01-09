//Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

import java.util.Scanner;

public class Ex07 {
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um valor: ");
    boolean num1 = scanner.nextBoolean();

    System.out.println("Digite mais um valor: ");
    boolean num2 = scanner.nextBoolean();

    if(num1 && num2) {
        System.out.println("Os valores são verdadeiros");
    } else if(!num1 && !num2) {
        System.out.println("Os valores são falsos");
    } else {
        System.out.println("Os valores são diferentes");
    }

    scanner.close();
}
    
}