package leituraeescritadedados;

import envioDeEmail.Carteiro;
import org.apache.commons.mail.EmailException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscritaArquivos {
    private static final String CAMINHO_ARQUIVO = System.getProperty("user.home") + "/tarefas.txt";

    public static void main(String[] args) throws EmailException {
        System.out.println("====Sistema de Tarefas====");
        System.out.println("Salvando em: " + CAMINHO_ARQUIVO);

        Scanner scanner = new Scanner(System.in);
        StringBuilder tarefasAcumuladas = new StringBuilder();

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(CAMINHO_ARQUIVO, true))) {
            while (true) {
                System.out.print("Digite a tarefa (ou 'x' para sair): ");
                String tarefa = scanner.nextLine();
                if (tarefa.equalsIgnoreCase("x")) {
                    break;
                }
                escritor.write(tarefa);
                escritor.newLine();
                tarefasAcumuladas.append("-").append(tarefa).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Erro ao tentar salvar no arquivo: " + e.getMessage());
        }

        if (tarefasAcumuladas.length() > 0) {
            System.out.print("\nDigite seu e-mail de origem (Gmail): ");
            String usuarioSmtp = scanner.nextLine();

            System.out.print("Digite sua Senha de Aplicativo: ");
            String senhaSmtp = scanner.nextLine();

            System.out.print("Digite o e-mail do destinatário: ");
            String para = scanner.nextLine();

            String mensagem = "Suas tarefas adicionadas nesta sessão:\n" + tarefasAcumuladas.toString();

            try {
                // Passando as variáveis capturadas como parâmetro
                Carteiro.enviar(usuarioSmtp, senhaSmtp, para, "Sua lista de tarefas", mensagem);
            } catch (EmailException e) {
                System.err.println("Ocorreu um erro ao enviar o e-mail: " + e.getMessage());
            }
        }else{
                System.out.println("Não foram adicionadas tarefas, email não enviado.");
            }
            System.out.println("Fim...");
            scanner.close();

        }
    }