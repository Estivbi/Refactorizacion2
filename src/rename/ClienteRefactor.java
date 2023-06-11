package rename;
/*
 * -> Refactor/Rename
 * Cambia el nombre de las variables x, y, z para que indiquen
 * el area, la base y la altura del rectángulo
 * Luego ejecuta el Test JUnit para comprobar que es correcto 
 */
/**
 * 
 * @author Carolina Rodriguez DAM online
 *
 *Primero selecciono la variable X, click boton derecho Refactor/Rename
 *le llamo base.
 *
 *Despues selecciono Y, click boton derecho Refactor/Rename
 *le llamo altura.
 *
 *Por ultimo selecciono Z, click boton derecho Refactor/Rename
 *le llamo area.
 */
public class ClienteRefactor {
	public double areaFinal(double base, double altura) {
		double area = base * altura;
		return area;
	}
}