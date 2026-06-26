package shuhari;

// @author Marcelo Neves

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;
import static java.lang.System.*;

public class FiltroLogNFse {
    public static void main (String[] args) {
        if (args.length < 2) {
            err.println("Uso: java FiltroLogNfse <caminho_arquivo_origem> <caminho_arquivo_destino>");
            return;
        }
        Path origem = Path.of(args[0]);
        Path destino = Path.of(args[1]);

        if (!Files.exists(origem)) {
            err.println("Erro: arquivo nao encontrado.");
        }

        try (Stream<String> lerarquivos = Files.lines(origem)) {

            List<String> linhasFiltradas = lerarquivos
                    .filter(linha -> linha.contains("SUCESSO"))
                    .toList();

            Files.write(destino, linhasFiltradas, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            out.println(STR."Arquivo filtrado e salvo em: \{destino} com sucesso. ");
        } catch (IOException e) {
            err.printf("Erro ao processar o arquivo: %s%n", e.getMessage());
        }
    }
}

