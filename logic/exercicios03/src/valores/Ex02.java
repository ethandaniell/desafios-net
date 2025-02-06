//Declare um vetor de 10 posições e o preencha com os 10 primeiros números impares e o escreva.

public class Ex02 {
    public static void main(String[] args) {
        int[] impares = new int[10];

        int num = 1;
        for(int i = 0; i < impares.length; i++) {
            impares[i] = num;
            num += 2;
        }

        System.out.println("Os 10 primeiros números ímpares são:");
        for(int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + " ");
        }
    }
    
}