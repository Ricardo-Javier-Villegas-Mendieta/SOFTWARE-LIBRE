package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.conexion.conexion;
import com.modelo.Persona;

public class daoPersona {
	public ArrayList<Persona> FindAllPersonas() throws SQLException {
		ArrayList<Persona> persona = new ArrayList<>();

		ResultSet re;
		conexion cl = new conexion();
		re = cl.consulta("select id_usuario, correo, clave, nombre, apellido, cedula, perfil.id_perfil, n_perfil from usuario, perfil where usuario.id_perfil=perfil.id_perfil;");
		int id_usuario;
		String correo;
		String clave;
		String nombre;
		String apellido;
		String cedula;
		int id_perfil;
		String n_perfil;
		while (re.next()) {
			id_usuario = re.getInt(1);
			correo = re.getString(2);
			clave = re.getString(3);
			nombre = re.getString(4);
			apellido = re.getString(5);
			cedula = re.getString(6);
			id_perfil = re.getInt(7);
			n_perfil = re.getString(8);
			persona.add(new Persona(id_usuario, correo, clave, nombre, apellido, cedula, id_perfil, n_perfil));
		}
		return persona;
	}

	public ArrayList<Persona> envioPersona(int id_usuario, String correo, String clave, String nombre, String apellido, String cedula, int id_perfil, String n_perfil) throws SQLException {
		Persona persona = new Persona(id_usuario, correo, clave, nombre, apellido, cedula, 2, n_perfil);
		persona.setId_usuario(id_usuario);
		persona.setCorreo(correo);
		persona.setClave(clave);
		persona.setNombre(nombre);
		persona.setApellido(apellido);
		persona.setCedula(cedula);
		persona.setId_perfil(id_perfil);

		conexion cl = new conexion();
		cl.ejecutar(
				"insert into usuario(correo, clave, nombre, apellido, cedula, id_perfil) values ('"
						+ correo + "','" + clave + "','" + nombre + "','" + apellido + "','" + cedula + "','" + 2
						+ "');");
		return this.FindAllPersonas();

	}

	public String RegistrarUsuario(int id_usuario, String correo, String clave, String nombre, String apellido, String cedula, int id_perfil) {
		String result = "";
		conexion cl = new conexion();
		PreparedStatement pr = null;
		String sql = "INSERT INTO usuario(correo, clave, nombre, apellido, cedula, id_perfil)";
		sql += "VALUES(?,?,?,?,?,?)";
		try {
			pr = cl.getConexion().prepareStatement(sql);
			pr.setString(1, correo);
			pr.setString(2, clave);
			pr.setString(3, nombre);
			pr.setString(4, apellido);
			pr.setString(5, cedula);
			pr.setInt(6, 2);

			if (pr.executeUpdate() == 1) {
				result = "RegCor";
			} else {
				result = "no";
			}
		} catch (Exception ex) {
			result = ex.getMessage();
		} finally {
			try {
				pr.close();
				cl.getConexion().close();
			} catch (Exception ex) {
				result = ex.getMessage();
			}
		}

		return result;
	}
/*
	public String eliminarPer(Persona persona) {
		String result = "";
		PreparedStatement st = null;
		Cls_conexion cl = new Cls_conexion();
		try {
			st = cl.getConexion().prepareStatement("delete from persona where cedula = ? ");
			st.setString(1, persona.getDoc_identidad());
			if (st.executeUpdate() == 1) {
				result = "eliminado";
			} else {
				result = "noelim";
			}
		} catch (Exception ex) {

			result = ex.getMessage();
		} finally {
			try {
				st.close();
				cl.getConexion().close();
			} catch (Exception ex) {
				result = ex.getMessage();
			}
		}
		return result;

	}
	
    public void modificarPer(Persona persona) throws SQLException {

        Cls_conexion cl = new Cls_conexion();
        PreparedStatement st = cl.getConexion().prepareStatement("UPDATE persona SET clave = ? where cedula = ? ");
        st.setString(1, persona.getClave());
        st.setString(2, persona.getDoc_identidad());
        st.executeUpdate();

    }
    
    
    public Persona LeerID(Persona persona) throws Exception {

        Persona per = new Persona();
        ResultSet re;
        Cls_conexion cl = new Cls_conexion();
        re = cl.consulta("select * from persona where cedula = '" + persona.getDoc_identidad() + "'");

        while (re.next()) {

            per.setDoc_identidad(re.getString("doc_identidad"));
            per.setClave(re.getString("clave"));
            per.setCorreo_electronico(re.getString("correo_electronico"));
        }
        return per;
    }
    */
    
 /*   public ArrayList<Persona> FindAllCedulas() throws SQLException {
		ArrayList<Persona> persona = new ArrayList<>();

		ResultSet re;
		Cls_conexion cl = new Cls_conexion();
		re = cl.consulta("select cedula,clave from persona");
		
		String doc_identidad;
		
		
		while (re.next()) {
			
			doc_identidad = re.getString(1);
			
			
			persona.add(new Persona(doc_identidad));
		}
		return persona;
	} */
    

}