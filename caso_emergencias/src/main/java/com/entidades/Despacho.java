package com.entidades;

public class Despacho {
	
	    private Tiempo id_fecha;
	    private Zona id_zona;
	    private Codigo id_codigo;
	    private Movil id_movil;
	    private Base id_base;
	    private Institucion id_institucion;
	    private Desenlace id_desenlace;
	    private int cantidad;
	    private int prioridad;
	    private float importeZona;
	    private Paciente paciente;
		private float descuento;
	    	    
		public Despacho() {
			super();
		}

		public Despacho(Tiempo id_fecha, Zona id_zona, Codigo id_codigo, Movil id_movil, Base id_base,
				Institucion id_institucion, Desenlace id_desenlace, int cantidad) {
			super();
			this.id_fecha = id_fecha;
			this.id_zona = id_zona;
			this.id_codigo = id_codigo;
			this.id_movil = id_movil;
			this.id_base = id_base;
			this.id_institucion = id_institucion;
			this.id_desenlace = id_desenlace;
			this.cantidad = cantidad;
		}

		public Despacho(Zona id_zona, Codigo id_codigo, Movil id_movil, Base id_base, Institucion id_institucion,
				Desenlace id_desenlace, int cantidad) {
			super();
			this.id_zona = id_zona;
			this.id_codigo = id_codigo;
			this.id_movil = id_movil;
			this.id_base = id_base;
			this.id_institucion = id_institucion;
			this.id_desenlace = id_desenlace;
			this.cantidad = cantidad;
		}

		public Despacho(Codigo id_codigo, Movil id_movil, Base id_base, Institucion id_institucion,
				Desenlace id_desenlace, int cantidad) {
			super();
			this.id_codigo = id_codigo;
			this.id_movil = id_movil;
			this.id_base = id_base;
			this.id_institucion = id_institucion;
			this.id_desenlace = id_desenlace;
			this.cantidad = cantidad;
		}

		public Despacho(Movil id_movil, Base id_base, Institucion id_institucion, Desenlace id_desenlace,
				int cantidad) {
			super();
			this.id_movil = id_movil;
			this.id_base = id_base;
			this.id_institucion = id_institucion;
			this.id_desenlace = id_desenlace;
			this.cantidad = cantidad;
		}

		public Despacho(Base id_base, Institucion id_institucion, Desenlace id_desenlace, int cantidad) {
			super();
			this.id_base = id_base;
			this.id_institucion = id_institucion;
			this.id_desenlace = id_desenlace;
			this.cantidad = cantidad;
		}

		public Despacho(Institucion id_institucion, Desenlace id_desenlace, int cantidad) {
			super();
			this.id_institucion = id_institucion;
			this.id_desenlace = id_desenlace;
			this.cantidad = cantidad;
		}

		public Despacho(Desenlace id_desenlace, int cantidad) {
			super();
			this.id_desenlace = id_desenlace;
			this.cantidad = cantidad;
		}

		public Despacho(int cantidad) {
			super();
			this.cantidad = cantidad;
		}

		public Despacho(Desenlace id_desenlace) {
			super();
			this.id_desenlace = id_desenlace;
		}

		public Despacho(Institucion id_institucion) {
			super();
			this.id_institucion = id_institucion;
		}

		public Despacho(Base id_base) {
			super();
			this.id_base = id_base;
		}

		public Despacho(Movil id_movil) {
			super();
			this.id_movil = id_movil;
		}

		public Despacho(Codigo id_codigo) {
			super();
			this.id_codigo = id_codigo;
		}

		public Despacho(Zona id_zona) {
			super();
			this.id_zona = id_zona;
		}

		public Despacho(Tiempo id_fecha) {
			super();
			this.id_fecha = id_fecha;
		}

		public Tiempo getId_fecha() {
			return id_fecha;
		}

		public void setId_fecha(Tiempo id_fecha) {
			this.id_fecha = id_fecha;
		}

		public Zona getId_zona() {
			return id_zona;
		}

		public void setId_zona(Zona id_zona) {
			this.id_zona = id_zona;
		}

		public Codigo getId_codigo() {
			return id_codigo;
		}

		public void setId_codigo(Codigo id_codigo) {
			this.id_codigo = id_codigo;
		}

		public Movil getId_movil() {
			return id_movil;
		}

		public void setId_movil(Movil id_movil) {
			this.id_movil = id_movil;
		}

		public Base getId_base() {
			return id_base;
		}

		public void setId_base(Base id_base) {
			this.id_base = id_base;
		}

		public Institucion getId_institucion() {
			return id_institucion;
		}

		public void setId_institucion(Institucion id_institucion) {
			this.id_institucion = id_institucion;
		}

		public Desenlace getId_desenlace() {
			return id_desenlace;
		}

		public void setId_desenlace(Desenlace id_desenlace) {
			this.id_desenlace = id_desenlace;
		}

		public int getCantidad() {
			return cantidad;
		}

		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}

		public int getPrioridad() {
			return prioridad;
		}

		public void setPrioridad(int prioridad) {
			this.prioridad = prioridad;
		}

		public float getImporteZona() {
			return importeZona;
		}

		public void setImporteZona(float importeZona) {
			this.importeZona = importeZona;
		}

		public Paciente getPaciente() {
			return paciente;
		}

		public void setPaciente(Paciente paciente) {
			this.paciente = paciente;
		}

		public float getDescuento() {
			return descuento;
		}

		public void setDescuento(float descuento) {
			this.descuento = descuento;
		}
		
		
		
		
		
		
}
