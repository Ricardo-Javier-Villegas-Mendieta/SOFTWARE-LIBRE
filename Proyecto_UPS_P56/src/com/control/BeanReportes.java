package com.control;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.PieChartModel;

import com.dao.daoReportes;
import com.modelo.DataReport;

@Named(value = "beanReportes")
@SessionScoped

public class BeanReportes implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int contador;
	private String datos;
	private int fechain;
	private int fechafin;
	private String provincia;
	private PieChartModel torta;
	private BarChartModel barra;
	private DataReport datosreportes = new DataReport();
	private List<DataReport> lista;
	private List<DataReport> lista2;
	private LineChartModel lineModel2;

	public BeanReportes() {
		//listar();

	}
/*
	@PostConstruct
	public void init() {
		createLineModels();
		graficar();
	}
*/
 /*	public void listar() {
		DaoReportes dao;
		try {
			dao = new DaoReportes();
			lista = dao.pruebaPxAnio();
		} catch (Exception e) {
			e.printStackTrace();

		}

	} */
/*
	public void graficar() {
		daoReportes dao;
		try {
			dao = new daoReportes();
			lista = dao.pruebaPxAnio();
		} catch (Exception e) {
			e.printStackTrace();

		}
		torta = new PieChartModel();
		barra = new BarChartModel();
		for (DatosReportes dr : lista) {
			torta.set(dr.getDatos(), dr.getContador());
		}

		torta.setTitle("Nacimientos por Provincia desde el año 1950 al 2000");
		torta.setLegendPosition("e");
		torta.setFill(true);
		torta.setShowDataLabels(true);
		torta.setDiameter(300);
	}

	private LineChartModel initCategoryModel() {
		LineChartModel model = new LineChartModel();
		daoReportes dao;
		try {
			dao = new daoReportes();
			lista = dao.prxrural();
			lista2 = dao.prxurbano();
		} catch (Exception e) {
			e.printStackTrace();
		}

		ChartSeries urban = new ChartSeries();
		urban.setLabel("Urbano");
		for (DataReport dr : lista2) {
			urban.set(dr.getDatos(), dr.getContador());
		}

		ChartSeries rur = new ChartSeries();
		rur.setLabel("Rural");
		for (DataReport dr : lista) {
			rur.set(dr.getDatos(), dr.getContador());
		}
		model.addSeries(urban);
		model.addSeries(rur);

		return model;
	}
*//*
	private void createLineModels() {
		lineModel2 = initCategoryModel();
		lineModel2.setTitle("Provincias Vs Área");
		lineModel2.setLegendPosition("e");
		lineModel2.setShowPointLabels(true);
		lineModel2.getAxes().put(AxisType.X, new CategoryAxis("Provincias"));
		Axis yAxis = lineModel2.getAxis(AxisType.Y);
		yAxis.setLabel("Área");
		yAxis.setMin(0);
		yAxis.setMax(16500);

	}
*/
	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public List<DataReport> getLista() {
		return lista;
	}

	public void setLista(List<DataReport> lista) {
		this.lista = lista;
	}

	public List<DataReport> getLista2() {
		return lista2;
	}

	public void setLista2(List<DataReport> lista2) {
		this.lista2 = lista2;
	}

	public PieChartModel getTorta() {
		return torta;
	}

	public void setTorta(PieChartModel torta) {
		this.torta = torta;
	}

	public BarChartModel getBarra() {
		return barra;
	}

	public void setBarra(BarChartModel barra) {
		this.barra = barra;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public String getDatos() {
		return datos;
	}

	public void setDatos(String datos) {
		this.datos = datos;
	}

	public int getFechain() {
		return fechain;
	}

	public void setFechain(int fechain) {
		this.fechain = fechain;
	}

	public int getFechafin() {
		return fechafin;
	}

	public void setFechafin(int fechafin) {
		this.fechafin = fechafin;
	}

	public DataReport getDatosreportes() {
		return datosreportes;
	}

	public void setDatosreportes(DataReport datosreportes) {
		this.datosreportes = datosreportes;
	}

	public LineChartModel getLineModel2() {
		return lineModel2;
	}

	public void setLineModel2(LineChartModel lineModel2) {
		this.lineModel2 = lineModel2;
	}
}