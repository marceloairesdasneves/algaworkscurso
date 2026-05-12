package operadores;

// @author Marcelo Neves

import java.util.Scanner;

public class DescontoFrete {
    final static Double valorFrete = 15.00;

    static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("=====Desconto Frete=====");
            System.out.print("Digite o valor do Produto: ");
            double valorProduto = sc.nextDouble();

            if (valorProduto >= 100) {
                System.out.printf("O valor final do produto: R$ %.2f " , valorProduto);
            } else if (valorProduto < 100) {
                valorProduto = valorProduto + valorFrete;
                System.out.printf("O valor final do produto + frete: R$ %.2f " , valorProduto);
            }
        }
    }
}
