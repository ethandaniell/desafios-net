//Verifique se dois conjuntos são iguais: Desenvolva um algoritmo para verificar se dois conjuntos possuem os mesmos elementos.

import java.util.Arrays;

public class Ex07 {
    public static void main(String[] args) {
        int[] conjunto1 = {1, 2, 3, 4}; 
        int[] conjunto2 = {4, 5, 6, 7}; 

        Arrays.sort(conjunto1);
        Arrays.sort(conjunto2);

        if(conjunto1.length == conjunto2.length) {
            boolean iguais = true;

            for(int i = 0; i < conjunto1.length; i++) {
                if(conjunto1[i] != conjunto2[i]) {
                    iguais = false;
                    break;
                }
            }

            if (iguais) {
                System.out.println("Os conjuntos são iguais!");
            } else {
                System.out.println("Os conjuntos não são iguais.");
            }
        } else {
            System.out.println("Os conjuntos não são iguais (tamanhos diferentes).");
        }
    }
}
