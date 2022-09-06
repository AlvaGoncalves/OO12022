package ar.edu.info.unlp.ej3_presupuestos;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	
	public double costo() {
		return cantidad * costoUnitario;
	}

	public double getCostoUnitario() {
		return costoUnitario;
	}
	
	public Item costoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
		
		return this;
	}

	public Item cantidad(int cantidad) {
		this.cantidad = cantidad;
		return this;
	}
	
	public Item detalle(String detalle) {
		this.detalle = detalle;
		
		return this;
	}

	public String getDetalle() {
		return detalle;
	}
}
