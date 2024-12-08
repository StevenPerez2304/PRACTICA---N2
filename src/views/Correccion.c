#include <stdio.h>
enum semana_laboral
{
    LUNES = 0,
    MARTES = 1,
    MIERCOLES = 2,
    JUEVES = 3,
    VIERNES = 4
};
int main()
{
    int dia = 1;
    printf("Ingrese el numero de dias a presentar \n");
    scanf("%d", &dia);
    for (int i = LUNES; i <= VIERNES; i++)
    {
        printf("El dia de la semana es: %d\n", i+1);
        if ((i % 2) != 0)
        {
            printf("Hoy es un gran dia para Teoria de la Programacion \n", dia);
        }
        if (dia == i)
        {
            break;
        }
    }
}