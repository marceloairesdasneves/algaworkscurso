package programacaoorientadaobjetos;

// @author Marcelo Neves

import java.util.Scanner;

public class MainPedido {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Bem vindo.....");
            System.out.print("Digite o código do Pedido: ");
            pedido.setCodigo(sc.nextLine());
            System.out.print("Digite o subtotal do Pedido: ");
            pedido.setSubtotal(sc.nextDouble());
            System.out.print("Digite o desconto do Pedido: ");
            pedido.setDesconto(sc.nextInt());

            System.out.println(pedido);
        }
    }
}
