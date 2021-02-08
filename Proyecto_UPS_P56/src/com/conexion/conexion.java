package com.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.rowset.CachedRowSet;
import com.sun.rowset.CachedRowSetImpl;

public class conexion {
	private Connection con;
	private Statement St;
	private ResultSet rs;
	private String driver;
	private String user;
	private String pwd;
	private String cadena;


	public String getDriver()
	{
		return this.driver;
	}
	String getUser()
	{
		return this.user;
	}
	String getPwd()
	{
		return this.pwd;
	}
	String getCadena()
	{
		return this.cadena;
	}
	public Connection getConexion()
	{ 
		return this.con; 
	}

	public conexion() {

		this.driver ="org.postgresql.Driver";
		this.user="postgres";
		this.pwd="1753107000";
		this.cadena="jdbc:postgresql://localhost:5433/pro_comercio";
		this.con=this.crearConexion();

	}

	Connection crearConexion(){
		try {
			Class.forName("org.postgresql.Driver");
		}
		catch (ClassNotFoundException e) {

		}

		try{
			Class.forName(getDriver()).newInstance();
			Connection con = DriverManager.getConnection(getCadena(),getUser(),getPwd());
			return con;
		}
		catch(Exception ee)
		{
			System.out.println("Error: " + ee.getMessage());
			return null;
		}
	}


	public String ejecutar(String sql)
	{
		String error="";
		try
		{
			St=(Statement) getConexion().createStatement();
			St.execute(sql);
			error="Datos insertados";
		}
		catch(Exception ex)
		{
			error = ex.getMessage();
		}
		return(error);
	}



	public ResultSet consulta(String sql)
	{
		String error="";
		ResultSet reg=null;

		try
		{
			St=(Statement) getConexion().createStatement();
			reg=St.executeQuery(sql);


		}
		catch(Exception ee)
		{
			error = ee.getMessage();
		}
		return(reg);


	}
	public void cerrarConexion() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}