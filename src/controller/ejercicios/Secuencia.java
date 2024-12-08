package controller.ejercicios;

import java.util.Scanner;

public class Secuencia {
    public static void Secuencia(String[] args) {
        //imprimir una serie de numeros
        Scanner sc = new Scanner(System.in);
        int x, numero, y;
        int f = 1, t1 = 0, t2;
        // Solicitar al usuario la cantidad de términos
        System.out.println("Ingrese los números a generar:");
        numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {
            t2 = f; 
            f = t1 + f;
            t1 = t2; // se genera la serie fibonachi
            x = (2 * i + 1); // se genera el numero impar
            y = 2 * (i + 1); // se genera el numero par

            // Alternar los signos
            if (i % 4 == 0 || i % 4 == 1) { 
                System.out.print("+(" + t1 + "/" + x + ")^" + y + " ");
            } else { 
                System.out.print("-(" + t1 + "/" + x + ")^" + y + " ");
            }
        }
    }
}
