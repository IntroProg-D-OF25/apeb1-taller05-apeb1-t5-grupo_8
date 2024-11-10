import java.util.Scanner;

/***
 * Ordenamiento de Tres Números: Dados tres números, ordenarlos en orden ascendente.
 * @author PATO PC
 */
public class Ejercicio9_OrdenamientoNumeros {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner teclado = new Scanner(System.in);
        System.out.print("INGRESA UN NUMERO: ");
        n1 = teclado.nextInt();
        System.out.print("INGRESA UN NUMERO: ");
        n2 = teclado.nextInt();
        System.out.print("INGRESA UN NUMERO: ");
        n3 = teclado.nextInt();
        if (n1 > n2)
        {
            n1 = n1 + n2;
            n2 = n1 - n2;
            n1 = n1 - n2;
        }
        if (n1 > n3)
        {
            n1 = n1 + n3;
            n3 = n1 - n3;
            n1 = n1 - n3;
        }
        if (n2 > n3)
        {
            n2 = n2 + n3;
            n3 = n2 - n3;
            n2 = n2 - n3;
        }
        
        System.out.println("los números ordenados en orden ascendente son: " + n1 + "," + n2 + "," + n3);
        
    }
    
}

/***
 * INGRESA UN NUMERO: 23
 * INGRESA UN NUMERO: 65
 * INGRESA UN NUMERO: 21
 * los números ordenados en orden ascendente son: 21,23,65
 */