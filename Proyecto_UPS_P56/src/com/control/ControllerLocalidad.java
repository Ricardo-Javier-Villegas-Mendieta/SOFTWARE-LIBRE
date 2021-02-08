package com.control;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.daoLocalidad;
import com.modelo.Localidad;

public class ControllerLocalidad {
	public ArrayList<Localidad> ImprimeLocalidad() throws SQLException {
		daoLocalidad daoloc;
		daoloc = new daoLocalidad();
		return daoloc.FindAllLocalidad();
	}
	
	public ArrayList<String> ImprimeLocalidades() throws SQLException {
		daoLocalidad daoloc;
		daoloc = new daoLocalidad();
		return daoloc.getLocalidad();
	}
}