package explainingVariable;
/**
 * 
 * @author Carolina Rodriguez DAM online
 *
 *Primero selecciono edad >= 18 && edad <= 65, click boton derecho Refactor -> Extract local variable
 *le doy un nombre y pulso OK.
 *
 *Lo mismo para la segunda parte: (salario - (salario * 0.5f)) < 1200f
 *
 *Y lo mismo para la última parte: cantidadTotal * 0.5 < 500
 *
 *Luego ejecutamos el test con Junit
 */

class ClienteRefactor {
	private int edad;
	private float salario;

	public ClienteRefactor(int edad, float salario) {
		this.edad = edad;
		this.salario = salario;
	}

	public float calculaDescuento(float cantidadTotal) {
		boolean condicionEdad = edad >= 18 && edad <= 65;
		boolean condicionSalario = (salario - (salario * 0.5f)) < 1200f;
		boolean condicionTotal = cantidadTotal * 0.5 < 500;
		if (condicionEdad && condicionSalario && condicionTotal) {
			return cantidadTotal * 0.9f;
		} else {
			return cantidadTotal;
		}
	}

}
