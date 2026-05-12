package iteracao;

// @author Marcelo Neves

public class IteracaoFor {
    static void main() {
        int[] numeros = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int numero : numeros) {
            if (numero % 3 == 0) {
                System.out.println("Estes números divisíveis por 3: " + numero);
            }
        }
    }
}
