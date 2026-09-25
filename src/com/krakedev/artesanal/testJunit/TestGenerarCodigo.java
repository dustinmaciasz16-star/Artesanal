package com.krakedev.artesanal.testJunit;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.NegocioMejorado;

public class TestGenerarCodigo {
	
	@Test
    public void testGenerarCodigo() {

        NegocioMejorado negocio = new NegocioMejorado();

        String codigo = negocio.generarCodigo();

        System.out.println(codigo);

        assertNotNull(codigo);
        assertTrue(codigo.startsWith("M-"));
    }

}
