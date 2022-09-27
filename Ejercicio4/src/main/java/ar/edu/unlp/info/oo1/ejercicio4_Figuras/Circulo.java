package ar.edu.unlp.info.oo1.ejercicio4_Figuras;

public class Circulo implements Objetos {
	private double diametro;
	private double radio;
	
	public double getDiametro() {
		return this.radio * 2;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	@Override
	public double getArea() {
		return Math.PI * Math.pow(this.radio,2);
	}
	@Override
	public double getPerimetro() {
		return 2 * Math.PI * this.radio; 
	}
}
