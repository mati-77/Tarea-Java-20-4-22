package ar.unla.pb2;

public class Cliente {

	private Integer idCliente;
	private String nombre;

	public Cliente(Integer idCliente, String nombre) {
		// TODO Auto-generated constructor stub
		this.idCliente = idCliente;
		this.nombre = nombre;
	}

	
	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
