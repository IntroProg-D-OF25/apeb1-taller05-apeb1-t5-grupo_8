/**
 * Facturación eléctrica: Desarrollar una solución que permita calcular y mostrar el valor 
 * a cancelar de una planilla de luz. Se debe ingresar el valor de costo por kilovatio/hora y el número 
 * de kilovatios consumidos en el mes.Si el usuario tiene edad mayor a 65 años, se debe descontar
 * el 10% por pertenecer a la tercera edad.
 * @author Raul Andino
 */
import java.util.Scanner;
public class Ejercicio10_Facturación_eléctrica {
    public static void main(String[] args) {
        int edad;
        double costoPorKwh,kilovatiosConsumidos, totalFactura;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el costo por kilovatio/hora: ");
         costoPorKwh = tcl.nextDouble();
        System.out.print("Ingrese el número de kilovatios consumidos en el mes: ");
        kilovatiosConsumidos = tcl.nextDouble();
        System.out.print("Ingrese su edad: ");
        edad = tcl.nextInt();
        totalFactura = costoPorKwh * kilovatiosConsumidos;
        if (edad > 65) {
            totalFactura *= 0.90; 
        }
        System.out.printf("El valor a cancelar de la planilla de luz es :"+ totalFactura);
    }
    
}
/***
 * CON DESCUENTO
 * Ingrese el costo por kilovatio/hora: 1
 * Ingrese el número de kilovatios consumidos en el mes: 45
 * Ingrese su edad: 75
 * El valor a cancelar de la planilla de luz es :40.5
 * ********************************************************
 * SIN DESCUENTO
 * Ingrese el costo por kilovatio/hora: 1
 * Ingrese el número de kilovatios consumidos en el mes: 45
 * Ingrese su edad: 35
 * El valor a cancelar de la planilla de luz es :45.0
 */