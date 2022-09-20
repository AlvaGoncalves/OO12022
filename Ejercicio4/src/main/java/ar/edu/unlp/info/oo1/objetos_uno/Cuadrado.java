package ar.edu.unlp.info.oo1.objetos_uno;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Cuadrado implements Objetos{
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double getArea() {
		return Math.pow(this.lado, 2);
	}

	@Override
	public double getPerimetro() {
		return this.lado * 4;
	}
	
	
}
