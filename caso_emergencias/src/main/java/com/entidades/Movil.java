package com.entidades;

public class Movil {
	
	public static final int INDEFINIDO = 1;
	public static final int TUNUYAN_100 = 2;
	public static final int TUNUYAN_101_EMERG = 3;
	public static final int VISTA_FLORES_102 = 4;
	public static final int TUPUNGATO_103 = 5;
	public static final int SAN_JOSE_104 = 6;
	public static final int EUGENIO_BUSTOS_105_EMER = 7;
	public static final int PAREDITAS_106 = 8;
	public static final int SAN_JOSE_107 = 9;
	public static final int LA_CONSULTA_108 = 10;
	public static final int TUNUYAN_999 = 11;

	private int codigo;
	private String movil;
	private int activo;
	
	public Movil(int codigo, String movil, int activo) {
		super();
		this.codigo = codigo;
		this.movil = movil;
		this.activo = activo;
	}
			
	public Movil() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMovil() {
		return movil;
	}
	public void setMovil(String movil) {
		this.movil = movil;
	}
	public int getActivo() {
		return activo;
	}
	public void setActivo(int activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Codigo [codigo="+ codigo + ", Movil=" + movil + "]";
	}
	
}
