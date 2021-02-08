package com.control;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.daoProvincia;
import com.modelo.Provincia;

public class ControllerProvincia {
	public ArrayList<Provincia> ImprimeProvincia() throws SQLException {
		daoProvincia daoprov;
		daoprov = new daoProvincia();
		return daoprov.FindAllProvincias();
	}
	
	public ArrayList<String> ImprimeProvincias() throws SQLException {
		daoProvincia daoprov;
		daoprov = new daoProvincia();
		return daoprov.getProvincias();
	}
}