package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import com.conexion.conexion;
import com.modelo.Auditoria;

public class daoAuditoria {
	
	public ArrayList<Auditoria> FindAllAuditoria() throws SQLException {
		ArrayList<Auditoria> ad = new ArrayList<>();
		ResultSet re;
		conexion cl = new conexion();
		re = cl.consulta("select * from auditoria.tb_auditoria where id_aud > 7");
		int id_aud;
		String tabla_aud;
		String operacion_aud;
		String valoranterior_aud;
		String valornuevo_aud;
		Date fecha_aud;
		String usuario_aud;
		String esquema_aud;
		boolean activar_aud;
		boolean trigger_aud;
		while (re.next()) {
			id_aud = re.getInt(1);
			tabla_aud = re.getString(2);
			operacion_aud = re.getString(3);
			valoranterior_aud = re.getString(4);
			valornuevo_aud = re.getString(5);
			fecha_aud = re.getDate(6);
			usuario_aud = re.getString(7);
			esquema_aud = re.getString(8);
			activar_aud = re.getBoolean(9);
			trigger_aud = re.getBoolean(10);
			ad.add(new Auditoria(id_aud, tabla_aud, operacion_aud, valoranterior_aud, valornuevo_aud,fecha_aud,usuario_aud,
					esquema_aud, activar_aud, trigger_aud));
		}
		return ad;
	}
	

}
