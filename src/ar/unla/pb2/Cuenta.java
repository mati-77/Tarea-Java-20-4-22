package ar.unla.pb2;

import java.util.Objects;

public class Cuenta {

	private Cliente cliente;
	private Integer idCuenta;
	private Double saldoInicial;

	public Cuenta(Integer idCuenta, Cliente cliente, Double saldoInicial) {
		// TODO Auto-generated constructor stub
		this.idCuenta = idCuenta;
		this.cliente = cliente;
		this.saldoInicial = saldoInicial;
	
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Integer getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(Integer idCuenta) {
		this.idCuenta = idCuenta;
	}

	public Double getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(Double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCuenta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta other = (Cuenta) obj;
		return Objects.equals(idCuenta, other.idCuenta);
	}

	public Boolean sePuedeExtraerSaldo(Double saldoARestar) {
		// TODO Auto-generated method stub
		if(saldoInicial - saldoARestar >= 0) {
			saldoInicial -= saldoARestar;
			return true;
		} else {
			return false;
		}
	}

	public void depositarSaldo(Double saldoADepositar) {
		// TODO Auto-generated method stub
		saldoInicial += saldoADepositar;
	}
	
	

}
