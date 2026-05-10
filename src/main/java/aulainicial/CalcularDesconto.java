package aulainicial;

// @author Marcelo Neves

import java.math.BigDecimal;
import java.util.Scanner;

public class CalcularDesconto {
   public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Digite o valor do produto: ");
            BigDecimal valorProduto = input.nextBigDecimal();
            System.out.print("Digite a quantidade de produtos: ");
            int quantidade = input.nextInt();

            Double subTotal = calcSubTotal(valorProduto,quantidade);

            if (quantidade <= 10) {
                System.out.printf("Valor a pagar R$ %.2f  " , subTotal);
            }else {
                System.out.printf("Valor a pagar com desconto R$ %.2f " , calcDesconto(subTotal));
            }
        }
    }
    public static Double calcSubTotal(BigDecimal valorProduto, int quantidade) {
        return valorProduto.multiply(BigDecimal.valueOf(quantidade)).doubleValue();
   }
    public static Double calcDesconto(Double subTotal) {
        return subTotal - (subTotal * 0.10);
    }
}
