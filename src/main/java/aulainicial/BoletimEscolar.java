package aulainicial;

import java.util.Scanner;

// @author Marcelo Neves
public class BoletimEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota do aluno:");
        int nota = sc.nextInt();

        boolean aprovado = nota >= 70;
        if(aprovado){
            System.out.println("Aluno aprovado!");
        }else {
            System.out.println("Aluno reprovado!");
        }
        sc.close();
    }
}
