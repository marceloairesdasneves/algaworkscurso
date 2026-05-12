package Estruturas;

// @author Marcelo Neves
import java.util.Scanner;

public class CalculoBonus {
    static void main(String[] args) {
        final int MES_JANEIRO = 1;
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite a meta: ");
            int metaAnualFuncionario = sc.nextInt();
            System.out.print("Digite o faturamento anterior: ");
            int faturamentoRealAnterior = sc.nextInt();
            System.out.print("Digite a media salarial: ");
            int mediaAnoAnterior = sc.nextInt();
            System.out.print("Digita o mes do bonus: ");
            int mesAnoBonus = sc.nextInt();

            boolean elegivel100 = faturamentoRealAnterior >= metaAnualFuncionario;

            if (mesAnoBonus != MES_JANEIRO) {
                System.out.println("O bonus so pode ser calculado no mes de janeiro");
            } else if (elegivel100) {
                System.out.println("Parabens! Voce e elegível para receber um bonus 100% de R$ " + (double) mediaAnoAnterior);
            } else{
                double bonus = metaAnualFuncionario * 0.8;
                System.out.println("Parabens! Voce e elegível para receber um bonus 80% de R$ " + bonus);
            }
        }
    }
}
