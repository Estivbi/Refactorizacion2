package encapsulate;

/*
 *->  Refactor / Encapsulate Field
 * Los atributos nombre y nota deben ser privados
 * El método mayorIgual5 debe ser privado
 * Luego ejecuta el Test JUnit para comprobar que es correcto 
 */
/**
 * 
 * @author Carolina Rodriguez DAM online
 *
 *Primero selecciono el atributo nombre, click boton derecho Refactor / Encapsulate Field
 *dejo seleccionados los getter y setter, pulso OK y vemos como cambia a private. Lo mismo con Nota.
 *
 *para comvertir el metodo mayorIgual5 a private, click boton derecho refactor -> Changed Method Signature
 *y obersvamos con ha cambiado a private
 *
 * ejecutamos el test con Junit
 */
public class AlumnoRefactor {
	private String nombre;
	private int nota;

	public AlumnoRefactor(String nombre, int nota) {
		this.setNombre(nombre);
		this.setNota(nota);
	}

	public boolean estaAprobado() {
		return mayorIgual5();
	}

	private boolean mayorIgual5() {
		return getNota() >= 5;
	}

	/**
	 * @return the nombre
	 */
	String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the nota
	 */
	int getNota() {
		return nota;
	}

	/**
	 * @param nota the nota to set
	 */
	void setNota(int nota) {
		this.nota = nota;
	}
}
