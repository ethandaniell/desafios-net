//Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
// Tabela de Código de Condições de Pagamento
// 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
// 2 - À Vista no cartão de crédito, recebe 10% de desconto
// 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
// 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        int op;
        double valor, desconto, valorFinal, juros;
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Digite o valor do produto: ");
            valor = scanner.nextDouble();

            System.out.println("\n### MENU DE OPÇÕES DE PAGAMENTO###");
            System.out.println("1 - À Vista em Dinheiro ou Pix");
            System.out.println("2 - À Vista no cartão de crédito");
            System.out.println("3 - Parcelado no cartão em duas vezes sem juros");
            System.out.println("4 - Parcelado no cartão em três vezes ou mais juros de 10%");
            System.out.println("5 - Sair");
            System.out.print("\nEscolha uma opção: ");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    desconto = (valor * 15) / 100;
                    valorFinal = valor - desconto;
                    System.out.printf("O valor a pagar é igual a %.2f", valorFinal);
                    scanner.nextLine();
                    break;
                case 2:
                    desconto = (valor * 10) / 100;
                    valorFinal = valor - desconto;
                    System.out.printf("O valor a pagar é igual a %.2f", valorFinal);
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.printf("O valor a pagar é igual a %.2f", valor);
                    scanner.nextLine();
                    break;
                case 4:
                    juros = (valor * 10) / 100;
                    valorFinal = valor + juros;
                    System.out.printf("O valor a pagar é igual a %.2f", valorFinal);
                    scanner.nextLine();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }

        } while(op != 5);

        scanner.close();
    }
}
