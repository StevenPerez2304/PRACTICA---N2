package controller.ejercicios;

import java.util.Scanner;

public class Sueldo {
    public static void sueldo_normal(String[] args) {
        // MÉTODO PARA IMPRIMIR EL SUELDO DEL EMPLEADO SIN COMISIÓN
        Scanner sc = new Scanner(System.in);
        final float sueldo = 2500;
        float result = 0.0f, pago_final = 0.0f, comision1 = 0.0f, util = 0.0f;
        int i = 0;
        float x = 0.0f;
        String continuar = "si";
        System.out.println("Ingrese los datos de los autos vendidos");
        System.out.println("-----INFORME  DE SUELDO SIN COMISION------");
        while (continuar.equalsIgnoreCase("si")) {
            i++;
            System.out.println("\n" + "INGRESE EL VALOR DEL VEHÍCULO " + i);
            x = sc.nextFloat();
            if (x > 10000) {
                System.out.println("El auto que ingreso sobrepasa la tarifa de los 10000");
                System.out
                        .println("\n" + "Por favor ingresar este vehiculo en donde se calcula su comision respectiva");
                break;
            }
            result += x; // Acumula el valor de venta del auto
            System.out.println("¿Desea ingresar otro auto? (si/no)");
            continuar = sc.next();
        }
        if (x > 10000) {
            System.out.println("\n" + "No se puede emitir el informa por datos ingresados erroneos");
            System.out.println("\n" + "INTENTELO DE NUEVO INGRESANDO LOS DATOS CORRECTOS");
        } else {
            util = result * 0.05f; // Calcula la utilidad
            pago_final = sueldo + comision1; // Suma todo lo ingresado para el pago final
            System.out.println("------------INFORME DE SUELDOS-------------");
            System.out.println("El número total de autos vendidos es " + i);
            System.out.println("El valor total de autos vendidos es " + result);
            System.out.println("El VALOR FINAL a pagar es " + pago_final);
            System.out.println("----El sueldo mensual es " + sueldo);
            System.out.println("----La comisión a cancelar es " + comision1);
            System.out.println("----La utilidad es " + util);
        }
    }
}
