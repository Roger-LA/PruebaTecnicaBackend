package org.generation.util.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nombre;
	private List<Cuenta> listaCuentas;
	
	
	
	public Banco(String nombre, List<Cuenta> listaCuentas) {
		this.nombre = nombre;
		this.listaCuentas = new ArrayList<>();
	}//constructorBanco
	
	public void agregarCuenta(Cuenta cuenta) {
        listaCuentas.add(cuenta);
        System.out.println("Cuenta agregada exitosamente: " + cuenta.getNumeroCuenta());
    }//addCuenta
	
	public Cuenta buscarCuenta(int numeroCuenta) {
        for (Cuenta c : listaCuentas) {
            if (c.getNumeroCuenta() == numeroCuenta) {
                return c;
            }
        }
        return null;
    }//buscarCuenta
	
	
	public boolean cancelarCuenta(int numeroCuenta) {
        Cuenta c = buscarCuenta(numeroCuenta);
        if (c != null) {
            return listaCuentas.remove(c);
        }
        return false;
    }//cancelarCuenta
	
	public double saldoDebito() {
        double total = 0;
        for (Cuenta c : listaCuentas) {
            if (c instanceof CuentaDebito) {
                total += c.getSaldo();
            }
        }
        return total;
    }//saldoDebito
	
	public double deudaCredito() {
        double totalDeuda = 0;
        for (Cuenta c : listaCuentas) {
            if (c instanceof CuentaCredito) {
                totalDeuda += c.getSaldo(); 
                }
        }
        return totalDeuda;
    }//deudaCredito
	
	public void ReporteFinanciero() {
        System.out.println("======= REPORTE BANCARIO: " + nombre + " =======");
        System.out.println("Total en Cuentas de Débito: $" + saldoDebito());
        System.out.println("Total Deuda en Cuentas de Crédito: $" + deudaCredito());
        System.out.println("================================================");
    }

}
