package controller.ejercicios;

import java.util.Scanner;

public class Agua {
    public static void servicio_agua(String[] args) {
        float metro = 0.0f, impuesto_alcan = 0.35f, calcu_alcan = 0.00f, tasa_basu = 0.00f, descu_tercera = 0.00f;
        float calcu_disca = 0.00f, descu_disca = 0.00f, total_cancelar = 0.00f, tasa_datos = 0.50f, total = 0.00f,
                basu_reco = 0.00f;
        String alcan = "", basu = "", edad = "", disca = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("------SERVICIO DE AGUA POTABLE------");
        System.out.println("Ingrese el consumo en metros cubicos");
        float consu = sc.nextFloat();
        metro = Gastoagua.gasto_agua(consu); // metodo del calculo de consumo
        System.out.println("¿Usted poseee alcantarillado?");
        alcan = sc.next();
        if (alcan.equalsIgnoreCase("si")) {
            calcu_alcan = metro * impuesto_alcan; // impuesto de alcantarillado
        }
        System.out.println("¿Se recolecta la basura por su zona?");
        basu = sc.next();
        if (basu.equalsIgnoreCase("si")) {
            basu_reco = 0.75f; // se establece la tasa de basura
        }
        total_cancelar = metro + calcu_alcan + basu_reco + tasa_datos;
        System.out.println("Pertenece a la tercera edad");
        edad = sc.next();
        if (edad.equalsIgnoreCase("si") && consu < 15.0f) {
            descu_tercera = total_cancelar * 0.50f;
        } else if (edad.equalsIgnoreCase("si") && consu > 15.0f) {
            descu_tercera = total_cancelar * 0.30f; // se calcula el descuento por tercera edad
        }
        System.out.println("Tiene discapacidad ");
        disca = sc.next();
        if (disca.equalsIgnoreCase("si")) {
            System.out.println("Cual es el porcentaje de discapacidad");
            float porcen_disca = sc.nextFloat();
            calcu_disca = porcen_disca / 100.00f;
            descu_disca = total_cancelar * calcu_disca; // se calcula el descuento por discapacidad
        }
        total = total_cancelar - descu_tercera - descu_disca;
        System.out.println("El valor del consumo es " + metro);
        System.out.println("-Tasa de impuesto por alcantarillado " + calcu_alcan);
        System.out.println("--Tasa por recoleccion de basura " + basu_reco);
        System.out.println("---Tasa por procesamiento de datos " + tasa_datos);
        System.out.println("----Descuento por tercera edad " + descu_tercera);
        System.out.println("-----Descuento por discapacidad " + descu_disca);
        System.out.println("-----El valor a cancelar total es " + total);

    }

}
