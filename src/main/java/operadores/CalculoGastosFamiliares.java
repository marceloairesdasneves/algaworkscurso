package operadores;

// @author Marcelo Neves

import java.util.Locale;
import java.util.Scanner;

public class CalculoGastosFamiliares {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Locale.setDefault(Locale.US);

            double total = 0.0;
            System.out.println("=====Calculo de Gastos Familiares=====");
            System.out.print("Luz: ");
            total += scanner.nextDouble();
            System.out.print("Água: ");
            total += scanner.nextDouble();
            System.out.print("Internet: ");
            total += scanner.nextDouble();
            System.out.print("Escola: ");
            total += scanner.nextDouble();
            System.out.print("Cartão: ");
            total += scanner.nextDouble();
            System.out.print("Supermercado: ");
            total += scanner.nextDouble();

            System.out.println("\n=====Gastos Familiares=====");
            double totalGastos = total;
            System.out.printf("\nO valor total dos gastos familiares é: R$ %.2f ", totalGastos);
        }
    }
}
