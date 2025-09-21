package model;

import java.util.Scanner;

public abstract class Cuenta {

    protected float saldo;
    protected int numeroConsignaciones;
    protected int numerosRetiros;
    protected float tasaAnual;
    protected float comisionMensual;

    public Cuenta(float saldo, int numeroConsignaciones, int numerosRetiros, float tasaAnual, float comisionMensual){
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
        this.numeroConsignaciones = numeroConsignaciones;
        this.numerosRetiros = numerosRetiros;
        this.comisionMensual = comisionMensual;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConsignaciones() {
        return numeroConsignaciones;
    }

    public void setNumeroConsignaciones(int numeroConsignaciones) {
        this.numeroConsignaciones = numeroConsignaciones;
    }

    public int getNumerosRetiros() {
        return numerosRetiros;
    }

    public void setNumerosRetiros(int numerosRetiros) {
        this.numerosRetiros = numerosRetiros;
    }

    public float getTasaAnual() {
        return tasaAnual;
    }

    public void setTasaAnual(float tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public float getComisionMensual() {
        return comisionMensual;
    }

    public void setComisionMensual(float comisionMensual) {
        this.comisionMensual = comisionMensual;
    }


    public abstract float consignarCuenta();

    public abstract float retirarCuenta();

    public abstract float interesMensual();

    @Override
    public String toString() {
        return "Cuenta{" +
                "saldo=" + saldo +
                ", numeroConsignaciones=" + numeroConsignaciones +
                ", numerosRetiros=" + numerosRetiros +
                ", tasaAnual=" + tasaAnual +
                ", comisionMensual=" + comisionMensual +
                '}';
    }
}
