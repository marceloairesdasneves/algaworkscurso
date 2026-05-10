package aulainicial;
// @author Marcelo Neves
import java.util.Scanner;

public class TipoLogico {
    static final int IDADE_MINIMA = 18;

    public static boolean podeTirarCNH(int idade) {
        if (idade < 0) throw new IllegalArgumentException("Idade não pode ser negativa");
        return idade >= IDADE_MINIMA;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite sua idade: ");
            int idade = sc.nextInt();

            boolean podeTirarCNH = podeTirarCNH(idade);

            if (podeTirarCNH) {
                System.out.println("Você pode tirar a CNH, pois tem " + idade + " anos.");
            } else {
                System.out.println("Você não pode tirar a CNH, pois tem " + idade + " anos.");
            }
        }
    }
}