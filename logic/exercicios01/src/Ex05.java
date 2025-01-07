// Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse  usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do seu salário: ");
        double sal = scanner.nextDouble();

        double salMinimo = 1293.20;
        double resultado = sal / salMinimo;

        System.out.printf("O salário é: %.2fx o salário mínimo.", resultado);

        scanner.close();
    }
}
