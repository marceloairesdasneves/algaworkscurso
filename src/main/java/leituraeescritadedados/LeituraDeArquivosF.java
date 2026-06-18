package leituraeescritadedados;

// @author Marcelo Neves

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraDeArquivosF {
    public static void main(String[] args) throws IOException {

        Path caminhoArquivo = Paths.get(System.getProperty("user.home"), "tarefas.txt");
        List<String> linhas = Files.readAllLines(caminhoArquivo);

        for(int i = 0; i < linhas.size(); i++){
            String linha = linhas.get(i);
            System.out.println((i + 1) + ": " + linha);

        }
    }
}
