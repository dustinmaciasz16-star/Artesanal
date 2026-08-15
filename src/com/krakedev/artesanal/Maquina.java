package com.krakedev.artesanal;

public class Maquina {

	private String nombreCerbeza;
	private String descripcion;
	private double precioPorML;
	private double capacidadMaxima;
	private double cantidadActual;
	private String codigo;

	public Maquina(String nombreCerbeza, String descripcion, double precioProML, double capacidadMaxima, String codigo) {
		this.nombreCerbeza = nombreCerbeza;
		this.descripcion = descripcion;
		this.precioPorML = precioProML;
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = 0;
		this.codigo = codigo;
	}

	public Maquina(String nombreCerbeza, String descripcion, double precioProML, String codigo) {
		this.nombreCerbeza = nombreCerbeza;
		this.descripcion = descripcion;
		this.precioPorML = precioProML;
		this.capacidadMaxima = 10000;
		this.cantidadActual = 0;
		this.codigo = codigo;
	}

	public String getNombreCerbeza() {
		return nombreCerbeza;
	}

	public void setNombreCerbeza(String nombreCerbeza) {
		this.nombreCerbeza = nombreCerbeza;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioProML() {
		return precioPorML;
	}

	public void setPrecioProML(double precioProML) {
		this.precioPorML = precioProML;
	}

	public double getCapacidadMaxiam() {
		return capacidadMaxima;
	}

	public double getCantidadActual() {
		return cantidadActual;
	}

	public String getCodigo() {
		return codigo;
	}

	public void imprimir() {
		String mensaje;

		mensaje = "Nombre Cerveza: " + nombreCerbeza + ", Descripcion: " + descripcion + ", Precio por ML: "
				+ precioPorML + ", Capacidad Maxima: " + capacidadMaxima + ", Capacidad Actual: " + cantidadActual
				+ ", Codigo: " + codigo;

		System.out.println(mensaje);
	}

	public void llenarMaquina() {
		this.cantidadActual = this.capacidadMaxima - 200;
	}

	public boolean recragarCerveza(double cantidad) {

		double limitePermitido = capacidadMaxima - 200;

		if (cantidadActual + cantidad <= limitePermitido) {
			cantidadActual += cantidad;
			return true;
		} else {
			return false;
		}
	}

	public double servirCerveza(double cantidad) {

		if (cantidadActual >= cantidad) {
			cantidadActual -= cantidad;
			double valor = cantidad * precioPorML;
			return valor;
		} else {
			return 0;
		}
	}

}
