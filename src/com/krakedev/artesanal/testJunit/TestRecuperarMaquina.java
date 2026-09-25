package com.krakedev.artesanal.testJunit;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.NegocioMejorado;

public class TestRecuperarMaquina {
	@Test
    public void testRecuperarMaquina() {

        NegocioMejorado negocio = new NegocioMejorado();

        negocio.agregarMaquina(
                "Pilsener",
                "Cerveza artesanal",
                0.05
        );

        Maquina maquinaAgregada = negocio.getMaquinas().get(0);

        String codigo = maquinaAgregada.getCodigo();

        Maquina maquinaRecuperada = negocio.recuperarMaquina(codigo);

        assertNotNull(maquinaRecuperada);
    }

    @Test
    public void testRecuperarMaquinaNoExiste() {

        NegocioMejorado negocio = new NegocioMejorado();

        Maquina maquina = negocio.recuperarMaquina("M-999");

        assertNull(maquina);
    }
}
