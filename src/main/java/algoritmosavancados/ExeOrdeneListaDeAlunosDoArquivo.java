package algoritmosavancados;
// @author Marcelo Neves
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;

public class ExeOrdeneListaDeAlunosDoArquivo {
   private static final String CAMINHO_ORIGEM = STR."\{System.getProperty("user.home")}/lista1.txt";
   private static final String CAMINHO_DESTINO = STR."\{System.getProperty("user.home")}/lista2.txt";

    public static void main(String[] args){
        System.out.println("=========== Leitura e Ordenando a lista ===========");
        Path origem = Path.of(CAMINHO_ORIGEM);
        Path destino = Path.of(CAMINHO_DESTINO);

        try (Stream<String> linhas = Files.lines(origem)){
            List<String> linhasOrdenadas = linhas.sorted().toList();

            Files.write(destino, linhasOrdenadas, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println(STR."Arquivo ordenado e salvo em: \{CAMINHO_DESTINO} com sucesso.");

        }catch (IOException e) {
            System.err.printf("Erro ao processar o arquivo: %s%n", e.getMessage());
        }
    }
}

