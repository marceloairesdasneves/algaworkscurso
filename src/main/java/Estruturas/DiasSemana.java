package Estruturas;

// @author Marcelo Neves

import java.util.Scanner;

public class DiasSemana {
    static void main() {
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Digite um numero da Semana (1 - 7): ");
            int numero = input.nextInt();

            switch (numero) {
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Segunda-feira");
                    break;
                case 3:
                    System.out.println("Terça-feira");
                    break;
                case 4:
                    System.out.println("Quarta-feira");
                    break;
                case 5:
                    System.out.println("Quinta-feira");
                    break;
                case 6:
                    System.out.println("Sexta-feira");
                    break;
                case 7:
                    System.out.println("Sabado");
                    break;
                default:
                    System.out.println("Numero Invalido");
            }
        }
    }
}
