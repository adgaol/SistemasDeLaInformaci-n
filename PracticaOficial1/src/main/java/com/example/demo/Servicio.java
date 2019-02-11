package com.example.demo;

public class Servicio {



		private String nombre;
		private String descripción;
		private String categoria;
		private int duración;
		private int precio;

		public Servicio() {
		}

		public Servicio(String nombre, String descripción, String categoria, int duración, int precio) {
			super();
			this.nombre = nombre;
			this.descripción = descripción;
			this.categoria = categoria;
			this.duración = duración;
			this.precio = precio;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getDescripción() {
			return descripción;
		}

		public void setDescripción(String descripción) {
			this.descripción = descripción;
		}

		public String getCategoria() {
			return categoria;
		}

		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}

		public int getDuración() {
			return duración;
		}

		public void setDuración(int duración) {
			this.duración = duración;
		}

		public int getPrecio() {
			return precio;
		}

		public void setPrecio(int precio) {
			this.precio = precio;
		}

		
}
