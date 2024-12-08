package controller.ejercicios;

import java.util.Scanner;

public class Sueldo {
    public static void sueldo_normal(String[] args) {
        //METODO PARA IMPRIMIR EL SUELDO DEL EMPLEADO SIN COMISION
        Scanner sc = new Scanner(System.in);
        final float sueldo = 2500;
        float result = 0.0f, pago_final = 0.0f, comision1 = 0.0f, util = 0.0f;
        int i = 0;
        System.out.println("Cuantos autos vendio");
        int n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            System.out.println("INGRESE EL VALOR DEL VEHICULO " + i);
            float x = sc.nextFloat();
            result = result + x; //acumula el valor de venta del auto
        }
        util = result * 0.05f;// calucla la utilidad
        pago_final = sueldo + comision1; // suma todo lo ingresado para cancelar
        System.out.println("------------INFORME DE SUELDOS-------------");
        System.out.println("El numero total de autos vendidos es " + (i - 1));
        System.out.println("El valor total de  autos vendidos es " + result);
        System.out.println("El VALOR FINAL a pagar es " + pago_final);
        System.out.println("----El sueldo mensual es " + sueldo);
        System.out.println("----La comision a cancelar es " + comision1);
        System.out.println("----La utilidad es " + util);
        }

    }


