//Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em consideração o ano com 365 dias e o mês com 30 dias. (Ex: 5 anos, 2 meses e 15 dias de vida)

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o mês de nascimento (1-12): ");
        int mesNascimento = scanner.nextInt();

        System.out.print("Digite o dia de nascimento (1-30): ");
        int diaNascimento = scanner.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        System.out.print("Digite o mês atual (1-12): ");
        int mesAtual = scanner.nextInt();

        System.out.print("Digite o dia atual (1-30): ");
        int diaAtual = scanner.nextInt();

        int totalDiasNascimento = (anoNascimento * 365) + ((mesNascimento - 1) * 30) + diaNascimento;
        int totalDiasAtual = (anoAtual * 365) + ((mesAtual - 1) * 30) + diaAtual;
        int totalDiasVividos = totalDiasAtual - totalDiasNascimento;
        int anos = totalDiasVividos / 365;
        int meses = (totalDiasVividos % 365) / 30;
        int dias = (totalDiasVividos % 365) % 30;

        System.out.printf("Você viveu %d anos, %d meses e %d dias.%n", anos, meses, dias);

        scanner.close();
    }
}
