package principal;

import clasesCarlos.CuentaCorriente;
import clasesCarlos.Gestor;

public class Principal {

	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente("111111", "10000.0");
		Gestor g = new Gestor("Carlos", "123456111");
		
		cc.setGestor(g);
		
		cc.getGestor().getNombre();
		
		cc.mostrarInformacion();

	}

}
