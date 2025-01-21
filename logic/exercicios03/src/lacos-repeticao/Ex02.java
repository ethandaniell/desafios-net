// Faça um programa que mostre as tabuadas dos números de 1 a 10 usando laços de repetição.

public class Ex02 {
    public static void main(String[] args) {

        int num = 1;

        while(num < 11){
            for(int i = 0; i <= 10; i++) {
                int tabuada = i * num;
            
                System.out.println(i + " X " + num + " = " + tabuada);
            }
            num++;
            System.out.println();
        }
    }
}
