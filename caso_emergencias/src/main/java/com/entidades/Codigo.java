package com.entidades;

public class Codigo {
    public static final int ROJO = 1;
    public static final int AMARILLO = 2;
    public static final int VERDE = 3;
    public static final int AZUL = 4;
    public static final int BLANCO = 5;
    public static final int TRASLADOS = 6;
    public static final int EVENTOS = 7;
    
    private int codigo;
    private String descripcion;
        
   	public Codigo() {
		super();
	}

	public Codigo(int codigo, String descripcion) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public Codigo(int codigo) {
		super();
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		return "Codigo [codigo="+ codigo + ", descripcion=" + descripcion + "]";
	}
    
}
