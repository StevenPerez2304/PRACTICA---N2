package views;

import java.util.Scanner;

import controller.ejercicios.Agua;
import controller.ejercicios.Comisionsueldo;
import controller.ejercicios.Llamadas;
import controller.ejercicios.Secuencia;
import controller.ejercicios.Sueldo;

public class practica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sueldo a = new Sueldo();
        Llamadas b = new Llamadas();
        Agua c = new Agua();
        Secuencia d = new Secuencia();
        Comisionsueldo e = new Comisionsueldo();
        Sueldo f = new Sueldo();
        String confirmacion = "";
        int op = 0;
        // menu para acceder a los ejercicios utilizando el switch
        // se utiliza do while para ejecutar el codigo de manera indefinida
        do {
            System.out.println("\n" + "1 SUELDOS");
            System.out.println("2 LLAMADAS");
            System.out.println("3 SERVICIO DE AGUA");
            System.out.println("4 SECUENCIA");
            System.out.println("5 SALIR");
            op = sc.nextInt();
            switch (op) {
                // se establece un switch para cada caso del empeledo
                case 1:
                    System.out.println("¿El empleado vendio algun vehiculo por encima de los 10.000,00?");
                    confirmacion = sc.next();
                    confirmacion = confirmacion.toUpperCase();
                    switch (confirmacion) {
                        case "SI":
                            e.sueldo_comision(args); // si el empleado se le debe renumerar la comision
                            break;
                        case "NO":
                            f.sueldo_normal(args); // no se le debe renumerar comsion
        
                            break;
                        default:
                            System.out.println("Respuesta no valida");
                            break;
                    }
                    break;
                case 2:
                    b.llama_mundo(args);
                    break;
                case 3:
                    c.servicio_agua(args);

                    break;
                case 4:
                    d.Secuencia(args);

                    break;
                case 5:
                    // se crea este caso para presentar el mensaje de manera correcta que salio del
                    // programa
                    break;
                default:
                    System.out.println("Solo opciones en pantalla");
                    break;
            }
        } while (op != 5);
        {
            System.out.println("Gracias por usar :)");
        }
        sc.close();

    }

}
