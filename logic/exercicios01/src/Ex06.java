//Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

import java.util.Scanner;

public class Ex06 {

 public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número: ");
    double num = scanner.nextDouble();

    double reajuste = num * .05;
    System.out.println("O reajuste de 5% é igual a " + reajuste);

    scanner.close();
 }
} 