
import java.util.Scanner;

/***
 * Mayor de tres números: Dados tres números, determinar cuál es el mayor. Si son iguales, mostrar un mensaje.
 * @author PATO
 */
public class Ejercicio3_MayorNumeros {
    public static void main(String[] args) {
        int numero1, numero2, numero3;
        Scanner teclado = new Scanner(System.in);
        System.out.print("DAME UN NUMERO: ");
        numero1 = teclado.nextInt();
        System.out.print("DAME UN NUMERO: ");
        numero2 = teclado.nextInt();
        System.out.print("DAME UN NUMERO: ");
        numero3 = teclado.nextInt();
        if ((numero1 == numero2) && (numero2 == numero3))
            System.out.println("Todos los números son iguales");
        else 
        {
            if (numero1 >= numero2)
            {
                if (numero1 >= numero3)
                {
                    System.out.println("El número mayor es: " + numero1);
                }
                else 
                {
                    System.out.println("El número mayor es: " + numero3);
                }
            }
            else
            {
                if (numero2 >= numero3)
                {
                    System.out.println("El número mayor es: " + numero2);
                }
                else 
                {
                    System.out.println("El número mayor es: " + numero3);
                }
            }
        }    
            
    }
        
    }

/***
 * DAME UN NUMERO: 8
 * DAME UN NUMERO: 8
 * DAME UN NUMERO: 8
 * Todos los números son iguales
 */
