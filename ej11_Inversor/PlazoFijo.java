package ar.edu.unlp.info.oo1.ej11_Inversor;

import java.time.LocalDate;


public class PlazoFijo  implements Inversion{
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	
	public double valorActual() {
		return montoDepositado * porcentajeDeInteresDiario;
		
	}
	
	public LocalDate getFechaDeConstitucion() {
		return fechaDeConstitucion;
	}
	public void setFechaDeConstitucion(LocalDate fechaDeConstitucion) {
		this.fechaDeConstitucion = fechaDeConstitucion;
	}
	public double getMontoDepositado() {
		return montoDepositado;
	}
	public void setMontoDepositado(double montoDepositado) {
		this.montoDepositado = montoDepositado;
	}
	public double getPorcentajeDeInteresDiario() {
		return porcentajeDeInteresDiario;
	}
	public void setPorcentajeDeInteresDiario(double porcentajeDeInteresDiario) {
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}
}
