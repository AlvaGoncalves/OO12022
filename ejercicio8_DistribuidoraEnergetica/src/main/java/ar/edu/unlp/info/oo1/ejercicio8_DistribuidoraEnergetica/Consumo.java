package ar.edu.unlp.info.oo1.ejercicio8_DistribuidoraEnergetica;

import java.util.Date;

public class Consumo {
	private Date fecha;
	private double consumoEnergiaActiva;
	private double consumoEnergiaReactiva;
	
	
	public double costoEnBaseA(double precioKWh) {
		return precioKWh * this.consumoEnergiaActiva;
	}
	
	public double factorDePotencia() {
		return this.consumoEnergiaActiva / (Math.sqrt(Math.pow(this.consumoEnergiaActiva, 2) + Math.pow(this.consumoEnergiaReactiva, 2)));
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
