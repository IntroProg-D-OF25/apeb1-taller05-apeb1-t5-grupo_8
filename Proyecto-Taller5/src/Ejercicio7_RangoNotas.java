import java.util.Scanner;

/***
 * Rango de Notas: Asignar una letra (A, B, C, D) a una calificación en función de su rango (A para 90-100, B para 80-89, etc.).
 * @author PATO PC
 */
public class Ejercicio7_RangoNotas {
    public static void main(String[] args) {
        int calificacion;
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESA UNA CALIFICACION: ");
        calificacion = teclado.nextInt();
        if ((calificacion >= 90) && (calificacion <= 100))
        {
            System.out.println("Su nota es: A");
        }
        else if ((calificacion >= 80) && (calificacion <= 89))
            System.out.println("Su nota es: B");
        else if ((calificacion >= 70) && (calificacion <= 79))
            System.out.println("Su nota es: C");
        else 
            System.out.println("Su nota es: D");
    }
    
}

/***
 * INGRESA UNA CALIFICACION: 
 * 50
 * Su nota es: D
 */
