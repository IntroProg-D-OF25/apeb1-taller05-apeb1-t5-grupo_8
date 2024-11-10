
import java.util.Scanner;

/***
 * Categoría de Edad: Clasificar a una persona en una categoría de edad 
 * (niño, adolescente, adulto) en función de su edad.
 * Autor: Raul Andino
*/
public class Ejercicio6_Categoría_de_Edad {
    public static void main(String[] args) {
        int edad = 0;
        Scanner tcl = new Scanner(System.in);
             System.out.print("Ingrese su edad: ");
              edad = tcl.nextInt();
                if (edad < 13) {
                    System.out.println("Eres un niño.");
                } else if (edad >= 13 && edad <= 17) {
                    System.out.println("Eres un adolescente.");
                } else {
                    System.out.println("Eres un adulto.");
                }
            } 
        }
/***
 * run-single:
 * Ingrese su edad: 10
 * Eres un niño.
 * ***************************
 * run-single:
 * Ingrese su edad: 15
 * Eres un adolescente.
 * ***************************
 * run-single:
 * Ingrese su edad: 35
 * Eres un adulto.
 */