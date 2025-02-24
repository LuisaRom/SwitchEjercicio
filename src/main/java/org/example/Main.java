package org.example;


// SWITCH CASE ANTIGUO
public class Main {
    public static void main(String[] args) {

        int dia = 3;
        String nombreDia;

        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Día no válido";
        }

        System.out.println("El día es: " + nombreDia);
    }
}

// switch (dia) es la expresion que sera comparada en cada instancia case
// si el nombre del dia dado coincide con case entonces se ejecuta la declaracion de switch
// si se olvida el break, el script se ejecutará desde donde se cumple
// la condición y ejecutará el siguiente case independientemente si esta condición se cumple o no.

