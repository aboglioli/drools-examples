package com.entidades;

public class Base {
	
	public static final int INDEFINIDO = 1;
	public static final int TUNUYAN = 2;
	public static final int PASIVA = 3;
	public static final int VISTA_FLORES = 4;
	public static final int TUPUNGATO = 5;
	public static final int SAN_JOSE = 6;
	public static final int E_BUSTOS = 7;
	public static final int PAREDITAS = 8;
	public static final int SAN_JOSE_2 = 9;
	public static final int LA_CONSULTA = 10;
	public static final int NO_ESPECIFICA = 11;

	private int codigo;
	private String base;
	
	public Base() {
		super();
	}

	public Base(int codigo, String base) {
		super();
		this.codigo = codigo;
		this.base = base;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getBase() {
		return base;
	}
	
	public void setBase(String base) {
		this.base = base;
	}
	
	@Override
	public String toString() {
		return "Codigo [codigo="+ codigo + ", Base=" + base + "]";
	}
	
}
