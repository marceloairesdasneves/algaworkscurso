package vetores;
// @author Marcelo Neves

import java.util.Scanner;

public class CadastroTarefas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qtd de tarefas: ");
        int quantidade = sc.nextInt();
        sc.nextLine();
        String[] tarefas = new String[quantidade];

        for (int i = 0; i < tarefas.length; i++) {
            System.out.print("Digite o nome do tarefa " + (i + 1) + ":");
            tarefas[i] = sc.nextLine();
        }

        for (String tarefa : tarefas) {
            System.out.println("Tarefa: " + tarefa);
        }
        sc.close();
    }
}