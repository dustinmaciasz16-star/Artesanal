package com.krakedev.artesanal;

public class Cliente {
	private String nombre;
	private String cedula;
	private String codigo;
	private double totalConsumido;
	
	public Cliente(String nombre, String cedula, String codigo) {
	    this.nombre = nombre;
	    this.cedula = cedula;
	    this.codigo = codigo;
	    this.totalConsumido = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public String getCodigo() {
		return codigo;
	}

	public double getTotalConsumido() {
		return totalConsumido;
	}
	
	public void agregarConsumo(double valor) {
        totalConsumido += valor;
    }
}
