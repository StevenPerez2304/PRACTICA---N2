#include <stdio.h>
enum semana_laboral
{
    LUNES = 0, // se inicia de cero para evitar que se de un printl extra
    MARTES = 1,
    MIERCOLES = 2,
    JUEVES = 3,
    VIERNES = 4
};
int main()
{
    int dia = 1;                                        // se coloca el punto y coma
    printf("Ingrese el numero de dias a presentar \n"); // las comillas no eran las correctas
    scanf("%d", &dia);                                  // las comillas no eran las correctas
    for (int i = LUNES; i <= VIERNES; i++)              // para que se de el numero de ciclos correctos se agrega el igual en < viernes
    {
        printf("El dia de la semana es: %d\n", i + 1); // las comillas no eran las correctas y se elimino la tilde para evitar errores en la impresion
        if ((i % 2) != 0)                              // se suma i + 1 para que no tenga ningun error al momento de imprimir ya que incia de cero
        {
            printf("Hoy es un gran dia para Teoria de la Programacion \n", dia); // las comillas no eran las correctas y se borro la tilde para evitar errores en el print
        }
        if (dia == i)
        {
            break;
        }
    }
}