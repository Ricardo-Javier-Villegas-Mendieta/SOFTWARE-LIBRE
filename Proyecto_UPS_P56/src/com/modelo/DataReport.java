package com.modelo;

public class DataReport {
	private Number contador;
	private String datos;
	
	public DataReport() {
		
	}
	
	public DataReport(Number contador, String datos) {
		this.contador = contador;
		this.datos = datos;
	}

	public Number getContador() {
		return contador;
	}

	public void setContador(Number contador) {
		this.contador = contador;
	}

	public String getDatos() {
		return datos;
	}

	public void setDatos(String datos) {
		this.datos = datos;
	}
}