//Inverta uma string: Desenvolva um algoritmo que inverta uma string fornecida como entrada.

public class Ex03 {
    public static void main(String[] args) {
        String og = "Olá, mundo";
        String invertida = "";

        for(int i = og.length() - 1; i >= 0; i--) {
            invertida += og.charAt(i); //pega o caracter
        }

        System.out.println("String invertida: " + invertida);
    }
}
