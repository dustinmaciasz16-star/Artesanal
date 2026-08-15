package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestServir {

	public static void main(String[] args) {
		
		
		Maquina maquina = new Maquina("Pilcener", "Cerveza rubia", 0.02, 8000, "C001");
		
		System.out.println("Estado inicial");
		maquina.imprimir();
		
		System.out.println();
		
		System.out.println("Llenar maquina");
		maquina.llenarMaquina();
		maquina.imprimir();
		
		System.out.println();
		
		System.out.println("Servir Cerveza");
		double valor = maquina.servirCerveza(1000);
		maquina.imprimir();
		System.out.println("Valor a pagar: " + valor);
		
		System.out.println();
		
		System.out.println("Servir Cerveza");
		valor = maquina.servirCerveza(2000);
		maquina.imprimir();
		System.out.println("Valor a pagar: " + valor);
		
		System.out.println();
		
		System.out.println("Servir Cerveza");
		valor = maquina.servirCerveza(3000);
		maquina.imprimir();
		System.out.println("Valor a pagar: " + valor);
		
		System.out.println();
		
		System.out.println("Servir Cerveza");
		valor = maquina.servirCerveza(4000);
		maquina.imprimir();
		System.out.println("Valor a pagar: " + valor);

	}

}
