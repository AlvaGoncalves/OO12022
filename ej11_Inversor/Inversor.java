package ar.edu.unlp.info.oo1.ej11_Inversor;

import java.util.List;

public class Inversor {
	private String nombre;
	private List<Inversion> inversiones;
	
	
	public double valorActual() {
		return inversiones.stream().mapToDouble(inversiones -> inversiones.valorActual()).sum();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Inversion> getInversiones() {
		return inversiones;
	}
	public void setInversiones(List<Inversion> inversiones) {
		this.inversiones = inversiones;
	}
	
	
	
	
}
