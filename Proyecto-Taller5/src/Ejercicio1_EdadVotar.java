
import java.util.Scanner;

/***
 * Edad para Votar: Determinar si una persona es elegible para votar en función de su edad (mayor o igual a 18 años).
 * @author PATO
 */
public class Ejercicio1_EdadVotar {
    public static void main(String[] args) {
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.print("DAME UNA EDAD: ");
        edad = teclado.nextInt();
        if (edad > 18)
            System.out.println("VOTA");
        else 
            System.out.println("NO VOTA");
        
    }
}
/***
 * 
 */