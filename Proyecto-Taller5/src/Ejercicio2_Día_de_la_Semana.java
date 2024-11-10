
import java.util.Scanner;

/* Día de la Semana: Mostrar el nombre del día de la semana 
 * en función del número ingresado (1 para lunes, 2 para martes, etc.).
 * @author Raul Andino
 */
public class Ejercicio2_Día_de_la_Semana {
    public static void main(String[] args) {
        int numerodia;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Dame un numero del dia");
        numerodia = tcl.nextInt();
        //Estructura de control multiple
         switch (numerodia)
         {//Incio del "segundo dia"
                case 1: System.out.println("Lunes");
                        break;
                case 2: System.out.println("Martes");
                        break;
                case 3: System.out.println("Miercoles");
                        break;
                case 4: System.out.println("Jueves");
                        break;
                case 5: System.out.println("Viernes");
                        break;
                case 6: System.out.println("Sabado");
                        break;
                case 7: System.out.println("Domingo");
                        break;
                default : System.out.println("numero error");
    }
}
}