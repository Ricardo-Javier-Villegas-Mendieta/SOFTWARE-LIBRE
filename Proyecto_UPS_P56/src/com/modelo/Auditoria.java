package com.modelo;

import java.util.Date;

public class Auditoria {
	
	private int id_aud;
	private String tabla_aud;
	private String operacion_aud;
	private String valoranterior_aud;
	private String valornuevo_aud;
	private Date fecha_aud;
	private String usuario_aud;
	private String esquema_aud;
	private boolean activar_aud;
	private boolean trigger_aud;
	
	public Auditoria() {
		
	}
	
	public Auditoria(int id,String tabla, String operacion,String va, String vn, Date fecha,String usuario, String esquema,
			boolean activar, boolean trigger) {
		
		this.id_aud = id;
		this.tabla_aud = tabla;
		this.operacion_aud = operacion;
		this.valoranterior_aud = va;
		this.valornuevo_aud = vn;
		this.fecha_aud = fecha;
		this.usuario_aud = usuario;
		this.esquema_aud = esquema;
		this.activar_aud = activar;
		this.trigger_aud = trigger;
	}

	public int getId_aud() {
		return id_aud;
	}

	public void setId_aud(int id_aud) {
		this.id_aud = id_aud;
	}

	public String getTabla_aud() {
		return tabla_aud;
	}

	public void setTabla_aud(String tabla_aud) {
		this.tabla_aud = tabla_aud;
	}

	public String getOperacion_aud() {
		return operacion_aud;
	}

	public void setOperacion_aud(String operacion_aud) {
		this.operacion_aud = operacion_aud;
	}

	public String getValoranterior_aud() {
		return valoranterior_aud;
	}

	public void setValoranterior_aud(String valoranterior_aud) {
		this.valoranterior_aud = valoranterior_aud;
	}

	public String getValornuevo_aud() {
		return valornuevo_aud;
	}

	public void setValornuevo_aud(String valornuevo_aud) {
		this.valornuevo_aud = valornuevo_aud;
	}

	public Date getFecha_aud() {
		return fecha_aud;
	}

	public void setFecha_aud(Date fecha_aud) {
		this.fecha_aud = fecha_aud;
	}

	public String getUsuario_aud() {
		return usuario_aud;
	}

	public void setUsuario_aud(String usuario_aud) {
		this.usuario_aud = usuario_aud;
	}

	public String getEsquema_aud() {
		return esquema_aud;
	}

	public void setEsquema_aud(String esquema_aud) {
		this.esquema_aud = esquema_aud;
	}

	public boolean isActivar_aud() {
		return activar_aud;
	}

	public void setActivar_aud(boolean activar_aud) {
		this.activar_aud = activar_aud;
	}

	public boolean isTrigger_aud() {
		return trigger_aud;
	}

	public void setTrigger_aud(boolean trigger_aud) {
		this.trigger_aud = trigger_aud;
	}
}
