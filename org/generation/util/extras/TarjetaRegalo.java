package org.generation.util.extras;

import org.generation.util.Imprimible;

public class TarjetaRegalo implements Imprimible {
    private int accountNumber;
    private double balance;
    private String name;

    public TarjetaRegalo(int accountNumber, double balance, String name) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
    }//constructorTarjetaRegalo

    @Override
    public int getNumeroCuenta() {
        return this.accountNumber;
    }//getNumCuenta

    @Override
    public double getSaldo() {
        return this.balance;
    }//getSaldo

    @Override
    public String toString() {
        return "TarjetaRegalo [Nombre=" + name + ", No. Cuenta=" + accountNumber + ", Saldo=" + balance + "]";
    }//toString
}//classTarjetaRegalo