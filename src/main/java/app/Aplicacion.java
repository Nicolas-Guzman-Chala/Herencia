package app;

import model.Cuenta;
import model.CuentaAhorros;
import model.CuentaCorriente;

import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear cuentas de ejemplo
        Cuenta cuentaAhorros = new CuentaAhorros(0, 0, 0, 0.02f, 0, true);
        Cuenta cuentaCorriente = new CuentaCorriente(0, 0, 0, 0.02f, 0, 0);

        boolean salir = false;

        while (!salir) {
            System.out.println("\n===== MENU BANCO =====");
            System.out.println("1. Consignar en cuenta de ahorros");
            System.out.println("2. Retirar de cuenta de ahorros");
            System.out.println("3. Ver cuenta de ahorros");
            System.out.println("4. Consignar en cuenta corriente");
            System.out.println("5. Retirar de cuenta corriente");
            System.out.println("6. Ver cuenta corriente");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    float nuevoSaldo = cuentaAhorros.consignarCuenta();
                    System.out.println("Nuevo saldo cuenta de ahorros: " + nuevoSaldo);
                }
                case 2 -> {
                    float nuevoSaldo = cuentaAhorros.retirarCuenta();
                    System.out.println("Nuevo saldo cuenta de ahorros: " + nuevoSaldo);
                }
                case 3 -> System.out.println(cuentaAhorros);
                case 4 -> {
                    float nuevoSaldo = cuentaCorriente.consignarCuenta();
                    System.out.println("Nuevo saldo cuenta corriente: " + nuevoSaldo);
                }
                case 5 -> {
                    float nuevoSaldo = cuentaCorriente.retirarCuenta();
                    System.out.println("Nuevo saldo cuenta corriente: " + nuevoSaldo);
                }
                case 6 -> System.out.println(cuentaCorriente);
                case 7 -> {
                    salir = true;
                    System.out.println("Saliendo del sistema...");
                }
                default -> System.out.println("Opción inválida.");
            }
        }

        sc.close();
    }
}
