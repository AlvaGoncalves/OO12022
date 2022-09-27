package ar.edu.unlp.info.oo1.ejercicio8_DistribuidoraEnergetica;

import java.util.ArrayList;

public class Usuario {
	private String domicilio;
	private String nombre;
	private ArrayList<Factura> facturas = new ArrayList<Factura>();
	private ArrayList<Consumo> consumos = new ArrayList<Consumo>();
	
	public void agregarMedicion(Consumo medicion) {
		this.consumos.add(medicion);
	}
	
	public double ultimoConsumoActiva() {
		return consumos.stream().max()
	}
	
	public Factura facturaEnBase(double precioKWh) {
		
	}
	
	public ArrayList<Factura> facturas(){
		return this.facturas;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
