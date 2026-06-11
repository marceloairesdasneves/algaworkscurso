package programacaoorientadaobjetos;

// @author Marcelo Neves

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Produto {
    private String nome;
    private int quantidadeEmEstoque;
    private double precoUnitario;

    public Produto(String nome, int quantidadeEmEstoque, double precoUnitario) {
        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.precoUnitario = precoUnitario;
    }

    public Produto(){
        this.nome = "";
        this.quantidadeEmEstoque = 10;
        this.precoUnitario = 0;
    }

    public void temEstoqueDisponivel(int quantidadeEmEstoque, int quantidadeVenda) {
        if (quantidadeVenda <= this.quantidadeEmEstoque) {
            System.out.printf("Quantidade do produto em estoque %d, disponível para venda. ", quantidadeEmEstoque);
        } else {
            System.out.printf("Quantidade do produto em estoque %d, nao disponível para venda. ", quantidadeEmEstoque);
        }
    }
}
