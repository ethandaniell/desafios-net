//Faça um programa que verifique (usando if e else) se uma letra digitada é vogal ou consoante.  

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        char letra = scanner.next().toLowerCase().charAt(0); 


        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("A letra é uma vogal");
        } else {
            System.out.println("A letra é uma consoante");
        }

        scanner.close();
    }
}
