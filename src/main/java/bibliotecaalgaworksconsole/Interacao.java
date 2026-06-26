package bibliotecaalgaworksconsole;
// @author Marcelo Neves

import java.util.Scanner;

public class Interacao {

    Scanner scanner = new Scanner(System.in);

    public Integer lerNumero(String texto){
        System.out.println(texto);
        Integer numero = scanner.nextInt();
        scanner.nextLine();
        return numero;
    }

    public Double lerDecimal(String texto){
        System.out.println(texto);
        Double decimal = scanner.nextDouble();
        scanner.nextLine();
        return decimal;
    }

    public String lerString(String texto){
        System.out.println(texto);
        return scanner.nextLine();
    }

    public void fechar(){
        scanner.close();
    }

    public void imprimir(String texto){
        System.out.println(texto);
    }

    public void imprimirErro(String texto){
        System.err.println(texto);
    }


}
