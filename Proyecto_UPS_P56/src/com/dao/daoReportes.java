package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.conexion.conexion;
import com.modelo.DataReport;


public class daoReportes {
	public List<DataReport>mesxanq(String grafi) {
		String sql = "SELECT COUNT(SK_PROVINCIA) as cantidad,SK_SECTOR AS SECTOR_COMERCIAL FROM DIM_EMPRESA where sk_provincia='"+grafi+"' GROUP BY SECTOR_COMERCIAL ORDER BY sk_sector;";
		ResultSet rs = null;
		List<DataReport> datos = new ArrayList<DataReport>();
		conexion con = new conexion();
		try {
			rs = con.consulta(sql);
			while (rs.next()) {
				DataReport dr= new DataReport();
				dr.setContador(rs.getInt(1));
				dr.setDatos(rs.getString(2));

				datos.add(dr);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			con.cerrarConexion();
		}
		return datos;
	}
	
	public List<DataReport>mesxan() {
		String sql = "SELECT COUNT(SK_PROVINCIA) as cantidad,SK_SECTOR AS SECTOR_COMERCIAL FROM DIM_EMPRESA GROUP BY SECTOR_COMERCIAL ORDER BY sk_sector;";
		ResultSet rs = null;
		List<DataReport> datos = new ArrayList<DataReport>();
		conexion con = new conexion();
		try {
			rs = con.consulta(sql);
			while (rs.next()) {
				DataReport dr= new DataReport();
				dr.setContador(rs.getInt(1));
				dr.setDatos(rs.getString(2));

				datos.add(dr);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			con.cerrarConexion();
		}
		return datos;
	}
	
	public List<DataReport>pas() {
		String sql = "select sk_provincia,count(nombre_empresa)from dim_empresa  where sk_sector='Supermercado' group by sk_provincia;";
		ResultSet rs = null;
		List<DataReport> datos = new ArrayList<DataReport>();
		conexion con = new conexion();
		try {
			rs = con.consulta(sql);
			while (rs.next()) {
				DataReport dr= new DataReport();
				dr.setContador(rs.getInt(2));
				dr.setDatos(rs.getString(1));

				datos.add(dr);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			con.cerrarConexion();
		}
		return datos;
	}
	
	public List<DataReport>barra1() {
		String sql = "SELECT SK_SECTOR AS SECTOR_COMERCIAL,COUNT(SK_PROVINCIA) "
				+ "FROM DIM_EMPRESA "
				+ "where  SK_SECTOR='Alimentación en general' OR "
				+ "SK_SECTOR='Artículos de papelería' OR SK_SECTOR='Frutas y hortalizas' "
				+ "OR SK_SECTOR='Supermercado' AND PAG_WEB IS NOT NULL GROUP BY SECTOR_COMERCIAL;";
		ResultSet rs = null;
		List<DataReport> datos = new ArrayList<DataReport>();
		conexion con = new conexion();
		try {
			rs = con.consulta(sql);
			while (rs.next()) {
				DataReport dr= new DataReport();
				dr.setContador(rs.getInt(2));
				dr.setDatos(rs.getString(1));

				datos.add(dr);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			con.cerrarConexion();
		}
		return datos;
	}
}