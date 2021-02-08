package com.control;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.modelo.Sector;

@Named(value = "beanSector")
@SessionScoped

public class BeanSector implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int sk_provincia;
	private String pk_provincia;
	private Date valido_desde;
	private Date valido_hasta;
	private int version;
	private Sector cls_Sector;
	
	public BeanSector() {
		
	}

	public int getSk_provincia() {
		return sk_provincia;
	}

	public void setSk_provincia(int sk_provincia) {
		this.sk_provincia = sk_provincia;
	}

	public String getPk_provincia() {
		return pk_provincia;
	}

	public void setPk_provincia(String pk_provincia) {
		this.pk_provincia = pk_provincia;
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

	public Sector getCls_Sector() {
		return cls_Sector;
	}

	public void setCls_Sector(Sector cls_Sector) {
		this.cls_Sector = cls_Sector;
	}
	
	public ArrayList<Sector> listaSector() throws SQLException {
		ControllerSector controller = new ControllerSector();
		return controller.ImprimeSector();
	}
	
	public ArrayList<String> listaSectores() throws SQLException {
		ControllerSector controller = new ControllerSector();
		return controller.ImprimeSectores();
	}
}