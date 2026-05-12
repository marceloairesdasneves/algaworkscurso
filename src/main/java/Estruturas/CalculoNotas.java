package Estruturas;

// @author Marcelo Neves

import java.util.Locale;
import java.util.Scanner;

public class CalculoNotas {
    static void main(String[] args) {
        final double notaMinima = 150.0;
        final double notaMinimaPorMateria = 60.0;
        try(Scanner sc = new Scanner(System.in)){
            Locale.setDefault(Locale.US);
            System.out.println("====== Boletim de Notas ======");
            System.out.print("Nota da prova de português: ");
            double notaPortugues = sc.nextDouble();
            System.out.print("Nota da prova de matemática: ");
            double notaMatematica = sc.nextDouble();

            boolean notaTotal = (notaPortugues + notaMatematica) >= notaMinima;
            boolean aprovado = notaTotal && notaPortugues >= notaMinimaPorMateria && notaMatematica >= notaMinimaPorMateria;
            if(aprovado){
                System.out.println("\nParabens, voce passou ");
            }
            else {
                System.out.println("\nInfelizmente, nao foi dessa vez. ");
            }
        }
    }
}
