package controller.ejercicios;

import java.util.Scanner;

public class Comisionsueldo {
    public static void sueldo_comision(String[] args) {
        // METODO PARA CALCULAR LA COMISON POR VENTA DE AUTO
        Scanner sc = new Scanner(System.in);
        final float sueldo = 2500, comision = 250;
        float result = 0.0f, pago_final = 0.0f, comision1 = 0.0f, util = 0.0f;
        int i = 0;
        float x = 0;
        String continuar = "si";
        System.out.println("Ingrese los datos de los autos vendidos");
        System.out.println("-----INFORME DE SUELDO CON COMISION----");
        while (continuar.equalsIgnoreCase("si")) { // permite ingresar autos hasta donde desee
            i++;
            System.out.println("\n" +"INGRESE EL VALOR DEL VEHICULO " + i);
            x = sc.nextFloat();
            if (x < 10000) {
                System.out.println("No cumple con la tarifa para la comision");
                break; // en el caso de que nos ingrese un vehiculo de menor valor a 10000
            }
            result += x; // acumula el valor de venta del auto
            System.out.println("¿Desea ingresar otro auto? (si/no)");
            continuar = sc.next();
        }
        if (x < 10000) {
            System.out.println("\n" + "No se puede emitir el informe por datos ingresados erroneos");
            System.out.println("\n" + "INTENTELO DE NUEVO INGRESANDO LOS DATOS CORRECTOS");
        } else {
            comision1 = comision * i; // calcula la comision
            util = result * 0.05f;// calucla la utilidad
            pago_final = sueldo + comision1; // suma todo lo ingresado para cancelar
            System.out.println("------------INFORME DE SUELDOS-------------");
            System.out.println("El numero total de autos vendidos es " + i);
            System.out.println("El valor total de  autos vendidos es " + result);
            System.out.println("El VALOR FINAL a pagar es " + pago_final);
            System.out.println("----El sueldo mensual es " + sueldo);
            System.out.println("----La comision a cancelar es " + comision1);
            System.out.println("----La utilidad es " + util);
        }
    }
}