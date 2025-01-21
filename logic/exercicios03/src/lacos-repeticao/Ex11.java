//Faça um programa que receba um conjunto de valores inteiros e positivos, com o intervalo formado pelo número imprima na tela todos os números primos existentes  

public class Ex11 {
    public static void main(String[] args) {
        int[] valores = {3, 7, 4, 2, 9, 5};

        System.out.println("Números primos no conjunto:");
        for(int i = 0; i < valores.length; i++) {
            if (ePrimo(valores[i])) {
                System.out.println(valores[i]);
            }
        }
    }

    public static boolean ePrimo(int num) {
        
        if(num <= 1) return false;

        for(int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false; 
            }
        }

        return true;
    }
}
