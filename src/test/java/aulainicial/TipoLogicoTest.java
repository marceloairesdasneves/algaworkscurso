package aulainicial;// @author Marcelo Neves

import aulainicial.TipoLogico;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TipoLogicoTest {

    @Test
    void devePermitirCnhQuandoIdadeIgualA18() {
        assertTrue(TipoLogico.podeTirarCNH(18));
    }

    @Test
    void devePermitirCnhQuandoIdadeMaiorQue18() {
        assertTrue(TipoLogico.podeTirarCNH(25));
    }

    @Test
    void naoDevePermitirCnhQuandoIdadeMenorQue18() {
        assertFalse(TipoLogico.podeTirarCNH(17));
    }

    @Test
    void deveLancarExcecaoQuandoIdadeNegativa() {
        assertThrows(IllegalArgumentException.class,
                () -> TipoLogico.podeTirarCNH(-1));
    }
}
