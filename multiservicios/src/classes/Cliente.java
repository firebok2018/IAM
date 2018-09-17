package classes;

public class Cliente {
	private String nombre;
	private String placa;

	public Cliente(String nombre, String placa) {
		this.nombre= nombre;
		this.placa=placa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
}
