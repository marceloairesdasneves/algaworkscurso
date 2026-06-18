package leituraeescritadedados;

// @author Marcelo Neves

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LeituraArquivos {
    private static final String CAMINHO_ARQUIVO = System.getProperty("user.home") + "/tarefas.txt";
    public static void main(String[] args) throws IOException {
        Path path = Paths.get(CAMINHO_ARQUIVO);
        if(!Files.exists(path)){
            System.out.println("Arquivo não encontrado: " + CAMINHO_ARQUIVO);
            return;
        }
        System.out.println("Iniciando leitura de arquivos...");
        BufferedReader leitor = Files.newBufferedReader(Paths.get(CAMINHO_ARQUIVO));
        String linha;
        while ((linha = leitor.readLine()) != null) {
            System.out.println(linha);
        }
        leitor.close();

    }
}
