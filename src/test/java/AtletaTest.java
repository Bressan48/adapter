package padroesestruturais.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtletaTest {

    @Test
    void deveRetornarConceitoAtleta() {
        Atleta atleta = new Atleta();
        atleta.setProva("A");

        assertEquals("A", atleta.getProva());
    }

    @Test
    void deveRetornarNotaAtleta() {
        Atleta atleta = new Atleta();
        atleta.setProva("A");

        assertEquals(9.0f, atleta.getNota());
    }

}
