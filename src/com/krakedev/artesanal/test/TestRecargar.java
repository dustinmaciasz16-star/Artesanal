package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestRecargar {

	public static void main(String[] args) {

		boolean resultado;
		Maquina maquina = new Maquina("Pilcener", "Cerveza rubia", 0.02, 8000, "C001");
		
		System.out.println("Estado inicial");
		maquina.imprimir();

		System.out.println("Recarga 1");
		resultado = maquina.recragarCerveza(3000);
		System.out.println("Se recrago correctamente?" + resultado);
		maquina.imprimir();
		
		System.out.println("Recarga 2");
		resultado = maquina.recragarCerveza(2000);
		System.out.println("Se recrago correctamente?" + resultado);
		maquina.imprimir();
		
		System.out.println("Recarga 3");
		resultado = maquina.recragarCerveza(3000);
		System.out.println("Se recrago correctamente?" + resultado);
		maquina.imprimir();
		
		System.out.println("Recarga 4");
		resultado = maquina.recragarCerveza(2900);
		System.out.println("Se recrago correctamente?" + resultado);
		maquina.imprimir();
	}

}
