// Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite sua terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Sua média é igual a %.1f", media);

        scanner.close();
    }
}
