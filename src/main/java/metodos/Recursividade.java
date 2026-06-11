package metodos;

// @author Marcelo Neves

import java.util.Scanner;

public class Recursividade {
    public static void main(String[] arqs) {
        try(Scanner input = new Scanner(System.in)){

            System.out.println("------------ Menu de Cursos ------------");

            String[] cursos = new String[]{"Java EE", "Spring", "Java OO Avançado"};

            vetorMenu(cursos);

            System.out.print("Digite o numero do curso desejado: ");
            int escolha = input.nextInt();

            validarEscolha(escolha, cursos);
            imprimir1Tracos();

            System.out.println("---------- Forma de Pagamento ----------");
            imprimir1Tracos();

            String[] formasPagamento = new String[]{"Cartão de Crédito", "Boleto", "Pix"};
            vetorMenu(formasPagamento);

            System.out.print("Digite o numero da forma de pagamento desejada: ");
            int escolhaPagamento = input.nextInt();

            imprimir1Tracos();
            validarEscolha(escolhaPagamento, formasPagamento);

            System.out.println(STR."Você escolheu o curso: \{cursos[escolha]} e a forma de pagamento: \{formasPagamento[escolhaPagamento]}");
        }catch(Exception e){
            System.out.println(STR."ERRO: \{e.getMessage()}");
        }
    }
    private Recursividade() {
        /* This utility class should not be instantiated */
    }

    public static void vetorMenu(String[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(STR."\{i} - \{vetor[i]}");
        }
    }

    public static void validarEscolha(int escolha, String[] vetor) {
    if (escolha < 0 || escolha >= vetor.length) {
            System.out.println(STR."Escolha inválida! Por favor, tente novamente.\{vetor[escolha]}");
        }
    }

    public static void imprimir1Tracos(){
        System.out.println("----------------------------------------");
    }
}
