package extractLocalVariable;

/*
 * -> Refactor/Extract Local Variable
 * Crea una variable local "doble" con el valor de 2
 * Luego ejecuta el Test JUnit para comprobar que es correcto 
 */
/**
 * 
 * @author Carolina Rodriguez DAM online
 *
 *Selecciono el valor 2, click boton derecho Refactor/Extract Local Variable
 *le damos el nombre de doble y pulso OK
 */
public class DobleRefactor {
	public int calculaDoble(int valor) {
		int doble = 2;
		return doble * valor;
	}
}
