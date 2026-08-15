package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestLlenar {

	public static void main(String[] args) {

		Maquina maquina = new Maquina("Pilcener", "Cerveza rubia", 0.02, 8000, "C001");

		maquina.imprimir();

		maquina.llenarMaquina();

		maquina.imprimir();

		Maquina maquina2 = new Maquina("Pilcener", "Cerveza rubia", 0.02, "C001");
		
		maquina2.imprimir();
		
		maquina2.llenarMaquina();
		
		maquina2.imprimir();
		
	}

}
