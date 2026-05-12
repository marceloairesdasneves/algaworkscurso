package operadores;

// @author Marcelo Neves

import java.util.Scanner;

public class Calculadora {
    static Integer numero1;
    static Integer numero2;
    static Integer numeroOperacao;
    static void main(String[] args) {
        char operacao = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("=====Calculadora=====");
            System.out.print("Digite o primeiro numero: ");
            numero1 = sc.nextInt();

            System.out.print("Digite [1 = + , 2 = -, 3 = *, 4 = /]: ");
            numeroOperacao = sc.nextInt();

            System.out.print("Digite o segundo numero: ");
            numero2 = sc.nextInt();

            if( numeroOperacao.equals(1)){
                System.out.println("O resultado da adição é: " + (numero1 + numero2));
            } else if(numeroOperacao.equals(2)){
                System.out.println("O resultado da subtração é: " + (numero1 - numero2));
            } else if(numeroOperacao.equals(3)){
                System.out.println("O resultado da multiplicação é: " + (numero1 * numero2));
            } else if(numeroOperacao.equals(4)){
                System.out.println("O resultado da divisão é: " + (numero1 / numero2));
            }
        }
    }
}
