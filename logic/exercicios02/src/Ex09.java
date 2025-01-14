//Encontre o menor número em uma lista: Escreva um programa para encontrar o menor número em uma lista de valores.

public class Ex09 {
    public static void main(String[] args) {
        int[] nums = {3,7, 25, 27};
        int numeroMenor = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if (nums[i] < numeroMenor) {
                numeroMenor = nums[i];
            }
        }

        System.out.println("O menor número é " + numeroMenor);
    }
}
