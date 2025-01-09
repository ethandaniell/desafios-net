//Faça algoritmo que leia o nome e a idade de uma pessoa e imprima na tela o nome da pessoa e se ela é maior ou menor de idade. 

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if(idade <= 18) {
            System.out.println(nome + " é menor de idade");
        } else {
            System.out.println(nome + " é maior de idade");
        }

        scanner.close();
    }
}
