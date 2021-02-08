package com.control;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.modelo.Localidad;

@Named(value = "beanLocalidad")
@SessionScoped

public class BeanLocalidad implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int sk_localidad;
	private String pk_localidad;
	private Date valido_desde;
	private Date valido_hasta;
	private int version;
	private Localidad cls_Localidad;
	
	public BeanLocalidad () {
		
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

	public Localidad getCls_Localidad() {
		return cls_Localidad;
	}

	public void setCls_Localidad(Localidad cls_Localidad) {
		this.cls_Localidad = cls_Localidad;
	}
	
	public ArrayList<Localidad> listaLocalidad() throws SQLException {
		ControllerLocalidad controller = new ControllerLocalidad();
		return controller.ImprimeLocalidad();
	}
	
	public ArrayList<String> listaLocalidades() throws SQLException {
		ControllerLocalidad controller = new ControllerLocalidad();
		return controller.ImprimeLocalidades();
	}
}