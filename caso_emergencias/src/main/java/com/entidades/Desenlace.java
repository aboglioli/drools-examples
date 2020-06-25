package com.entidades;

public class Desenlace {

	public static final int RECHAZA_EL_TRASLADO_RECHAZA = 1;
	public static final int RECHAZA_LA_INTERNACION_RECHAZA = 2;
	public static final int QUEDA_EN_DOMICILIO_CON_INSTRUCCIONES= 3;
	public static final int QUEDA_SALA_DE_GUARDIA= 4;
	public static final int INTERNADO_EN_SALA_GENERAL= 5;
	public static final int INTERNADO_EN_UTI_QUEDA = 6;
	public static final int FALLECIDO_EN_DOMICILIO = 7;
	public static final int FALLECIDO_EN_TRASLADO = 8;
	public static final int FALLECIDO_EN_NOSOCOMIO = 9;
	public static final int FALLECIDO_ANTES_DE_LA_LLEGADA_DEL_EQUIPO_DE_EMERGENCIA = 10;
	public static final int RETIRADO_POR_OTROS_MEDIOS= 11;
	public static final int FALSO_LLAMADO = 12;
	public static final int NO_REGISTRA = 13;
	
	private int codigo;
	private String desenlace;
	private String tipo;
	
	public Desenlace(int codigo, String desenlace, String tipo) {
		super();
		this.codigo = codigo;
		this.desenlace = desenlace;
		this.tipo = tipo;
	}
		
	public Desenlace() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getDesenlace() {
		return desenlace;
	}
	
	public void setDesenlace(String desenlace) {
		this.desenlace = desenlace;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Codigo [codigo="+ codigo + ", Desenlace=" + desenlace + "]";
	}
	

}
