//As organizações CSM resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa que calculará os reajustes.  
// a. Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual;
// b. Salários até R$ 280,00 (incluindo): aumento de 20%;
// c. Salários entre R$ 280,00 e R$700,00: aumento de 15%;
// d. Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%;
// e. Salários de R$ 1500,00 em diante: aumento de 5%
// Após o aumento ser realizado; informe na tela;
// a. O salário antes do reajuste;
// b. O percentual de aumento aplicado;
// c. O valor do aumento;
// d. O novo salário, após o aumento.  

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        double sal = scanner.nextDouble();

        double aumento;
        int percent;
        if(sal <= 280) {
            aumento = sal * 0.20; 
            percent = 20;
        } else if(sal <= 700) {
            aumento = sal * 0.15;
            percent = 15;
        } else if(sal <= 1500) {
            aumento = sal * 0.10;
            percent = 10;
        } else {
            aumento = sal * 0.05;
            percent = 5;
        }
        
        double novoSal = sal + aumento;

        System.out.printf("Salário sem reajuste: R$ %.2f\n", sal);
        System.out.printf("Percentual de reajuste aplicado: %d%%\n", percent);
        System.out.printf("Valor do aumento aplicado: R$ %.2f\n", aumento);
        System.out.printf("Seu salário reajustado: R$ %.2f\n", novoSal);

        scanner.close();
    }
}
