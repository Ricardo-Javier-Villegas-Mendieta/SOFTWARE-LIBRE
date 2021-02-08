package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.model.SelectItem;

import com.conexion.conexion;
import com.modelo.Provincia;

public class daoProvincia {
	public ArrayList<Provincia> FindAllProvincias() throws SQLException {
		ArrayList<Provincia> pr = new ArrayList<>();

		ResultSet re;
		conexion cl = new conexion();
		re = cl.consulta("select * from dim_provincia;");
		int sk_provincia;
		String pk_provincia;
		Date valido_desde;
		Date valido_hasta;
		int version;
		while (re.next()) {
			sk_provincia = re.getInt(1);
			pk_provincia = re.getString(2);
			valido_desde = re.getDate(3);
			valido_hasta = re.getDate(4);
			version = re.getInt(5);
			pr.add(new Provincia(sk_provincia,pk_provincia,valido_desde,valido_hasta,version));
		}
		return pr;
	}
	
	public ArrayList<String> getProvincias()	{
		ArrayList<String> lista_provincias = new ArrayList<>();
		conexion cl = new conexion();
		try {
			ResultSet re;
			re = cl.consulta("select * from dim_provincia;");
			
			while (re.next()) {
				
				lista_provincias.add(re.getString(2));
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
		return lista_provincias;
	}
	
	public List<SelectItem> obtenerProvincias()	{
		conexion cl = new conexion();
		List<SelectItem> lista=new ArrayList<>();
		lista.add(new SelectItem(null, "Seleccione"));
		try {
			ResultSet re;
			re = cl.consulta("select * from dim_provincia;");
			
			while (re.next()) {
				lista.add(new SelectItem(re.getString(2),re.getString(2)));
			}
			lista.add(new SelectItem(11, "TODOS LAS PROVINCIAS"));
			
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