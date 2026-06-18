package leituraeescritadedados;
// @author Marcelo Neves
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LeituraArquivoModSenior {
    private static final Path CAMINHO_ARQUIVO = Path.of(System.getProperty("user.home"), "tarefas.txt");
    public static void main(String[] args){
        if(!Files.exists(CAMINHO_ARQUIVO)){
            System.out.println("Arquivo não encontrado: " + CAMINHO_ARQUIVO);
            return;
        }
        System.out.println("Iniciando leitura de arquivos...");

        try(BufferedReader leitor = Files.newBufferedReader(CAMINHO_ARQUIVO);){
            String linha;
            while((linha = leitor.readLine()) != null){
                System.out.println(linha);
            }
        }catch (IOException E){
            System.out.println("Erro ao ler o arquivo: " + E.getMessage());
        }
    }
}
