package aulainicial;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class QuadradoNumero {
    // @author Marcelo Neves
    public static void main(String[] args) throws InterruptedException {
        Locale.setDefault(Locale.US);
        try (Scanner input = new Scanner(System.in)) {
            long numero = lerLongValido(input);

            try {
                long resultado = calcularQuadrado(numero);
                System.out.printf("O quadrado do número: %d é %d%n", numero, resultado);
            } catch (ArithmeticException ex) {
                System.out.println("Numero muito grande, ocorreu overflow! ");
            }
        }
    }

    private static long lerLongValido(Scanner input) {
        while (true) {
            try {
                System.out.print("Digite um número inteiro: ");
                return input.nextLong();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite apenas um número inteiro (ex.: 12).");
                input.next(); // descarta a entrada inválida
            } catch (ArithmeticException ex) {
                System.out.println("Numero muito grande, ocorreu overflow! ");
            }
        }
    }

    private static long calcularQuadrado(long numero) {
        long quadrado = Math.multiplyExact(numero, numero);
        return Math.toIntExact(quadrado);
    }
}
