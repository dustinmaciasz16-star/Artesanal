package com.krakedev.artesanal.testJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;

public class TestRecargarJUnit {
	
	@Test
	public void testRecargarExitosa() {
		Maquina maquina = new Maquina("Pilcener", "Cerveza", 0.02, 8000, "C001");
		boolean resultado = maquina.recragarCerveza(3000);
		assertTrue(resultado);
		assertEquals(3000, maquina.getCantidadActual(), 0.0001);
	}
	
	@Test
	public void testRecargarFallida() {
		Maquina maquina2 = new Maquina("Club", "Cerveza Fria", 0.02, 8000, "C001");
		maquina2.recragarCerveza(7000);
		boolean resultado = maquina2.recragarCerveza(1000);
		assertTrue(resultado);
		assertEquals(3000, maquina2.getCantidadActual(), 0.0001);
	}

}
