/***
 * Calculadora de IMC: Calcular el índice de masa corporal (IMC) de una persona 
 * y clasificarla en función de su valor (bajo peso, peso normal, sobrepeso, etc.).
 * Autor Raul Andino
 */
import java.util.Scanner;
public class Ejercicio8_Calculadora_de_IMC {
    public static void main(String[] args) {
        double peso, altura, imc;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese la altura : ");
        altura =tcl.nextDouble();
        System.out.print("Ingrese el peso : ");
        peso =tcl.nextDouble();
        imc = peso /(altura * altura);
        System.out.println("el total en imc es : "+ imc);
    }
}
/***
 * run-single:
 * Ingrese la altura : 1,80
 * Ingrese el peso : 60
 * el total en imc es : 18.51851851851852
 */