package org.generation.util.banco;

import java.util.Date;

public class CuentaCredito extends Cuenta {
	private double limite;
	private double tasa;
	private Date fechaCorte;

public CuentaCredito(double saldo, String numeroCliente, Date fechaCorte, 
			Date fechaApertura, double tasa, double limite, String nombreCliente) {
		super(saldo, numeroCliente, fechaApertura, nombreCliente);
		this.fechaCorte = fechaCorte;
		this.tasa = tasa;
		this.limite = limite;
	}//constructorCuentaCredito

	public double getLimite() { return limite; }
	public void setLimite(double limite) { this.limite = limite; }
	public double getTasa() { return tasa; }
	public void setTasa(double tasa) { this.tasa = tasa; }
	public Date getFechaCorte() { return fechaCorte; }
	public void setFechaCorte(Date fechaCorte) { this.fechaCorte = fechaCorte; }

	@Override
	public double getSaldo() {
		this.saldo += 3;
		return this.saldo;
	}//getSaldo

	@Override
	public double retiro(double cantidad) {
		if ((this.limite - this.saldo) >= cantidad) {
			this.saldo += (cantidad + (cantidad * 0.05)); 
		} else {
			this.saldo += 5;
		}
		return this.saldo;
	}//metodoRetiro

	@Override
	public double deposito(double cantidad) {
		if (cantidad > 0) {
			this.saldo -= cantidad;
		}
		return this.saldo;
	}//metodoDeposito

	@Override
	public String toString() {
		return "Cuenta Crédito [" + super.toString() +
				" Tasa=" + getTasa() + "%, Límite="
				+ getLimite() + "]";
	}//toString
}//classCuentaCredito