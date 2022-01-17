package clasesCarlos;

import java.util.ArrayList;
import java.util.Objects;

public class CuentaCorriente {
	
	private Gestor gestor;
	private String dni;
	private String nombre;
	private Double saldo;
	
	public CuentaCorriente(String dni, Double saldo) {
		this(dni," ",saldo);
	}
	
	public CuentaCorriente(String dni, String nombre, Double saldoInicial) {
		this(dni,nombre);
		this.saldo=saldoInicial;
	}
	
	
	public CuentaCorriente(String dni, String nombre) {
		this.dni=dni;
		this.nombre=nombre;
		this.saldo=0.0;
	}
	
	/**
	 * devuelve verdadero en caso de ser correcto el ingreso 
	 * o falso en caso contrario.
	 * */
	public Boolean ingresar(double dinero) {
		if(dinero<=0) {
			return false;
		}else {
			this.saldo = this.saldo +dinero;
			return true;
		}
	}
	
	public Boolean retirarDinero(double dinero) {
		if(dinero<0 || dinero > this.saldo) {
			return false;
		}else {
			this.saldo = this.saldo - dinero;
			return true;
		}
	}
	
	
	
	public Gestor getGestor() {
		return gestor;
	}

	public void setGestor(Gestor gestor) {
		this.gestor = gestor;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void mostrarInformacion() {
		System.out.println("----------------------");
		System.out.println("dni: "+this.dni);
		System.out.println("nombre: "+this.nombre);
		System.out.println("saldo: "+this.saldo);
		System.out.println("gestor: "+this.gestor);
		System.out.println("----------------------");

	}

	@Override
	public String toString() {
		return "CuentaCorriente [dni=" + dni + ", nombre=" + nombre + ", saldo=" + saldo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre, saldo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaCorriente other = (CuentaCorriente) obj;
		return Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(saldo, other.saldo);
	}
	
}
