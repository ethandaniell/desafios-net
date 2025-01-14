//Encontre o número que falta: Dada uma sequência de números de 1 a N, encontre o número que está faltando.

public class Ex08 {
    public static void main(String[] args) {
        int[] sequencia = {1, 2, 3, 5, 6};
        int n = 6;

        int somaEsperada = (n * (n + 1)) / 2;

        int somaPresente = 0;
        for(int num : sequencia) {
            somaPresente += num;
        }

        int numeroFaltando = somaEsperada - somaPresente;

        System.out.println("O número que está faltando é: " + numeroFaltando);
    }
}
