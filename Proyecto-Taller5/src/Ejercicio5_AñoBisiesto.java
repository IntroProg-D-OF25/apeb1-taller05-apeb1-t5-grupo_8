
import java.util.Scanner;

/***
 * Año Bisiesto: Comprobar si un año ingresado es bisiesto o no. Si es bisiesto, mostrar un mensaje especial.
 * @author PATO
 */
public class Ejercicio5_AñoBisiesto {
    public static void main(String[] args) {
        int year;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa un año: ");
        year = teclado.nextInt();
        if ((year % 4 ==0 && year % 100 !=0) || (year % 400 ==0)){
            System.out.println("El año si es bisiesto");
        }
        else 
        {
            System.out.println("El año no es bisiesto");
        }
        
    }
}
/***
 * Ingresa un año: 2024
 * El año si es bisiesto
 */