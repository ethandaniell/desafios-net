//Faça um algoritmo que imprima na tela a tabuada de 1 até 10.

public class Ex19 {
    public static void main(String[] args) {
        int num = 1;

        while(num < 11) {
            for(int i = 0; i <= 10; i++) {
                int resultado = num * i;
                System.out.println(num + " X " + i + " = " + resultado);
            }
            num++;
            System.out.println();
        }
    }
}
