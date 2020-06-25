package com.entidades;

public class Tiempo {

	private int codigo;
	private int anio;
	private int semestre;
	private int trimestre;
	private int mes;
	private String mes_str;
	private int semana;
	private int dia;
	private String dia_str;
	
	public Tiempo(int mes) {
		super();
		this.mes = mes;
	}

	public Tiempo() {
		super();
	}

	public Tiempo(int codigo, int anio, int semestre, int trimestre, int mes, String mes_str, int semana, int dia,
			String dia_str) {
		super();
		this.codigo = codigo;
		this.anio = anio;
		this.semestre = semestre;
		this.trimestre = trimestre;
		this.mes = mes;
		this.mes_str = mes_str;
		this.semana = semana;
		this.dia = dia;
		this.dia_str = dia_str;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public int getTrimestre() {
		return trimestre;
	}

	public void setTrimestre(int trimestre) {
		this.trimestre = trimestre;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public String getMes_str() {
		return mes_str;
	}

	public void setMes_str(String mes_str) {
		this.mes_str = mes_str;
	}

	public int getSemana() {
		return semana;
	}

	public void setSemana(int semana) {
		this.semana = semana;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public String getDia_str() {
		return dia_str;
	}

	public void setDia_str(String dia_str) {
		this.dia_str = dia_str;
	}

	
	
}
