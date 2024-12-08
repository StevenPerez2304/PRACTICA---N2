package controller.ejercicios;

import java.util.Scanner;

public class Costollamada {
    // cada metodo se dedcia a calcular el costo de llamada dependiendo de la zona geografica
    public static void america_n(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciono AMERICA DEL NORTE---CLAVE 12");
        System.out.println("VALOR POR MINUTO $ 2.75");
        System.out.println("Ingrese el numero de minutos hablados");
        int min = sc.nextInt();
        System.out.println("El costo de la llamada es " + (min * 2.75));
    }

    public static void america_c(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciono AMERICA CENTRAL---CLAVE 15");
        System.out.println("VALOR POR MINUTO $ 1.89");
        System.out.println("Ingrese el numero de minutos hablados");
        int min = sc.nextInt();
        System.out.println("El costo de la llamada es " + (min * 1.89));
    }

    public static void america_s(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciono AMERICA DEL SUR---CLAVE 18");
        System.out.println("VALOR POR MINUTO $ 1.60");
        System.out.println("Ingrese el numero de minutos hablados");
        int min = sc.nextInt();
        System.out.println("El costo de la llamada es " + (min * 1.60));
    }

    public static void europa(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciono EUROPA---CLAVE 19");
        System.out.println("VALOR POR MINUTO $ 3.50");
        System.out.println("Ingrese el numero de minutos hablados");
        int min = sc.nextInt();
        System.out.println("El costo de la llamada es " + (min * 3.50));
    }

    public static void asia(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciono ASIA---CLAVE 23");
        System.out.println("VALOR POR MINUTO $ 4.50");
        System.out.println("Ingrese el numero de minutos hablados");
        int min = sc.nextInt();
        System.out.println("El costo de la llamada es " + (min * 4.50));
    }

    public static void africa(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciono AFRICA---CLAVE 25");
        System.out.println("VALOR POR MINUTO $ 3.10");
        System.out.println("Ingrese el numero de minutos hablados");
        int min = sc.nextInt();
        System.out.println("El costo de la llamada es " + (min * 3.10));
    }

    public static void oceania(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciono OCEANIA---CLAVE 29");
        System.out.println("VALOR POR MINUTO $ 3.00");
        System.out.println("Ingrese el numero de minutos hablados");
        int min = sc.nextInt();
        System.out.println("El costo de la llamada es " + (min * 3.00));
    }

    public static void resto_m(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciono RESTO DEL MUNDO ---CLAVE 31");
        System.out.println("VALOR POR MINUTO $ 6.00");
        System.out.println("Ingrese el numero de minutos hablados");
        int min = sc.nextInt();
        System.out.println("El costo de la llamada es " + (min * 6.00));
    }

}
