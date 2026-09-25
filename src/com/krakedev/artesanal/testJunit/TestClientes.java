package com.krakedev.artesanal.testJunit;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.NegocioMejorado;

public class TestClientes {
	
	@Test
    public void testRegistrarCliente() {

        NegocioMejorado negocio = new NegocioMejorado();

        negocio.registrarCliente("Dustin", "1234567890");
    }

}
