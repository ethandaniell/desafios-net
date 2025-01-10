//Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor da hora-aula: ");
        double horaAula = scanner.nextDouble();

        System.out.println("Informe o número de aulas no mês: ");
        int numeroAulas = scanner.nextInt();

        System.out.println("Informe o percentual de desconto do INSS (em %): ");
        double percentualINSS = scanner.nextDouble();

        double salarioBruto = horaAula * numeroAulas;
        double desconto = salarioBruto * (percentualINSS / 100);
        double salarioLiquido = salarioBruto - desconto;

        System.out.printf("Salário Bruto: R$ %.2f", salarioBruto);
        System.out.printf("Desconto INSS: R$ %.2f", desconto);
        System.out.printf("Salário Líquido: R$ %.2f", salarioLiquido);

        scanner.close();
    }
}
