package ar.unla.pb2;

public class RegistroTransferencia {
	private Integer idCuentaOrigen;
	private Integer idCuentaDestino;
	private Double saldo;
	
	public RegistroTransferencia(Integer idCuentaOrigen, Integer idCuentaDestino, Double saldo) {
		this.idCuentaOrigen = idCuentaOrigen;
		this.idCuentaDestino = idCuentaDestino;
		this.saldo = saldo;
	}

	public Integer getIdTransferenciaCuentaOrigen() {
		// TODO Auto-generated method stub
		return idCuentaOrigen;
	}
}
