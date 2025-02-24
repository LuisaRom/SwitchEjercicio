

//SWITCH NUEVO


    public static void main(String[] args) {
        int dia = 3;

        String nombreDia = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Día no válido";
        };

        System.out.println("El día es: " + nombreDia);
    }


//Usa -> en lugar de : para asignaciones directas.
//No necesita break, ya que solo se ejecuta un caso.













