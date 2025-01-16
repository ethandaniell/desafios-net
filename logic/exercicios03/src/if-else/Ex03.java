//Faça um programa que verifique (usando if e else) se uma letra digitada é “F” ou “M”. Conforme a letra escrever: F – Feminino, M- Masculino, Sexo inválido.  

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite M para Masculino e F para Feminino: ");
        String sexo = scanner.nextLine().toUpperCase();

        if(sexo.equals("F")) {
            System.out.println("É feminino");
        } else if (sexo.equals("M")) {
           System.out.println("É masculino"); 
        } else {
            System.out.println("Sexo inválido");
        }

        scanner.close();
    }
}
