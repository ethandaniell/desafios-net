//Faça um programa que receba a idade de 15 pessoas e que calcule e mostre:
// a) A quantidade de pessoas em cada faixa etária;
// b) A percentagem de pessoas na primeira e na última faixa etária, com relação ao total de pessoas: 
// Até 15 anos
// De 16 a 30 anos
// De 31 a 45 anos
// De 46 a 60 anos
// Acima de 61 anos

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int faixa1 = 0; // Até 15 anos
        int faixa2 = 0; // De 16 a 30 anos
        int faixa3 = 0; // De 31 a 45 anos
        int faixa4 = 0; // De 46 a 60 anos
        int faixa5 = 0; // Acima de 61 anos

        for (int i = 1; i <= 15; i++) {
            System.out.print("Digite a " + i + "ª idade: ");
            int idade = scanner.nextInt();

            if (idade <= 15) {
                faixa1++;
            } else if (idade <= 30) {
                faixa2++;
            } else if (idade <= 45) {
                faixa3++;
            } else if (idade <= 60) {
                faixa4++;
            } else {
                faixa5++;
            }
        }

        double percentFaixa01 = (faixa1 * 100.0) / 15;
        double percentFaixa05 = (faixa5 * 100.0) / 15;

        System.out.println("\nQuantidade de pessoas por faixa etária:");
        System.out.println("Até 15 anos: " + faixa1);
        System.out.println("De 16 a 30 anos: " + faixa2);
        System.out.println("De 31 a 45 anos: " + faixa3);
        System.out.println("De 46 a 60 anos: " + faixa4);
        System.out.println("Acima de 61 anos: " + faixa5);

        System.out.printf("\nPercentagem de pessoas:\n");
        System.out.printf("Na faixa até 15 anos: %.2f%%\n", percentFaixa01);
        System.out.printf("Na faixa acima de 61 anos: %.2f%%\n", percentFaixa05);

        scanner.close();
    }
}
