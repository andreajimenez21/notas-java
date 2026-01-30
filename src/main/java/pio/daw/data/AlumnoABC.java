package pio.daw.data;

import java.util.List;

/**
 * AlumnoABC
 */
public abstract class AlumnoABC {
	private String nombre;
	private List<Double> notas;

	public AlumnoABC(String nombre, List<Double> notas) {
		this.nombre = nombre;
		this.notas = notas;
	}

	public String getNombre() {
		return this.nombre;
	}

	public List<Double> getNotas() {
		return this.notas;
	}
}
