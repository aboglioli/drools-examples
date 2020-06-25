package com.entidades;

public class Zona {
	
	
	private int codigo;
	private String nombre;
	
	public Zona() {
		super();
	}

	public Zona(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}  
	
	

	
}
