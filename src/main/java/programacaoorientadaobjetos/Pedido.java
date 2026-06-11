package programacaoorientadaobjetos;

// @author Marcelo Neves

import lombok.Getter;
import lombok.Setter;

public class Pedido {
    @Getter @Setter private String codigo;
    @Getter @Setter private double subtotal;
    @Getter @Setter private int desconto;

    public Pedido(String codigo, double subtotal, int desconto) {
        this.codigo = codigo;
        this.subtotal = subtotal;
        this.desconto = desconto;
    }
    public Pedido(){
        this.codigo = "";
        this.subtotal = 0;
        this.desconto = 0;
    }

    public double getTotal() {
        double descontoValor = this.subtotal * this.desconto / 100;
        return this.subtotal - descontoValor;
    }

    @Override
    public String toString() {
        return String.format("Código do Pedido: %s, Subtotal: %.2f, Desconto: %d%%, Total: %.2f",
                this.codigo, this.subtotal, this.desconto, this.getTotal());
    }
}
