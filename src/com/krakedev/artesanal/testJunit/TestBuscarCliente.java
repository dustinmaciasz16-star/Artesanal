package com.krakedev.artesanal.testJunit;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.NegocioMejorado;

public class TestBuscarCliente {
	 @Test
	    public void testBuscarClientePorCedula() {

	        NegocioMejorado negocio = new NegocioMejorado();

	        negocio.registrarCliente("Dustin", "1234567890");

	        Cliente cliente = negocio.buscarClientePorCedula("1234567890");

	        assertNotNull(cliente);
	    }

	    @Test
	    public void testBuscarClientePorCodigo() {

	        NegocioMejorado negocio = new NegocioMejorado();

	        negocio.registrarCliente("Dustin", "1234567890");

	        Cliente cliente = negocio.buscarClientePorCodigo("C-1");

	        assertNotNull(cliente);
	    }

	    @Test
	    public void testClienteNoExiste() {

	        NegocioMejorado negocio = new NegocioMejorado();

	        Cliente cliente = negocio.buscarClientePorCedula("9999999999");

	        assertNull(cliente);
	    }
}
