package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.model.SelectItem;

import com.conexion.conexion;
import com.modelo.Sector;

public class daoSector {
	public ArrayList<Sector> FindAllSector() throws SQLException {
		ArrayList<Sector> pr = new ArrayList<>();

		ResultSet re;
		conexion cl = new conexion();
		re = cl.consulta("select * from dim_sector;");
		int sk_sector;
		String pk_sector;
		Date valido_desde;
		Date valido_hasta;
		int version;
		while (re.next()) {
			sk_sector = re.getInt(1);
			pk_sector = re.getString(2);
			valido_desde = re.getDate(3);
			valido_hasta = re.getDate(4);
			version = re.getInt(5);
			pr.add(new Sector(sk_sector,pk_sector,valido_desde,valido_hasta,version));
		}
		return pr;
	}
	
	public ArrayList<String> getSector()	{
		ArrayList<String> lista_sector = new ArrayList<>();
		conexion cl = new conexion();
		try {
			ResultSet re;
			re = cl.consulta("select * from dim_sector;");
			
			while (re.next()) {
				
				lista_sector.add(re.getString(2));
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
		return lista_sector;
	}
	
	public List<SelectItem> obtenerSector()	{
		conexion cl = new conexion();
		List<SelectItem> lista=new ArrayList<>();
		lista.add(new SelectItem(null, "Seleccione"));
		try {
			ResultSet re;
			re = cl.consulta("select * from dim_sector;");
			
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