package com.krakedev.artesanal.testJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;

public class TestLlenarJUnit {
	
	@Test
	public void TestLlenarMquina() {
		Maquina maquina = new Maquina("Pilcener", "Cerveza", 0.02, 8000, "C001");
		maquina.llenarMaquina();
		assertEquals(7800, maquina.getCantidadActual(), 0.0001);
		
		
		
		
	}

}
