import java.util.Scanner;

/***
 * Sistema de reservas hoteleras: En una hosteria de la ciudad de Loja se hace un descuento del 10% si el cliente se hospeda más de 5 días, del 15% 
 * si se hospeda más de 10 días y del 20% si se hospeda más de 15 días. Elaborar un solución que pida como datos de entrada
 * el número de días y el precio diario de la habitación y luego calcule e imprima el subtotal por pagar, el descuento y el total por pagar.
 * @author PATO PC
 */
public class Ejercicio13_SistemaReservasHoteleras {
    public static void main(String[] args) {
        double precio, subtotal, total, descuento;
        int ndias;
        Scanner teclado = new Scanner(System.in);
        System.out.print("INGRESE EL NÚMERO DE DIAS QUE DESEA HOSPEDARSE: ");
        ndias = teclado.nextInt();
        System.out.print("INGRESE EL PRECIO POR DÍA: ");
        precio = teclado.nextDouble();
        subtotal = ndias * precio;
        total = ndias * precio;
        if (ndias > 5)
        {
            System.out.print("Su descuento es del 10%");
            total *= 0.90;
        }
        else if (ndias > 10)
        {
            System.out.println("Su descuento es del 15%");
            total *= 0.85;
        }
        else if (ndias > 15)
        {
            System.out.println("Su descuento es del 20%");
            total *= 0.80;
        }
        else 
            System.out.println("No se aplica ningun descuento");
        
        System.out.println("El subtotal por pagar es de: " + subtotal);
        System.out.println("El total por pagar es de: " + total);
        
    }
    
}
