package com.modelo;

import java.util.Date;

public class Localidad {
	private int sk_localidad;
	private String pk_localidad;
	private Date valido_desde;
	private Date valido_hasta;
	private int version;
	
	public Localidad () {
		
	}
	
	public Localidad (int sk_localidad,String pk_localidad,Date valido_desde,Date valido_hasta,int version) {
		this.sk_localidad=sk_localidad;
		this.pk_localidad=pk_localidad;
		this.valido_desde=valido_desde;
		this.valido_hasta=valido_hasta;
		this.version=version;
	}

	public int getSk_localidad() {
		return sk_localidad;
	}

	public void setSk_localidad(int sk_localidad) {
		this.sk_localidad = sk_localidad;
	}

	public String getPk_localidad() {
		return pk_localidad;
	}

	public void setPk_localidad(String pk_localidad) {
		this.pk_localidad = pk_localidad;
	}

	public Date getValido_desde() {
		return valido_desde;
	}

	public void setValido_desde(Date valido_desde) {
		this.valido_desde = valido_desde;
	}

	public Date getValido_hasta() {
		return valido_hasta;
	}

	public void setValido_hasta(Date valido_hasta) {
		this.valido_hasta = valido_hasta;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
}