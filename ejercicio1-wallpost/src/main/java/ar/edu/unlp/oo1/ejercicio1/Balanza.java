package ar.edu.unlp.oo1.ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	ArrayList<Producto> productos = new ArrayList<>(); 
	
	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.pesoTotal = 0;
		this.precioTotal = 0;
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
		this.pesoTotal += producto.getPeso();
		this.cantidadDeProductos++;
		this.precioTotal += producto.getPrecio();
	}
	
	public Ticket emitirTicket() {
		Ticket t = new Ticket();
		
		t.setCantidadDeProductos(cantidadDeProductos);
		t.setPesoTotal(pesoTotal);
		t.setPrecioTotal(precioTotal);
		t.setFecha(LocalDate.now()); 
		
		return t; 
	}
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	public double getPesoTotal() {
		return pesoTotal;
	}
	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	
	
	

}
