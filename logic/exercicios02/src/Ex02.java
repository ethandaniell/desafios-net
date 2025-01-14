//Verifique se um número é primo: Crie um programa que determine se um número é primo ou não.

public class Ex02 {
    public static void main(String[] args) {
        int num = 7;
        boolean primo = true;

        for(int i = 2; i < num; i++) {
                if(num % i == 0) {
                    primo = false;
                    break;
                }
        }

        if(primo) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }
    }
}
