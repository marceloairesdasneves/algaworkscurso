package leituraeescritadedados;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscritaArquivos {
    private static final String CAMINHO_ARQUIVO = System.getProperty("user.home") + "/tarefas.txt";

    public static void main(String[] args) {
        System.out.println("====Sistema de Tarefas====");
        System.out.println("Salvando em: " + CAMINHO_ARQUIVO);

        try (Scanner scanner = new Scanner(System.in);
             BufferedWriter escritor = new BufferedWriter(new FileWriter(CAMINHO_ARQUIVO, true))) {
            while (true) {
                System.out.print("Digite a tarefa (ou 'x' para sair): ");
                String tarefa = scanner.nextLine();

                if (tarefa.equalsIgnoreCase("x")) {
                    break;
                }
                escritor.write(tarefa);
                escritor.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao tentar salvar no arquivo: " + e.getMessage());
        }
    }
}