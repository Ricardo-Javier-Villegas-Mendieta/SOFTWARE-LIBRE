package com.control;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.daoSector;
import com.modelo.Sector;

public class ControllerSector {
	public ArrayList<Sector> ImprimeSector() throws SQLException {
		daoSector daosec;
		daosec = new daoSector();
		return daosec.FindAllSector();
	}
	
	public ArrayList<String> ImprimeSectores() throws SQLException {
		daoSector daosec;
		daosec = new daoSector();
		return daosec.getSector();
	}
}