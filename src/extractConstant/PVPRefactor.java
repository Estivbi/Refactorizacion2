package extractConstant;

/*
 * -> Refactor/Extract Constant
 * Crea un atributo privado y constante IVA para sustituir el valor 21
 * Luego ejecuta el Test JUnit para comprobar que es correcto 
 */
/**
 * 
 * @author Carolina Rodriguez DAM online
 *
 *Selecciono numero 21, click boton derecho Refactor/Extract Constant
 *Le ponemos el nombre deseado, lo dejamos private y pulsa OK.
 */
public class PVPRefactor {
	private static final int IVA = 21;

	public double calculaPVP(double precio) {
		double impuestos = (precio * IVA) / 100;
		return precio + impuestos;
	}
}
