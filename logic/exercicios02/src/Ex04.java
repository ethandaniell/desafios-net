//Calcule o fatorial de um número: Escreva um programa que calcule o fatorial de um número dado.

public class Ex04 {
    public static void main(String[] args) {
        int num = 7;
        int fatorial = 1;

        for(int i = 1;  i <= num; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + num + " é igual a " + fatorial);
    }
}
