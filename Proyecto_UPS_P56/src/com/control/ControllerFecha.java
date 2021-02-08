package com.control;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.daoFecha;
import com.modelo.Fecha;

public class ControllerFecha {
	public ArrayList<Fecha> ImprimeFechas() throws SQLException {
		daoFecha daofecha;
		daofecha = new daoFecha();
		return daofecha.FindAllFechas();
	}
	
	public ArrayList<String> ImprimeMeses() throws SQLException {
		daoFecha daofecha;
		daofecha = new daoFecha();
		return daofecha.getMeses();
	}
	
	public ArrayList<String> ImprimeAnios() throws SQLException {
		daoFecha daofecha;
		daofecha = new daoFecha();
		return daofecha.getYears();
	}
}