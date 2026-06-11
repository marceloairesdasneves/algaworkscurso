package metodos;

// @author Marcelo Neves

import java.util.Scanner;

public class CalcTabuada {
    //principal.
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int numero = 0;
            int m1 = lerNumero(sc, "Digite o numero base (multiplicador):  ");
            int m2 = lerNumero(sc, "Digite o limite da tabuada (multiplicando): ");

            calcularTabuada(m1, m2, 1);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: Por favor, digite apenas números inteiros válidos.");
        } catch (Exception e) {
            System.out.println(STR."Ocorreu um erro inesperado no sistema: \{e.getMessage()}");
        }
    }


    public static void calcularTabuada(int m1, int m2, int atual) {
        if(atual > m2){
            return;
        }
        System.out.printf("%d x %d = %d%n", m1, atual, m1 * atual);
        calcularTabuada(m1, m2, atual+1);
    }
    private static int lerNumero(Scanner sc, String mensagem){
        System.out.print(mensagem);
        return sc.nextInt();
    }
}
