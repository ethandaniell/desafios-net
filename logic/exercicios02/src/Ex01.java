//Encontre o maior número em uma lista: Escreva um algoritmo para encontrar o maior número em uma lista de valores.

public class Ex01 {
    public static void main(String[] args) {
        int[] nums = {3,7, 25, 27};
        int numeroMaior = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > numeroMaior) {
                numeroMaior = nums[i];
            }
        }

        System.out.println("O maior número é " + numeroMaior);
    }
}
