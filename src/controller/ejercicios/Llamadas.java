package controller.ejercicios;

import java.util.Scanner;

public class Llamadas {
    public enum zona_geografica {
        AMERICA_NORTE(12),
        AMERICA_CENTRAL(15),
        AMERICA_SUR(18),
        EUROPA(19),
        ASIA(23),
        AFRICA(25),
        OCEANIA(29),
        RESTO_DEL_MUNDO(31);

        private int zona;

        private zona_geografica(int zona) {
            this.zona = zona; // se refiere al tributo de la clase y para referirse al parametro del metodo
        }

        public int getzona() {
            return zona; // para comparar el numero ingresado con la zona ya establecida

        }
    }

    public static zona_geografica geografica(int zona) {
        for (zona_geografica zona1 : zona_geografica.values()) {
            if (zona1.getzona() == zona) {
                return zona1; // retornar el valor de la zona
            }
        }
        return null; // en caso que no se encuentre la zona
    }

    public static void llama_mundo(String[] args) {
        Scanner sc = new Scanner(System.in);
        Costollamada a = new Costollamada();
        int op = 0;
        System.out.println("INDIQUE MEDIANTE LA CLAVE");
        System.out.println("--La zona geográfica en la que se encuentre el país destino de la llamada--");
        System.out.println("-AMERICA DEL NORTE 12          -AMERICA CENTRAL 15");
        System.out.println("-AMERICA DEL SUR 18            -EUROPA 19");
        System.out.println("-ASIA 23                       -AFRICA 25");
        System.out.println("-OCEANIA 29                    -RESTO DEL MUNDO 31");
        op = sc.nextInt();
        zona_geografica zona = geografica(op);
        switch (zona) {
            // se calcula el costo de llamada dependiendo de la region que escoja el usuario en el menu
            case AMERICA_NORTE:
                a.america_n(args);
                break;
            case AMERICA_CENTRAL:
                a.america_c(args);
                break;
            case AMERICA_SUR:
                a.america_s(args);
                break;
            case EUROPA:
                a.europa(args);
                break;
            case ASIA:
                a.asia(args);
                break;
            case AFRICA:
                a.africa(args);
                break;
            case OCEANIA:
                a.oceania(args);
                break;
            case RESTO_DEL_MUNDO:
                a.resto_m(args);

                break;
            default:
                System.out.println("Solo opciones en pantalla");
                break;
        }
    }

}
