//Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas. Fórmula: C = (5 * ( F-32) / 9)

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma temperatura em Fahrenheit: ");
        double tempF = scanner.nextDouble();

        double tempC = (5 *  (tempF - 32) / 9);

        System.out.printf("A temperatura em Fahrenheit %.2f trasformada em celsius fica igual a %.2f", tempF, tempC);

        scanner.close();
    }
}
