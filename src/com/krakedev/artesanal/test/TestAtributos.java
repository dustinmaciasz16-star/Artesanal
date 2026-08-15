package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestAtributos {

	public static void main(String[] args) {
		
		Maquina rubia = new Maquina("Pilcener", "Cerveza rubia", 0.02, 10000, "C001");
		
		rubia.imprimir();
		
		rubia.setNombreCerbeza("Club");
		rubia.setDescripcion("Cervesa Club de rubia");
		rubia.imprimir();

	}

}
