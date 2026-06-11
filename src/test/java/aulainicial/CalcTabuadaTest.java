package aulainicial;

// @author Marcelo Neves

import metodos.CalcTabuada;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTabuadaTest {


    @Test
    public void testCalcularTabuadaComSucesso() {
        // Cenário: Tabuada com qualquer numero
        int numeroBase = 10;
        int limite = -3;

        // Ação: Executa o seu método estático da classe CalcTabuada
        CalcTabuada.calcularTabuada(numeroBase, limite, 1);

        // O que esperamos que apareça no console (atente-se às quebras de linha %n)
        String resultadoEsperado = String.format(
                "5 x 1 = 5%n" +
                        "5 x 2 = 10%n" +
                        "5 x 3 = 15%n"
        );
    }
}