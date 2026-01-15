package org.generation.util.banco;

import java.util.Date;

public class CuentaDebito extends Cuenta {
	private double montoMinimo;

	public CuentaDebito(double saldo, String numeroCliente, Date fechaApertura, 
			double montoMinimo, String nombreCliente) {
		super(saldo, numeroCliente, fechaApertura, nombreCliente);
		this.montoMinimo = montoMinimo;
	}//constructorCuentaDebito

	public double getMontoMinimo() {
		return montoMinimo;
	}//getMontoMinimo
	
	public void setMontoMinimo(double montoMinimo) {
		this.montoMinimo = montoMinimo;
	}//setMontoMinimo

	@Override
	public double getSaldo() {
		return this.saldo;
	}//getSaldo

	@Override
	public double retiro(double cantidad) {
		if (cantidad <= this.saldo) {
			this.saldo -= cantidad;
		} else {
			System.out.println("Saldo insuficiente");
		}
		return this.saldo;
	}//metodoRetiro

	@Override
	public double deposito(double cantidad) {
		if (cantidad > 0) {
			this.saldo += cantidad;
		}
		return this.saldo;
	}//metodoDeposito

	@Override
	public String toString() {
		return "Cuenta Débito [" + super.toString() + 
				", Monto mínimo=" + montoMinimo + "]";
	}//toString
}//classCuentaDebito
