package com.control;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.faces.context.FacesContext;

import com.dao.daoPersona;
import com.modelo.Persona;

public class ControllerPersona {
	public String enviaDatoEstudiante(int id_usuario, String correo, String clave, String nombre, String apellido, String cedula, int id_perfil, String n_perfil) {
		daoPersona daoAlumno = new daoPersona();
		String respuesta = "";
		try {
			daoAlumno.envioPersona(id_usuario, correo, clave, nombre, apellido, cedula, id_perfil, n_perfil);
			respuesta = "RegCor";
		} catch (Exception e) {
			respuesta = "no";
		}

		return respuesta;
	}

	public String agregarPersona(int id_usuario, String correo, String clave, String nombre, String apellido, String cedula, int id_perfil) {
		daoPersona daoAlumno = new daoPersona();
		String respuesta = daoAlumno.RegistrarUsuario(id_usuario, correo, clave, nombre, apellido, cedula, id_perfil);
		return respuesta;
	}
/*
	public String eliminarPersona(Persona persona) {

		DaoPersona daoalumno = new DaoPersona();
		String respuesta = daoalumno.eliminarPer(persona);
		return respuesta;

	}

	public void modificarPersona(Persona persona) throws SQLException {

		DaoPersona daoAlumno = new DaoPersona();
		daoAlumno.modificarPer(persona);
	}
*/
	public void forward() throws IOException {
		String uri = "destination.xhtml";
		FacesContext.getCurrentInstance().getExternalContext().dispatch(uri);
	}

	public ArrayList<Persona> ImprimePersona() throws SQLException {
		daoPersona daoalumno;
		daoalumno = new daoPersona();
		return daoalumno.FindAllPersonas();
	}

	/*
	 * public ArrayList<Persona> ImprimeCedula() throws SQLException { DaoPersona
	 * daoalumno; daoalumno = new DaoPersona(); return daoalumno.FindAllCedulas(); }
	 */
/*
	public Persona leerIDPersona(Persona persona) throws Exception {

		DaoPersona daoAlumno = new DaoPersona();
		return daoAlumno.LeerID(persona);
	}
*/
	public int login(String user, String pass) throws SQLException {
		daoPersona daouser = new daoPersona();
		for (Persona u : daouser.FindAllPersonas()) {
			if (u.getCorreo().equals(user) && u.getClave().equals(pass)) {
				return u.getId_perfil();
			}
		}
		return 0;
	}

}