package com.modelo;

public class ReportesInt {
	private int contador;
	private int year;
	
	public ReportesInt() {
		
	}

	public ReportesInt(int contador, int year){
		this.contador = contador;
		this.year = year;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}