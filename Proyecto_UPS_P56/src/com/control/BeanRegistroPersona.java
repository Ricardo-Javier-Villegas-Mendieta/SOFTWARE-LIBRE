package com.control;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.conexion.conexion;
import com.modelo.Persona;

@Named(value = "beanRegistroPersona")
@SessionScoped

public class BeanRegistroPersona implements Serializable {

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
    private String a;
    private String n_perfil;
	private Persona persona = new Persona();

	public BeanRegistroPersona() {

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

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	public String getA() {
		return a;
	}

	public String setA(String a) {
		return this.a = a;
	}

	public String getN_perfil() {
		return n_perfil;
	}

	public void setN_perfil(String n_perfil) {
		this.n_perfil = n_perfil;
	}

	public String almaceneDatosPersona() throws SQLException {
		int perfil = 2;
		ControllerPersona controller = new ControllerPersona();

		String respuesta = controller.enviaDatoEstudiante(id_usuario, correo, clave, nombre, apellido, cedula, perfil, n_perfil);

		return respuesta;
	}

	public String almacenarPersona() {
		int perfil = 2;
		ControllerPersona controller = new ControllerPersona();
		String respuesta = controller.agregarPersona(id_usuario, correo, clave, nombre, apellido, cedula, perfil);
		clear();
		return respuesta;
	}

	public String addPersona() {
		int perfil = 2;
		String r2 = "";
		ControllerPersona controller = new ControllerPersona();
		String respuesta = controller.agregarPersona(id_usuario, correo, clave, nombre, apellido, cedula, perfil);
		clear();
		if (respuesta == "RegCor")
			r2 = "AddCor";
		return r2;
	}

	public void clear() {
		setCorreo(null);
		setClave(null);
		setNombre(null);
		setApellido(null);
		setCedula(null);

	}// end clear`
	
	public void clearLogin() {
		setCorreo(null);
		setClave(null);
	}
	
	

	public ArrayList<Persona> listaPersona() throws SQLException {
		ControllerPersona controller = new ControllerPersona();
		return controller.ImprimePersona();
	}
	
	/*public ArrayList<Persona> listaCedula() throws SQLException {
		ControllerPersona controller = new ControllerPersona();
		return controller.ImprimeCedula();
	}
	*/
	

	public String irEdicion() {
		return "editar_user";
	}

	public String irMenu() {
		return "menuadmin";
	}

	public String irLogin() {
		return "login";
	}

	public String irRegistro() {
		return "volReg";
	}
/*
    public void EliminarDatosPersona(Persona persona) throws SQLException{
        
    	ControllerPersona controller = new ControllerPersona();
        controller.eliminarPersona(persona);
       
    }

	public void ModificaDatosPersona() throws SQLException {

		ControllerPersona controller = new ControllerPersona();
		controller.modificarPersona(persona);

	}
	
	public String leerId(Persona persona) throws Exception {
	      
		ControllerPersona controller = new ControllerPersona();
        Persona per;
        
        per = controller.leerIDPersona(persona);
        
        if (per != null) {
            this.persona = per;
        }
        return "editar_user";
    }
	*/
	public String ingresoAlSistema() throws SQLException {
		ControllerPersona controller = new ControllerPersona();

        int valor = controller.login(correo, clave);

        if (valor != 0) {
        	        	
            if (valor == 1) {
            	clearLogin();
                return "administrador.xhtml";           

            }

            if (valor == 2) {
            	clearLogin();
                return "user.xhtml";
            }

            
        } else {
        	clearLogin();
            return "no";
        }
        clearLogin();
        return "no";
    }

	public String eliminacion(String id) {
		String result = "";
		PreparedStatement st = null;
		conexion cl = new conexion();
		try {
			st = cl.getConexion().prepareStatement("delete from usuario where cedula = ? ");
			st.setString(1, id);
			if (st.executeUpdate() == 1) {
				result = "";
			} else {
				result = "";
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
	
	public String go(String id) {
		a=setA(id);
		return "ncontra.jsf";
	}
	
	public String cambio() {
		String result = "";
		conexion cl = new conexion();
		PreparedStatement pr = null;
		String sql = "UPDATE usuario SET clave = ? where cedula = ? ";
		try {
			pr = cl.getConexion().prepareStatement(sql);
			pr.setString(1, clave);
			pr.setString(2, a);
			if (pr.executeUpdate() == 1) {
				result = "usuarios.jsf";
			} else {
				result = "usuarios.jsf";
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
}
