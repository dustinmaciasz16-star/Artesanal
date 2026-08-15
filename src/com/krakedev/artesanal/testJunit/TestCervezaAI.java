package com.krakedev.artesanal.testJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;

public class TestCervezaAI {

	@Test
	public void testServirCerveza() {
	
		// Se utiliza el constructor que permite establecer la capacidad máxima.
		Maquina maquina = new Maquina("Pilsener", "Cerveza artesanal", 0.05, 5000, "M001");
	
		// Se llena la máquina hasta la cantidad permitida.
		maquina.llenarMaquina();
	
		// Se sirven 1000 ml de cerveza.
		double valor = maquina.servirCerveza(1000);
	
		// Valida que el valor a pagar sea cantidad servida * precio por ML.
		assertEquals(50.0, valor, 0.001);
	
		// La máquina tenía 4800 ml y después de servir 1000 ml
		// debe quedar con 3800 ml.
		assertEquals(3800.0, maquina.getCantidadActual(), 0.001);
	}
	
	@Test
	public void testNoPuedeServirMasDeLoDisponible() {
	
		// Se utiliza el constructor con capacidad máxima.
		Maquina maquina = new Maquina("Pilsener", "Cerveza artesanal", 0.05, 5000, "M002");
	
		// Se llena la máquina. Queda con 4800 ml disponibles.
		maquina.llenarMaquina();
	
		// Se intenta servir una cantidad superior a la disponible.
		double valor = maquina.servirCerveza(5000);
	
		// Si no puede servir, el valor a pagar debe ser cero.
		assertEquals(0.0, valor, 0.001);
	
		// La cantidad disponible no debe modificarse.
		assertEquals(4800.0, maquina.getCantidadActual(), 0.001);
	}
	
	@Test
	public void testRecragarCerveza() {
	
		// Se utiliza el constructor que permite establecer la capacidad máxima.
		Maquina maquina = new Maquina("Pilsener", "Cerveza artesanal", 0.05, 5000, "M003");
	
		// Se agregan 1000 ml de cerveza.
		boolean resultado = maquina.recragarCerveza(1000);
	
		// Valida que la recarga se haya realizado correctamente.
		assertEquals(true, resultado);
	
		// La máquina debe tener los 1000 ml agregados.
		assertEquals(1000.0, maquina.getCantidadActual(), 0.001);
	}
	
	@Test
	public void testConstructorCapacidadPorDefecto() {
	
		// Se utiliza el constructor que establece automáticamente
		// una capacidad máxima de 10000 ml.
		Maquina maquina = new Maquina("Pilsener", "Cerveza artesanal", 0.05, "M004");
	
		// Se comprueba que la capacidad máxima sea 10000 ml.
		assertEquals(10000.0, maquina.getCapacidadMaxiam(), 0.001);
	
		// Se llena la máquina.
		// Según el comportamiento de llenarMaquina(), debe quedar
		// con 200 ml menos que la capacidad máxima.
		maquina.llenarMaquina();
	
		// Debe quedar con 9800 ml.
		assertEquals(9800.0, maquina.getCantidadActual(), 0.001);
	}
	
	@Test
	public void testServirCervezaConConstructorPorDefecto() {
	
		// Se utiliza el constructor que establece capacidad máxima de 10000 ml.
		Maquina maquina = new Maquina("Pilsener", "Cerveza artesanal", 0.02, "M005");
	
		// Se llena la máquina, quedando con 9800 ml.
		maquina.llenarMaquina();
	
		// Se sirven 500 ml.
		double valor = maquina.servirCerveza(500);
	
		// Valida que el valor a pagar sea 500 * 0.02 = 10.
		assertEquals(10.0, valor, 0.001);
	
		// Valida que después de servir queden 9300 ml.
		assertEquals(9300.0, maquina.getCantidadActual(), 0.001);
	}

}
