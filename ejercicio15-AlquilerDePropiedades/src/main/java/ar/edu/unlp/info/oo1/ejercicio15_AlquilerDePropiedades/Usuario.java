package ar.edu.unlp.info.oo1.ejercicio15_AlquilerDePropiedades;

import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Usuario{
	private String nombre;
	private String direc;
	private int dni;
	private List<Propiedad> propEnAlquiler = null;

	public Usuario(String nombre, String direc, int dni){
		this.setDni(dni);
		this.setNombre(nombre);
		this.setDirec(direc);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirec() {
		return direc;
	}

	public void setDirec(String direc) {
		this.direc = direc;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

}
