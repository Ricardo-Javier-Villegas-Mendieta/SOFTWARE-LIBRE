package com.control;

import java.sql.SQLException;
import java.util.ArrayList;
import com.dao.daoAuditoria;

public class ControllerAuditoria {
	
	public ArrayList<com.modelo.Auditoria> ImprimeTb_Auditoria() throws SQLException {
		daoAuditoria daoauditoria;
		daoauditoria= new daoAuditoria();
		return daoauditoria.FindAllAuditoria();
	}

}
