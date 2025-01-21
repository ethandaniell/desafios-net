//Uma loja deseja cadastrar 5 clientes e verificar se o faturamento da loja foi superior a loja B (faturamento = 54000).  Se o faturamento atingir esse valor mostre na tela uma mensagem contendo em quanto foi superado o faturamento.

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double faturamento = 54000.0;
        double faturamentoTotal = 0.0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o nome do cliente " + i + ": ");
            String nomeCliente = scanner.nextLine();

            System.out.print("Digite o valor gasto pelo cliente " + nomeCliente + ": R$");
            double valorGasto = scanner.nextDouble();
            scanner.nextLine(); 

            faturamentoTotal += valorGasto;
        }

        System.out.println("\nFaturamento total da loja: R$" + faturamentoTotal);

        if (faturamentoTotal > faturamento) {
            double diferenca = faturamentoTotal - faturamento;
            System.out.println("O faturamento foi superior ao da loja B em R$" + diferenca);
        } else {
            System.out.println("O faturamento não superou o da loja B.");
        }

        scanner.close();
    }
}
