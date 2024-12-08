package views;

import java.util.Scanner;

import controller.ejercicios.Preguntas;

public class ensayo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Preguntas a = new Preguntas();
        int op = 0;
        do {
            System.out.println("\n" + "ESCOJA UNA OPCION");
            System.out.println("1. PREGUNTA 2 DE ENSAYO ");
            System.out.println("2. PREGUNTA 3 DE ENSAYO ");
            System.out.println("3. PREGUNTA 7 DE ENSAYO ");
            System.out.println("4. PREGUNTA 8 DE ENSAYO ");
            System.out.println("5. Salir ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    a.pregunta2(args);
                    break;
                case 2:
                    a.pregunta3(args);
                    break;
                case 3:
                    a.pregunta7(args);
                    break;
                case 4:
                    a.pregunta8(args);
                    break;
                case 5:
                    // se crea este caso para presentar el mensaje de manera correcta que salio del
                    // programa
                    break;
                default:
                    System.out.println("solo opciones en pantalla");
                    break;
            }
        } while (op != 5);
        {
            System.out.println("GRACIAS POR USAR :)");
        }

    }
}
