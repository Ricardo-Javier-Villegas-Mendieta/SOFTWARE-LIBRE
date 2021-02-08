package com.control;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.modelo.Fecha;


@Named(value = "beanFecha")
@SessionScoped

public class BeanFecha implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	private Fecha cls_fecha;
	
	public BeanFecha () {
		
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

	public Fecha getCls_fecha() {
		return cls_fecha;
	}

	public void setCls_fecha(Fecha cls_fecha) {
		this.cls_fecha = cls_fecha;
	}
	
	public ArrayList<Fecha> listaFechas() throws SQLException {
		ControllerFecha controller = new ControllerFecha();
		return controller.ImprimeFechas();
	}
	
	public ArrayList<String> listaMeses() throws SQLException {
		ControllerFecha controller = new ControllerFecha();
		return controller.ImprimeMeses();
	}
	
	public ArrayList<String> listaAnios() throws SQLException {
		ControllerFecha controller = new ControllerFecha();
		return controller.ImprimeAnios();
	}
}