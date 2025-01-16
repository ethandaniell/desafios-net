//Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do salário bruto, mas não é descontado (é a empresa que deposita.)
// O salário líquido corresponde ao salário bruto menos os descontos O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
// a. Desconto do IR;
// b. Salário Bruto ate R$900,00 (inclusive) – Isento;
// c. Salário Bruto de R$ 1500, 00 (inclusive) – desconto de 5%;
// d. Salario bruto até R$ 2500,00 (Inclusive) – desconto de 10%;
// e. Salário bruto acima de 2500 – Desconto de 20%.
// Imprima na tela as informações, dispostas conforme o exemplo abaixo, no exemplo valor da hora é 5 e a quantidade de horas é 220.  
// Salário bruto (5 * 220)           : R$   1100,00
// ( – ) IR (5%)                     : R$     55,00
// ( – ) INSS ( 10% )                 : R$     110,00
// FGTS ( 11%)                       : R$     121,00
// Total de descontos                 : R$     165,00
// Salário Líquido                   : R$     935,00    

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor da sua hora: ");
        double valorHora = scanner.nextDouble();

        System.out.println("Insira o valor de horas trabalhadas ao mês: ");
        double horaMes = scanner.nextDouble();

        double salBruto = valorHora * horaMes;

        double descontoIR;
        if (salBruto <= 900) {
            descontoIR = 0;
        } else if (salBruto <= 1500) {
            descontoIR = salBruto * 0.05;
        } else if (salBruto <= 2500) {
            descontoIR = salBruto * 0.10;
        } else {
            descontoIR = salBruto * 0.20;
        }

        double descontoINSS = salBruto * 0.10;
        double descontoFGTS = salBruto * 0.11;

        double totalDesconto = descontoIR + descontoINSS;

        double salLiquido = salBruto - totalDesconto;

        System.out.printf("Salário Bruto (%.2f * %.2f): R$ %.2f\n", valorHora, horaMes, salBruto);
        System.out.printf("( – ) IR: R$ %.2f\n", descontoIR);
        System.out.printf("( – ) INSS (10%%): R$ %.2f\n", descontoINSS);
        System.out.printf("FGTS (11%%): R$ %.2f\n", descontoFGTS);
        System.out.printf("Total de descontos: R$ %.2f\n", totalDesconto);
        System.out.printf("Salário Líquido: R$ %.2f\n", salLiquido);

        scanner.close();
    }
}
