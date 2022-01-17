package clasesCarlos;

public class Gestor {

	private String nombre;
	private final String telefono;
	private Double importeMax;
	
	
	public Gestor(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.importeMax = 10000.0;
	}
	
	public Gestor(String nombre, String telefono, Double importe) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.importeMax = importe;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	String getTelefono() {
		return this.telefono;
	}
	
	Double getImporteMax() {
		return this.importeMax;
	}

	@Override
	public String toString() {
		return "[nombre=" + nombre + ", telefono=" + telefono + ", importeMax=" + importeMax + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((importeMax == null) ? 0 : importeMax.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gestor other = (Gestor) obj;
		if (importeMax == null) {
			if (other.importeMax != null)
				return false;
		} else if (!importeMax.equals(other.importeMax))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		return true;
	}
	
	
	
}
