package model;

import java.util.Scanner;

public class CuentaCorriente extends Cuenta {

    protected int sobregiro = 0;
    public CuentaCorriente(float saldo, int numeroConsignaciones, int numeroRetiros, float tasaAnual,float comisionMensual, int sobregiro){
        super(saldo, numeroConsignaciones, numeroRetiros, tasaAnual, comisionMensual);
        this.sobregiro = sobregiro;
    }

    @Override
    public float retirarCuenta() {
            Scanner sc = new Scanner((System.in));
            System.out.println("Cuanto quieres retirar: ");
            int retirar = sc.nextInt();
            float resultado = 0;

            if(saldo - retirar < 0){
                resultado = retirar - saldo;
                sobregiro = (int) resultado;
                saldo = 0;
            }
            return saldo;
    }

    @Override
    public float consignarCuenta() {
            Scanner sc = new Scanner((System.in));
            System.out.println("Cuanto quieres consignar: ");
            int agregar = sc.nextInt();
            int resultado = 0;

            saldo = (saldo + agregar) - sobregiro;
            if(sobregiro - agregar < 0){
                sobregiro = sobregiro - agregar;
            }else{
                sobregiro = 0;
            }

            return saldo;
    }

    @Override
    public float interesMensual() {
        return 0;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "sobregiro=" + sobregiro +
                ", saldo=" + saldo +
                ", numeroConsignaciones=" + numeroConsignaciones +
                ", numerosRetiros=" + numerosRetiros +
                ", tasaAnual=" + tasaAnual +
                '}';
    }
}
