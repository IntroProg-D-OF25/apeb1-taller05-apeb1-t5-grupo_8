/**
 *Calculo de impuestos: Desarrollar una solución que permita leer los datos de un automóvil
 * (marca, origen y costo) imprima el impuesto por pagar y el precio de venta (incluido el impuesto)
 * Si el origen es Alemania el impuesto es 20%, si es de Japón el impuesto es 30%, si es de Italia, 
 * 15%, y si es de USA, 8%
 * @author Raul Andino
 */
import java.util.Scanner;
public class Ejercicio12_Calculo_de_mpuestos {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costo,impuesto = 0, precioVenta;
        System.out.print("Ingrese la marca del automóvil: ");
        String marca = tcl.nextLine();
        System.out.print("Ingrese el origen del automóvil (Alemania, Japón, Italia, USA): ");
        String origen = tcl.nextLine();
        System.out.print("Ingrese el costo del automóvil: ");
        costo = tcl.nextDouble();
        switch (origen) {
            case "Alemania":
                impuesto = costo * 0.20; 
                break;
            case "Japón":
                impuesto = costo * 0.30; 
                break;
            case "Italia":
                impuesto = costo * 0.15; 
                break;
            case "USA":
                impuesto = costo * 0.08; 
                break;
            default:
                System.out.println("Origen no reconocido. No se calculará impuesto.");
                return; 
        }
        precioVenta = costo + impuesto;
        System.out.printf("Impuesto por pagar: ", impuesto);
        System.out.printf("Precio de venta (incluido el impuesto): ", precioVenta);
    }
}
/***
 * USA
 * Ingrese la marca del automóvil: camaro zl1
 * Ingrese el origen del automóvil (Alemania, Japón, Italia, USA): USA
 * Ingrese el costo del automóvil: 15000
 * Impuesto por pagar: 1200,00
 * Precio de venta (incluido el impuesto): 16200,00
 * *******************************************************************
 * ITALIA
 * Ingrese la marca del automóvil: camaro zl1
 * Ingrese el origen del automóvil (Alemania, Japón, Italia, USA): Italia
 * Ingrese el costo del automóvil: 15000
 * Impuesto por pagar: 2250,00
 * Precio de venta (incluido el impuesto): 17250,00
 * *******************************************************************
 * JAPÓN
 * Ingrese la marca del automóvil: camaro zl1
 * Ingrese el origen del automóvil (Alemania, Japón, Italia, USA): Japón
 * Ingrese el costo del automóvil: 15000
 * Impuesto por pagar: 4500,00
 * Precio de venta (incluido el impuesto): 19500,00
 * *******************************************************************
 * Alemania
 * Ingrese la marca del automóvil: camaro zl1
 * Ingrese el origen del automóvil (Alemania, Japón, Italia, USA): Alemania
 * Ingrese el costo del automóvil: 15000
 * Impuesto por pagar: 3000,00
 * Precio de venta (incluido el impuesto): 18000,00
 */
