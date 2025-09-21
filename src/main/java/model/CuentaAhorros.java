package model;

import java.util.Scanner;

public class CuentaAhorros extends Cuenta{

    protected boolean cuentaActiva;

    public CuentaAhorros(float saldo, int numeroConsignaciones, int numeroRetiros, float tasaAnual,float comisionMensual, boolean cuentaActiva){
        super(saldo, numeroConsignaciones, numeroRetiros, tasaAnual, comisionMensual);
        this.cuentaActiva = cuentaActiva;
    }

    @Override
    public float consignarCuenta() {
        if(cuentaActiva){
            Scanner sc = new Scanner((System.in));
            System.out.println("Cuanto quieres consignar: ");
            int agregar = sc.nextInt();
            int resultado = 0;

            saldo = saldo + agregar;
            return saldo;
        }else{
            return 0;
        }
    }

    @Override
    public float retirarCuenta() {
        if(cuentaActiva){
            Scanner sc = new Scanner((System.in));
            System.out.println("Cuanto quieres retirar: ");
            int retirar = sc.nextInt();
            int resultado = 0;
            float sumarPlata = interesMensual();

            if (saldo >= retirar){
                saldo = saldo - retirar - sumarPlata;
                numerosRetiros += 1;
            }
        }else {
            return 0;
        }


        return saldo;
    }

    @Override
    public float interesMensual() {

        if(cuentaActiva == true){
            if(numerosRetiros >= 4){
                comisionMensual += 1000;
            }
        }else {
            comisionMensual = 0;
        }
        return comisionMensual;
    }

    @Override
    public String toString() {
        return "CuentaAhorros{" +
                "cuentaActiva=" + cuentaActiva +
                ", saldo=" + saldo +
                ", transacciones realizadas=" + (numeroConsignaciones + numerosRetiros) +
                ", comisionMensual=" + comisionMensual +
                '}';
    }
}
