package controller.ejercicios;

public class Gastoagua {
    public static float gasto_agua(float num) {
        float resul = 0.0f;
        // calcula el consumo del agua dependendiendo de cuanto consumio
        if (num < 15) {
            resul = 3.00f;
        } else if (num > 15 && num < 25) {
            resul = (((num - 15.00f) * 0.10f)) + 3.00f;
        } else if (num > 25 && num < 40) {
            resul = ((num - 25.00f) * 0.20f) + 4.00f;
        } else if (num > 40 && num < 60) {
            resul = (((num - 40) * 0.30f) + 7.00f);
        } else if (num > 60) {
            resul = (((num - 60) * 0.35f) + 13.00f);
        }
        return resul;
    }

}
