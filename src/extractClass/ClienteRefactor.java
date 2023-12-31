package extractClass;

import java.util.Date;

public class ClienteRefactor {
	private String nombre;
	private String dni;
	private tarjetaCredito data = new tarjetaCredito();

	public ClienteRefactor(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}

	public boolean estaCaducada() {
		return data.getFechaTarjetaCredito().before(new Date());
	}

	public boolean esValidoDni() {
		boolean result = true;
		for (char c : dni.toCharArray()) {
			if (!Character.isDigit(c)) {
				result = false;
			}
		}
		return result;
	}

	public String getName() {
		return nombre;
	}

	public void setName(String name) {
		this.nombre = name;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCreditCard() {
		return data.getTarjetaCredito();
	}

	public void setCreditCard(String creditCard) {
		this.data.setTarjetaCredito(creditCard);
	}

	public Date getCreditCardDate() {
		return data.getFechaTarjetaCredito();
	}

	public void setCreditCardDate(Date creditCardDate) {
		this.data.setFechaTarjetaCredito(creditCardDate);
	}

	public int getCreditCardControlNumber() {
		return data.getNumeroControTarjetaCredito();
	}

	public void setCreditCardControlNumber(int creditCardControlNumber) {
		this.data.setNumeroControTarjetaCredito(creditCardControlNumber);
	}

}