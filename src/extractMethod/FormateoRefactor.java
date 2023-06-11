package extractMethod;

/*
 * -> Refactor / Extract Method
 * Crea tres métodos con buenos nombres para los tres pasos
 * que se dan a la hora de formatear el texto
 */
/**
 * 
 * @author Carolina Rodriguez DAM online
 *
 *Para el primer metodo he seleccionado el codigo de despues del primer comentario
 *click boton derecho  Refactor / Extract Method, le asgino un nombre y pulso Ok
 *
 *Asi hago con los otros 2 metodos.
 */
public class FormateoRefactor {

	public String calculaTexto(String texto) {
		String res = "";

		// Primero se eliminan todos los espacios y se ponen en mayúsculas
		res = eliminaEspaciosPonMayus(texto);

		// Después se eliminan las vocales
		res = eliminaVocales(res);

		// Finalmente se eliminan todos los caracteres no alfabéticos
		return eliminaCaracterNumerico(res);
	}

	private String eliminaCaracterNumerico(String res) {
		String txt3 = "";
		for (int i = 0; i < res.length(); i++) {
			if (Character.isAlphabetic(res.charAt(i))) {
				txt3 += res.charAt(i);
			}
		}
		res = txt3;

		return res;
	}

	private String eliminaVocales(String res) {
		String txt2 = "";
		for (int i = 0; i < res.length(); i++) {
			if (!"AEIOU".contains(String.valueOf(res.charAt(i)))) {
				txt2 += res.charAt(i);
			}
		}
		res = txt2;
		return res;
	}

	private String eliminaEspaciosPonMayus(String texto) {
		String res;
		String txt1 = "";
		txt1 = texto.replace(" ", "");
		res = txt1.toUpperCase();
		return res;
	}
}