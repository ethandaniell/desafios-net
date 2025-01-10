//Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem, sabendo que o carro faz 12km com um litro. Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média, distância percorrida e a quantidade de litros utilizados para fazer a viagem.
// Fórmula: distância = tempo x velocidade.
// litros usados = distância / 12.

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tempo de viagem (em horas): ");
        double tempo = scanner.nextDouble();

        System.out.println("Informe a velocidade média do veículo (em km/h): ");
        double velocidadeMedia = scanner.nextDouble();

        double distancia = tempo * velocidadeMedia;
        double litrosUsados = distancia / 12;

        System.out.println("Tempo de viagem: " + tempo + " horas");
        System.out.println("Velocidade média: " + velocidadeMedia + " km/h");
        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.printf("Quantidade de combustível utilizada: %.2f", litrosUsados + " litros");

        scanner.close();
    }
}
