package programacaoorientadaobjetos;

import java.util.Scanner;

// @author Marcelo Neves
public class MainProduto {
    public static void main(String[] args) {
        var produto = new Produto();
        try (Scanner sc = new Scanner(System.in)) {
            processaPedido(sc, produto);
        }
    }

    public static void processaPedido(Scanner sc, Produto produto) {
        System.out.print("Digite o nome do produto: ");
        produto.setNome(sc.nextLine());

        System.out.print("Digite quantidade de produto a vender: ");
        var quantidadeVenda = sc.nextInt();
        produto.temEstoqueDisponivel(produto.getQuantidadeEmEstoque(), quantidadeVenda);
    }
}