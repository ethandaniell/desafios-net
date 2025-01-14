//Converta um número decimal para binário: Implemente um algoritmo que converta um número decimal para seu equivalente em binário.

public class Ex10 {
    public static void main(String[] args) {
        int numeroDecimal = 13;
        String binario = "";

        while (numeroDecimal > 0) {
            int resto = numeroDecimal % 2;
            binario = resto + binario;
            numeroDecimal = numeroDecimal / 2;
        }

        System.out.println("O número em binário é: " + binario);
    }
}
