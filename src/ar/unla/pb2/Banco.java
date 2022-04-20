package ar.unla.pb2;

import java.util.ArrayList;

public class Banco {

	private String nombreBanco;
	private ArrayList<Cuenta> cuentas; // new ArrayList<>();
	private ArrayList<RegistroTransferencia> registros = new ArrayList<>();

	public Banco(String nombreBanco) {
		// TODO Auto-generated constructor stub
		this.nombreBanco = nombreBanco;
		this.cuentas = new ArrayList<>();
	}

	public void agregarCuenta(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.cuentas.add(cuenta);

	}

	public Integer obtenerCantidadDeCuentas() {
		// TODO Auto-generated method stub

		return this.cuentas.size();
	}

	public Cuenta buscarCuentaPorId(Integer idCliente) {
		
		// TODO Auto-generated method stub
		for (int i = 0; i < cuentas.size(); i++) {
			if (this.cuentas.get(i).getIdCuenta().equals(idCliente))
				return this.cuentas.get(i);
		}
		for (Cuenta cuenta : cuentas) {
			if(cuenta.getIdCuenta().equals(idCliente))
				return cuenta;
		}
		return null;
	}

	public Boolean transferencia(Cuenta cuenta1, Cuenta cuenta2, Double montoATransferir) {
		// TODO Auto-generated method stub
		if (cuenta1.sePuedeExtraerSaldo(montoATransferir) == true) {
			cuenta1.sePuedeExtraerSaldo(montoATransferir);
			cuenta2.depositarSaldo(montoATransferir);
			RegistroTransferencia registro = new RegistroTransferencia(cuenta1.getIdCuenta(), cuenta2.getIdCuenta(), montoATransferir);
			this.registros.add(registro);
			return true;
		} else {
			return false;
		}
		
	}

	public Boolean buscarSiHayTransferenciaPorId(Integer idCuenta) {
		// TODO Auto-generated method stub
		for (RegistroTransferencia reg : registros) {
			if(reg.getIdTransferenciaCuentaOrigen().equals(idCuenta)) {
				return true;
			}
		}
		return null;
	}
}
