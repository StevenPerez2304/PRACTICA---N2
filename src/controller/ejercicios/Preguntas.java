package controller.ejercicios;

import java.util.Scanner;

public class Preguntas {
    public static void pregunta2(String[] args) {
        // ejemplo de la estructura condicional MIENTRAS con CONTADORES
        Scanner sc = new Scanner(System.in);
        String palabra = "ESPEJISMO", usuario = "";
        int intentos = 0, max = 4, num = 4;
        System.out.println("ADIVINE LA PALABRA");
        while (intentos < max) { // mientras se cumpla esta condicion se ejecutara el codigo
            System.out.println("TIENE " + num + " INTENTOS"); // indica el numero de intentos que tienes
            System.out.println("PISTA: Ilusión óptica que parece real, como agua en el desierto");
            usuario = sc.next();
            intentos++; // es el contador que se va sumando desde uno a uno
            num--; // contador para marcar cuantos intentos tiene el usuario
            if (palabra.equalsIgnoreCase(usuario)) {
                System.out.println("----FELICIDADES USTED A GANADO----");
                break;// si acierta la palabre con el break se cierra de manera automatica
            } else if (intentos == max) {
                System.out.println("SE LE ACABARON LOS INTENTOS LA PALABRA ERA " + palabra);
                break; // si se cumple esta condicion quiere decir que se le acabaron los intentos en donde se cierra con un break
            } else {
                // si le quedan intentos y no acierta se le presenta que lo intente de nuevo
                System.out.println("NO ES LA PALABRA CORRECTA---Intentelo de nuevo");
            }
        }
    }

    public static void pregunta3(String[] args) {
        // ejemplo de la estructura condicional HACER … MIENTRAS (REPETIR .. MIENTRAS)
        // con BANDERAS
        Scanner sc = new Scanner(System.in);
        boolean bandera = false; // uso de la bandera para determinar true y false
        int numero;
        do {
            System.out.println("Ingrese un número para verificar si es multiplo de 2 ");
            numero = sc.nextInt();

            if (numero % 2 == 0) {
                bandera = true;
                System.out.println("El numero si es multiplo de 2");
            } else {
                System.out.println("El número no es multiplo de 2");
            }
        } while (!bandera);

    }

    public static void numero_modificado(int num) {
        // funcion para modificar el numero
        num *= 2;
        System.out.println("El numero modificado dentro de la funcion es " + num);
    }

    public static void pregunta7(String[] args) {
        // ejemplo pequeño en lenguaje de programación en JAVA donde demuestre la
        // utilización de funciones con paso de parámetros por valor
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero para demostrar el ejemplo");
        int num = sc.nextInt();
        // se presenta el numero fuera de la funcion sin modificar
        System.out.println("El numeor sin modificar es " + num);
        // se modifica el numero con la funcion
        numero_modificado(num);
        // se muestra otra ves el numero pero fuera de la funcion para demostrar el caso
        System.out.println("El numero despues de la funcion es " + num);
    }

    // se crea la una clase para modificar parametro por referencia
    static class Persona {
        String nombre;

        // se hace un constructor
        public Persona(String nombre) {
            this.nombre = nombre;
        }
    }

    // Función que modifica a la variable nombre de una persona
    public static void cambiarNombre(Persona p) {
        p.nombre = "Juan"; // Cambia el nombre de la persona de origen
    }

    public static void pregunta8(String[] args) {
        // Creamos un objeto de Persona con nombre Carlos
        Persona persona = new Persona("Carlos");
        System.out.println("Nombre antes de la función es " + persona.nombre); // Muestra "Carlos"

        // Llamada a la función que va hacer la modificacion de el nombre
        cambiarNombre(persona);

        // Se presenta el nombre ya modificado
        System.out.println("Nombre después de la función es " + persona.nombre); // Muestra "Juan"
    }
}
