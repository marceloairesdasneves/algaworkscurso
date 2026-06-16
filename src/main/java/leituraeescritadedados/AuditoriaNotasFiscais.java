package leituraeescritadedados;
// @author Marcelo Neves
import java.io.*;

public class AuditoriaNotasFiscais {
    private static final String CAMINHO_ARQUIVO = STR."\{System.getProperty("user.home")}/logNF.txt";

    public static void main(String[] args){
        System.out.println("=========== Log de auditoria de NF fiscais ===========");
        try(BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));//Scanner scanner = new Scanner(System.in);
            BufferedWriter writer = new BufferedWriter(new FileWriter(CAMINHO_ARQUIVO, true))) {
            System.out.printf("Salvando em: %s%n", CAMINHO_ARQUIVO);
            while(true){
                System.out.print("Digite o número da nota fiscal (ou 'FIM' para sair): ");
                String numeroNF = leitor.readLine();
                if(numeroNF.equalsIgnoreCase("FIM")){
                    break;
                }
                System.out.print("Digite o status da nota fiscal ('A'provada/'R'ejeitada): ");
                String statusNF = " " + leitor.readLine().toUpperCase();

                writer.write(numeroNF);
                writer.write(statusNF);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.printf("Erro ao salvar o arquivo: %s%n", e.getMessage());
        }
    }
}