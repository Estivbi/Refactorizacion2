package extractClass;

import java.util.Date;

public class tarjetaCredito {
	private String tarjetaCredito;
	private Date fechaTarjetaCredito;
	private int numeroControTarjetaCredito;

	public tarjetaCredito() {
	}

	public String getTarjetaCredito() {
		return tarjetaCredito;
	}

	public void setTarjetaCredito(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}

	public Date getFechaTarjetaCredito() {
		return fechaTarjetaCredito;
	}

	public void setFechaTarjetaCredito(Date fechaTarjetaCredito) {
		this.fechaTarjetaCredito = fechaTarjetaCredito;
	}

	public int getNumeroControTarjetaCredito() {
		return numeroControTarjetaCredito;
	}

	public void setNumeroControTarjetaCredito(int numeroControTarjetaCredito) {
		this.numeroControTarjetaCredito = numeroControTarjetaCredito;
	}
}