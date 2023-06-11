package convertLocalField;

/*
 * -> Refactor / Convert Local Variable to Field...
 * Seleccionad la variable local kilometros y convertirla en Atributo
 * Elegid la opción de inicializarla en el constructor
 */
/**
 * 
 * @author Carolina Rodriguez DAM online
 *
 *Selecciono la varibale Kilometros, click boton derecho Refactor / Convert Local Variable to Field
 *y asi se convierte a atributo
 */
public class Coche {

	private int kilometros;

	public void conducir (int distancia) {
		kilometros = 0;
		kilometros += distancia;
	}
	
}
