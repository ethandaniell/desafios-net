//Uma loja tem tem uma política de descontos de acordo com o valor da compra do cliente. Os descontos começam acima dos R$500. A cada 100 reais acima dos R$500,00 o cliente ganha 1% de desconto cumulativo até 25%. 
//  Por exemplo: R$500 = 1% || R$600,00 = 2% … etc…
//  Faça um programa que exiba essa tabela de descontos no seguinte formato:  
//  Valordacompra – porcentagem de desconto – valor final

public class Ex07 {
    public static void main(String[] args) {
        for (int valor = 500; valor <= 2900; valor += 100) {
            int desconto = Math.min(((valor - 500) / 100) + 1, 25);
            double valorFinal = valor * (1 - desconto / 100.0);

            System.out.printf("%d - %d%% - R$%.2f%n", valor, desconto, valorFinal);
        }
    }
}
