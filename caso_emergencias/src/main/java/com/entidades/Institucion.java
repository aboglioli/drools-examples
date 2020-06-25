package com.entidades;

public class Institucion {
	
	public static final int INDEFINIDO = 1;
	public static final int CLINICA_TUNUYAN = 2;
	public static final int CLINICA_SAN_CARLOS = 3;
	public static final int CLINICA_TUPUNGATO = 4;
	public static final int INSTITUTO_MEDICO_VALLE_DE_UCO_TUNUYAN = 5;
	public static final int HOSPITAL_CENTRAL = 6;
	public static final int HOSPITAL_NOTTI = 7;
	public static final int HOSPITAL_LAGOMAGGIORE = 8;
	public static final int HOSPITAL_EL_SAUCE = 9;
	public static final int HOSPITAL_CARLOS_PEREYRA = 10;
	public static final int CTRO_SALUD_COLONIA_LAS_ROSAS = 11;
	public static final int CTRO_SALUD_VENEZUELA = 12;
	public static final int CTRO_SALUD_PUENTE_DEL_RIO = 13;
	public static final int CTRO_SALUD_LOS_ARBOLES = 14;
	public static final int CTRO_SALUD_VISTA_FLORES = 15;
	public static final int CTRO_SALUD_VILLA_SECA = 16;
	public static final int CTRO_SALUD_LOS_SAUCES = 17;
	public static final int CTRO_SALUD_AGUA_AMARGA = 18;
	public static final int CTRO_SALUD_URQUIZA = 19;
	public static final int CTRO_SALUD_EL_MANZANO_HIST = 20;
	public static final int CTRO_SALUD_LA_CONSULTA = 21;
	public static final int CTRO_SALUD_SAN_CARLOS_101_JOSE_MENDEZ = 22;
	public static final int CTRO_SALUD_PAREDITAS = 23;
	public static final int CTRO_SALUD_CHILECITO = 24;
	public static final int CTRO_SALUD_CORDON_DEL_PLATA = 25;
	public static final int FRESENIUS = 26;
	public static final int SANATORIO_CENTRAL = 27;
	public static final int CLINICA_LINARES = 28;
	public static final int CENTRO_EVERT = 29;
	public static final int CENTRO_ECOGRAFICO_DRA_SALATINO = 30;
	public static final int CLINICA_DE_OJOS = 31;
	public static final int INSTITUCIONES_VARIAS = 32;
	public static final int HOSPITAL_SCHESTAKOW_SAN_RAFAEL = 33;
	public static final int HOSPITAL_JOSE_LENCINAS = 34;
	public static final int HOSPITAL_ESPANOL = 35;
	public static final int CTRO_SALUD_SAN_JOSE = 36;
	public static final int NO_DERIVA = 37;
	public static final int NO_ESPECIFICO = 38;
	public static final int NO_REGISTRA = 39;

	private int codigo;
	private String institucion;
	
	public Institucion() {
		super();
	}

	public Institucion(int codigo, String institucion) {
		super();
		this.codigo = codigo;
		this.institucion = institucion;
	}

	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getInstitucion() {
		return institucion;
	}


	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}
	
	@Override
	public String toString() {
		return "Codigo [codigo="+ codigo + ", Institucion=" + institucion + "]";
	}

}
