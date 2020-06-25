package com.entidades;

public class Paciente {
	private boolean sexo;
	private int edad;
	private boolean adulto;
	private ObraSocial OS;
	
	public ObraSocial getOS() {
		return OS;
	}
	public void setOS(ObraSocial oS) {
		OS = oS;
	}
	public boolean isMasculino() {
		return sexo;
	}
	public boolean isAdulto() {
		return adulto;
	}
	public void setAdulto(boolean adulto) {
		this.adulto = adulto;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
