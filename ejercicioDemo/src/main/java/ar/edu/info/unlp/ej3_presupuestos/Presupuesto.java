package ar.edu.info.unlp.ej3_presupuestos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	
	private List<Item> Items = new ArrayList<Item>();
	
	public void agregarItem(Item item) {
		Items.add(item);
	}
	
	
	public double calcularTotal() {
		double tot = 0;
		int i = 1;
		while(!Items.isEmpty()) {
			tot += Items.get(i).costo();
			i++;
		}
		
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
