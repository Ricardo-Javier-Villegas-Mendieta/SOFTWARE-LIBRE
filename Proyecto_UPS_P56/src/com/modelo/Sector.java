package com.modelo;

import java.util.Date;

public class Sector {
	private int sk_sector;
	private String pk_sector;
	private Date valido_desde;
	private Date valido_hasta;
	private int version;
	
	public Sector () {
		
	}
	
	public Sector (int sk_sector,String pk_sector,Date valido_desde,Date valido_hasta,int version) {
		this.sk_sector=sk_sector;
		this.pk_sector=pk_sector;
		this.valido_desde=valido_desde;
		this.valido_hasta=valido_hasta;
		this.version=version;
	}

	public int getSk_sector() {
		return sk_sector;
	}

	public void setSk_sector(int sk_sector) {
		this.sk_sector = sk_sector;
	}

	public String getPk_sector() {
		return pk_sector;
	}

	public void setPk_sector(String pk_sector) {
		this.pk_sector = pk_sector;
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