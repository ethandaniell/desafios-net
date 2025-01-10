//Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano. Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.

public class Ex18 {
    public static void main(String[] args) {

        double alturaFrancisco = 1.50;
        double alturaSara = 1.10;

        double crescimentoFrancisco = 0.02;
        double crescimentoSara = 0.03;

        int anos = 0;

        while (alturaFrancisco <= alturaSara) {
            alturaFrancisco += crescimentoFrancisco; 
            alturaSara += crescimentoSara;           
            anos++;                                  
        }

        System.out.println("Serão necessários " + anos + " anos para que Francisco seja maior que Sara.");
    }
}
