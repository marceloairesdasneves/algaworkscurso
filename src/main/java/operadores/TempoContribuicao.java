package operadores;

// @author Marcelo Neves

import java.util.Scanner;

public class TempoContribuicao {
    static void main(String[] args) {
        final int IDADE_MINIMA = 55;
        final int TEMPO_CONTRIBUICAO_MINIMO = 25;
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Idade: ");
            int idade = input.nextInt();
            System.out.print("Tempo Contribuição: ");
            int tempoContribuicao = input.nextInt();

            if(idade >= IDADE_MINIMA && tempoContribuicao >= TEMPO_CONTRIBUICAO_MINIMO) {
                System.out.println("Voce ja tem direito a aposentar!");
            }else{
                System.out.println("Voce ainda nao tem direito a aposentar!");
            }
        }
    }
}
