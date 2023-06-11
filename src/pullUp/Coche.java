package pullUp;

/*
 * -> Refactor/Pull up
 * Sube al vehículo el atributo matrícula y el método arrancar
 * Luego ejecuta el Test JUnit para comprobar que es correcto 
 */
/**
 * 
 * @author Carolina Rodriguez DAM online
 *
 *He seleccionado la clase vehiculo, click boton derecho Refactor/Pull up
 *selecciono atributo matricula y el metodo arrancar() pulso OK
 *ahora me voy a la clase moto
 */

public class Coche extends Vehiculo {
	private String maletero;
	private boolean abiertoMaletero;

	public boolean isTrunkOpen() {
		return abiertoMaletero;
	}
}