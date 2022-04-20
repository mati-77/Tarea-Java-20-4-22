package ar.unla.pb2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testBanco {
	@Test
	public void testQueSePuedaAgregarUnaCuentaAlBanco() {
		String nombreBanco = "Rio";
		
		Banco banco = new Banco(nombreBanco);
		
		Integer idCuenta = 1;
		Double  saldoInicial = 1000.0;
		Integer idCliente = 1;
		String nombre ="German";
		
		Cliente cliente = new Cliente(idCliente ,nombre );
		
		Cuenta cuenta = new Cuenta(idCuenta ,cliente ,saldoInicial );
		
		banco.agregarCuenta(cuenta);
		
		Integer valorEsperado = 1;
		Integer valorObtenido = banco.obtenerCantidadDeCuentas();
		assertEquals(valorEsperado,valorObtenido);				
	}
	@Test
	public void testQueSePuedaEncontrarUnbaCuentaPorIdEnUnBanco() {
		String nombreBanco = "Rio";
		
		Banco banco = new Banco(nombreBanco);
		
		Integer idCuenta = 1;
		Double  saldoInicial = 1000.0;
		Integer idCliente = 1;
		String nombre ="German";
		
		Cliente cliente = new Cliente(idCliente ,nombre );
		Cuenta cuenta = new Cuenta(idCuenta ,cliente ,saldoInicial );
		Cuenta cuenta1 = new Cuenta(idCuenta ,cliente ,saldoInicial );
		banco.agregarCuenta(cuenta);
		Cuenta cuentaEncontrada= banco.buscarCuentaPorId(idCuenta);
		assertEquals(cuentaEncontrada,cuenta);
	}
	
	@Test
	public void testQueSePuedaExtraerSaldo() {
		String nombreBanco = "Rio";
		
		Banco banco = new Banco(nombreBanco);
		
		Integer idCuenta = 1;
		Double  saldoInicial = 1000.0;
		Integer idCliente = 1;
		String nombre ="German";
		
		Cliente cliente = new Cliente(idCliente ,nombre );
		Cuenta cuenta = new Cuenta(idCuenta ,cliente ,saldoInicial );
		
		Double saldoARestar = 300.0;
		Double saldoEsperado = 700.0;
		
		Boolean sePudoExtraer = cuenta.sePuedeExtraerSaldo(saldoARestar);
		Double saldoConsultaPostExtraccion = cuenta.getSaldoInicial();
		
		assertEquals(sePudoExtraer, true);
		assertEquals(saldoConsultaPostExtraccion, saldoEsperado);
	}
	
	@Test
	public void testQueSePuedaDepositarSaldo() {
		String nombreBanco = "Rio";
		
		Banco banco = new Banco(nombreBanco);
		
		Integer idCuenta = 1;
		Double  saldoInicial = 1000.0;
		Integer idCliente = 1;
		String nombre ="German";
		
		Cliente cliente = new Cliente(idCliente ,nombre );
		Cuenta cuenta = new Cuenta(idCuenta ,cliente ,saldoInicial );
		
		Double saldoADepositar = 500.0;
		Double saldoEsperado = 1500.0;
		
		cuenta.depositarSaldo(saldoADepositar);
		
		Double consultaSaldo = cuenta.getSaldoInicial();
		
		assertEquals(consultaSaldo, saldoEsperado);
	}
	
	@Test
	public void testQueNoSePuedaExtraerMasDeLoQueHay() {
		String nombreBanco = "Rio";
		
		Banco banco = new Banco(nombreBanco);
		
		Integer idCuenta = 1;
		Double  saldoInicial = 1000.0;
		Integer idCliente = 1;
		String nombre ="German";
		
		Cliente cliente = new Cliente(idCliente ,nombre );
		Cuenta cuenta = new Cuenta(idCuenta ,cliente ,saldoInicial );
		
		Double saldoARestar = 1100.0;
		Boolean consultaExtraccionEsperada = false;
		
		Boolean sePudoExtraer = cuenta.sePuedeExtraerSaldo(saldoARestar);
		
		assertEquals(sePudoExtraer, consultaExtraccionEsperada);
	}
	
	@Test
	public void testQueSePuedaHacerUnaTransferencia() {
		String nombreBanco = "Rio";
		
		Banco banco = new Banco(nombreBanco);
		
		Integer idCuenta = 1;
		Double  saldoInicial = 1000.0;
		Integer idCliente = 1;
		String nombre ="German";
		
		Cliente cliente = new Cliente(idCliente ,nombre );
		Cuenta cuenta1 = new Cuenta(idCuenta ,cliente ,saldoInicial );
		Cuenta cuenta2 = new Cuenta(idCuenta ,cliente ,saldoInicial );
		Double montoATransferir = 500.0;
		
		Boolean sePudoTransferir = banco.transferencia(cuenta1, cuenta2, montoATransferir);
		
		Boolean sePudoEncontrarRegistro = banco.buscarSiHayTransferenciaPorId(cuenta1.getIdCuenta());
		
		assertEquals(sePudoTransferir, true);
		assertEquals(sePudoEncontrarRegistro, true);
		
	}
}
