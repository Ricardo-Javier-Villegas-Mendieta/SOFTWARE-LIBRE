package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.model.SelectItem;

import com.conexion.conexion;
import com.modelo.Localidad;

public class daoLocalidad {
	public ArrayList<Localidad> FindAllLocalidad() throws SQLException {
		ArrayList<Localidad> pr = new ArrayList<>();

		ResultSet re;
		conexion cl = new conexion();
		re = cl.consulta("select * from dim_localidad;");
		int sk_localidad;
		String pk_localidad;
		Date valido_desde;
		Date valido_hasta;
		int version;
		while (re.next()) {
			sk_localidad = re.getInt(1);
			pk_localidad = re.getString(2);
			valido_desde = re.getDate(3);
			valido_hasta = re.getDate(4);
			version = re.getInt(5);
			pr.add(new Localidad(sk_localidad,pk_localidad,valido_desde,valido_hasta,version));
		}
		return pr;
	}
	
	public ArrayList<String> getLocalidad()	{
		ArrayList<String> lista_localidad = new ArrayList<>();
		conexion cl = new conexion();
		try {
			ResultSet re;
			re = cl.consulta("select * from dim_localidad;");
			
			while (re.next()) {
				
				lista_localidad.add(re.getString(2));
			}
			
		}catch(Exception e) {
			System.out.println(e);
			
		}finally {
			try {
				
				cl.getConexion().close();
			} catch (Exception ex) {
				ex.getMessage();
			}
		}
		return lista_localidad;
	}
	
	public List<SelectItem> obtenerLocalidad()	{
		conexion cl = new conexion();
		List<SelectItem> lista=new ArrayList<>();
		lista.add(new SelectItem(null, "Seleccione"));
		try {
			ResultSet re;
			re = cl.consulta("select * from dim_localidad;");
			
			while (re.next()) {
				lista.add(new SelectItem(re.getInt(1),re.getString(2)));
			}
			
			
		}catch(Exception e) {
			System.out.println(e);
			
		}finally {
			try {
				
				cl.getConexion().close();
			} catch (Exception ex) {
				ex.getMessage();
			}
		}
		return lista;
	}
}