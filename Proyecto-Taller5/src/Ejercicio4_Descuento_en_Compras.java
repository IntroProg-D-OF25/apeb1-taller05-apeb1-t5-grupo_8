import java.util.Scanner;
/* Descuento en Compras: Calcular el precio final de un producto con un descuento del 10% si 
 * el precio original es mayor de $100; de lo contrario, no hay descuento.
 * @author ARaul Andino
 */
public class Ejercicio4_Descuento_en_Compras {
    public static void main(String[] args) {
        double precio_original, descuento, precio_final = 0;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el precio original del producto : ");
        precio_original =tcl.nextDouble();
        if ( precio_original > 100){
            descuento = precio_original * 0.10;
            precio_final = precio_original - descuento;
            System.out.print("Se aplica un descuento del 10% : "+ precio_final);
        }else{
            precio_final = precio_original;
            System.out.print("no se aplica descuento el total es : $"+ precio_final);
        }
        }   
    }
/***}
 * CON DESCUENTO
 * un-single:
 * Ingrese el precio original del producto : 851
 * Se aplica un descuento del 10% : 765.9
 * ***********************************************************************
 * SIN DESCUENTO
 * Ingrese el precio original del producto : 65
 * no se aplica descuento el total es : $65.0
 */