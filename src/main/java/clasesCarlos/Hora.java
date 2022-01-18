package clasesCarlos;

public class Hora {
	private int horas;
	private int minutos;
	private int segundos;

	public Hora(int horas, int minutos, int segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public void mostrarHora() {
		System.out.println(this.horas + ":" + this.minutos + ":" + this.segundos);
	}

	public void incrementarSegundos(int incremento) {
		this.segundos = this.segundos + incremento;
		this.ajustarHora();
	}

	public void incrementarMinutos(int incremento) {
		this.minutos = this.minutos + incremento;
		this.ajustarHora();
	}

	private void ajustarHora() {
		if (this.segundos >= 60) {
			int resto = this.segundos % 60;
			int inc = this.segundos / 60;

			this.minutos = this.minutos + inc;
			this.segundos = resto;
		}

		if (this.minutos >= 60) {
			int resto = this.minutos % 60;
			int inc = this.minutos / 60;

			this.horas = this.horas + inc;
			this.minutos = resto;
		}
	}

	public boolean esAnterior(Hora hora) {
		if (this.horas < hora.horas) {
			return true;
		} else if (this.horas > hora.horas) {
			return false;
		} else if (this.minutos < hora.minutos) {
			return true;
		} else if (this.minutos > hora.minutos) {
			return false;
		} else if (this.segundos < hora.segundos) {
			return true;
		} else {
			return false;
		}
	}

}
