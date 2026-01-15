package org.generation.util.banco;

import java.util.Date;

public class CuentaDebito extends Cuenta{
	private double montoMinimo;

	public CuentaDebito(double saldo, String numeroCliente, Date fechaApertura, String nombreCliente,
			double montoMinimo) {
		super(saldo, numeroCliente, fechaApertura, nombreCliente);
		this.montoMinimo = montoMinimo;
	}//constructorCuentaDebito

	public double getMontoMinimo() {
		return montoMinimo;
	}//getMontoMinimo
	
	public void setMontoMinimo(double montoMinimo) {
		this.montoMinimo = montoMinimo;
	}//setMontoMinimo

	public double retiro(double cantidad) {
        if (cantidad <= this.saldo) {
            this.saldo -= cantidad;
            System.out.println("Retiro exitoso.");
        } else {
            System.out.println("Error: Saldo insuficiente para retirar " + cantidad);
        }
        return this.saldo;
    }//metodoRetiro


	public double deposito(double cantidad) {
		if(cantidad > 0) {
			this.saldo += cantidad;
		}
		return this.saldo;
	}//deposito

	public double getSaldo() {
		// TODO Auto-generated method stub
		return this.saldo;
	}//getSaldo

	public String toString() {
		return "Cuenta Débito [" + super.toString() + 
				", Monto mínimo=" + montoMinimo + "]";
	}//toString
	
}//clase cuenta debito
