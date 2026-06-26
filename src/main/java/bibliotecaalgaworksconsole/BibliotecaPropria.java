package bibliotecaalgaworksconsole;

// @author Marcelo Neves

public class BibliotecaPropria {
    public static void main(String[] args) {
        Interacao interacao = new Interacao();

        Integer numero = interacao.lerNumero("Digite um número: ");
        interacao.imprimir("O número digitado foi: " + numero);
        Double decimal = interacao.lerDecimal("Digite um decimal: ");
        interacao.imprimir("O decimal digitado: " + decimal);

    }
}
