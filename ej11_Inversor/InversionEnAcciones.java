package ar.edu.unlp.info.oo1.ej11_Inversor;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class InversionEnAcciones implements Inversion {
	private String nombre;
	private int cantidad;
	private double valorUnitario;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	@Override
	public double valorActual() {
		return cantidad * valorUnitario;
	}
	
	
	
}