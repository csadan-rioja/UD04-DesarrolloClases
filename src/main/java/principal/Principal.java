package principal;

import clasesCarlos.CuentaCorriente;
import clasesCarlos.Gestor;
import clasesCarlos.Hora;

public class Principal {

	public static void main(String[] args) {

		
		Hora h1 = new Hora(10, 20, 31);
		Hora h2 = new Hora(10, 20, 31);

		System.out.println(h1.esAnterior(h2));

	}

}
