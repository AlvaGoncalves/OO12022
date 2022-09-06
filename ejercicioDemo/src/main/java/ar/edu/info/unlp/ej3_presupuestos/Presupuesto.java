package ar.edu.info.unlp.ej3_presupuestos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	
	private List<Item> Items = new ArrayList<Item>();
	
	public void agregarItem(Item item) {
		
	}
	
	
	public double calcularTotal() {
		double tot;
		
		
		return tot;
	}


	public String getCliente() {
		return cliente;
	}


	public Presupuesto cliente(String cliente) {
		this.cliente = cliente;
		
		return this;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
}
