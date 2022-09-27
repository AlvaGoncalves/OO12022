package ar.edu.unlp.info.oo1.ejercicio4_Figuras;

public class Cuerpo3D{
	private double Altura;
	private Objetos CaraBasal;
	private double Volumen;
	private double SuperficieExterior;
	
	
	public double getAltura() {
		return Altura;
	}
	public void setAltura(double altura) {
		Altura = altura;
	}
	public double getCaraBasal() {
		return this.getCaraBasal();
	}
	public void setCaraBasal(Objetos c) {
		CaraBasal = c;
	}
	public double getVolumen() {
		return this.CaraBasal.getArea() * this.getAltura();
	}
	public void setVolumen(double volumen) {
		Volumen = volumen;
	}
	public double getSuperficieExterior() {
		return 2 * CaraBasal.getArea() + CaraBasal.getPerimetro() * this.getAltura() ;
	}
	public void setSuperficieExterior(double superficieExterior) {
		SuperficieExterior = superficieExterior;
	}
	
	
}
