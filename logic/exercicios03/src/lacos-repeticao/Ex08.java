//Uma companhia de teatro deseja dar uma série de espetáculos. 
// a) A direção calcula que a R$5,00 o ingresso. 
// b) Serão vendidos 120 ingressos, e que as despesas serão R$ 200,00. 
// c) Diminuindo-se R$ 0,50 o preço dos ingressos espera-se que as vendas aumentem em 26 ingressos.

public class Ex08 {
    public static void main(String[] args) {
        double precoAtual = 5.00;
        int ingressosVendidos = 120;
        double despesas = 200.00;

        double lucroMax = 0.00;
        double precoIdeal = 0.00;

        while (precoAtual > 0) {
            double lucroAtual = (precoAtual * ingressosVendidos) - despesas;

            if(lucroAtual > lucroMax) {
                lucroMax = lucroAtual;
                precoIdeal = precoAtual;
            }

            precoAtual -= 0.50;
            ingressosVendidos += 26;
        }

        System.out.printf("Preço ideal para maximizar o lucro: R$%.2f%n", precoIdeal);
        System.out.printf("Lucro máximo: R$%.2f%n", lucroMax);
    }
}
