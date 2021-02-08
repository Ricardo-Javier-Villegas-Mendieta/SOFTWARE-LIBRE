package com.modelo;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named(value="persona")
@SessionScoped

public class Persona implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id_usuario;
    private String correo;
    private String clave;
	private String nombre;
    private String apellido;
    private String cedula;
    private int id_perfil;
    private String n_perfil;
    
    public Persona() {
    	
    }
    
    public Persona(int id_usuario, String correo, String clave, String nombre, String apellido, String cedula, int id_perfil, String n_perfil) {
    	this.id_usuario = id_usuario;
    	this.correo = correo;
    	this.clave = clave;
    	this.nombre= nombre;
    	this.apellido = apellido;
    	this.cedula = cedula;
    	this.id_perfil = id_perfil;
    	this.n_perfil = n_perfil;
    }

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getId_perfil() {
		return id_perfil;
	}

	public void setId_perfil(int id_perfil) {
		this.id_perfil = id_perfil;
	}

	public String getN_perfil() {
		return n_perfil;
	}

	public void setN_perfil(String n_perfil) {
		this.n_perfil = n_perfil;
	}
    
}