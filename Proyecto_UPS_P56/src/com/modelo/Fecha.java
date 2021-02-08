package com.modelo;

import java.util.Date;

public class Fecha {
	private int sk_fecha;
	private int anio;
	private int semestre;
	private String nombre_semestre;
	private int trimestre;
	private String nombre_trimestre;
	private int mes;
	private String nombre_mes;
	private int dia;
	private Date fecha;
	
	public Fecha () {
		
	}
	
	public Fecha (int sk_fecha, int anio, int semestre, String nombre_semestre, int trimestre, 
			String nombre_trimestre , int mes,String nombre_mes,int dia,Date fecha) {
		this.sk_fecha = sk_fecha;
		this.anio = anio;
		this.semestre = semestre;
		this.nombre_semestre = nombre_semestre;
		this.trimestre = trimestre;
		this.nombre_trimestre = nombre_trimestre;
		this.mes = mes;
		this.nombre_mes = nombre_mes;
		this.dia = dia;
		this.fecha = fecha;
	}

	public int getSk_fecha() {
		return sk_fecha;
	}

	public void setSk_fecha(int sk_fecha) {
		this.sk_fecha = sk_fecha;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public String getNombre_semestre() {
		return nombre_semestre;
	}

	public void setNombre_semestre(String nombre_semestre) {
		this.nombre_semestre = nombre_semestre;
	}

	public int getTrimestre() {
		return trimestre;
	}

	public void setTrimestre(int trimestre) {
		this.trimestre = trimestre;
	}

	public String getNombre_trimestre() {
		return nombre_trimestre;
	}

	public void setNombre_trimestre(String nombre_trimestre) {
		this.nombre_trimestre = nombre_trimestre;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public String getNombre_mes() {
		return nombre_mes;
	}

	public void setNombre_mes(String nombre_mes) {
		this.nombre_mes = nombre_mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}