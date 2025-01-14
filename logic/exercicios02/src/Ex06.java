//Verifique se uma palavra é um palíndromo: Crie um programa que identifique se uma palavra é um palíndromo.

public class Ex06 {
    public static void main(String[] args) {
        String palindromo = "anotaram a data da maratona";

        String normalizada = palindromo.replaceAll("\\s+", "").toLowerCase();
        String invertida = "";

        for(int i = normalizada.length() - 1; i >= 0; i--) {
            invertida += normalizada.charAt(i);
        }

        if(invertida.equals(normalizada)) {
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }
    }
}
