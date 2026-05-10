package aulainicial;

import java.util.Scanner;

// @author Marcelo Neves
public class AlterandoValorVariavel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        Double valorProduto = sc.nextDouble();
        System.out.print("Digite o tipo de pagamento: (1-a Vista/2 - a Prazo) ");
        Integer tipoPagamento = sc.nextInt();

        Boolean pagamentoVista = tipoPagamento.equals(1);

        if (!pagamentoVista) {
            valorProduto += valorProduto * 0.10;
        }
        System.out.println("Valor do produto: " + valorProduto);
        sc.close();

    }
}
