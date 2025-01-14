//Ordenação de lista: Implemente um algoritmo de ordenação para ordenar uma lista de valores.

public class Ex05 {
    public static void main(String[] args) {
        int[] lista = {4, 2, 1, 3};

        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = 0; j < lista.length - 1 - i; j++) {
                if (lista[j] > lista[j + 1]) { 
                    int temp = lista[j];

                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
    }
}
