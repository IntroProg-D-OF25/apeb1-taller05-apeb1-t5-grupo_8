import java.util.Scanner;

/***
 * Pedidos online: Desarrollar una solución que imprima el costo de un pedido de un artículo del cual se tiene la descripción,
 * la cantidad que se requiere y el precio unitario. Si la cantidad pedida excede de 50 unidades, se hace un descuento de 15%.
 * @author PATO PC
 */
public class Ejercicio11_PedidosOnline {
    public static void main(String[] args) {
        double precio, costo_total;
        int cantidad;
        Scanner teclado = new Scanner(System.in);
        System.out.print("INGRESA LA CANTIDAD DE ARTICULOS QUE NECESITAS: ");
        cantidad = teclado.nextInt();
        System.out.print("INGRESA EL PRECIO UNITARIO DEL ARTICULO: ");
        precio = teclado.nextDouble();
        costo_total = cantidad * precio;
        if (cantidad > 50)
        {
            costo_total *= 0.85;
        }
        System.out.println("El costo total es de: " + costo_total);
        
        
        
    }
    
}

/***
 * INGRESA LA CANTIDAD DE ARTICULOS QUE NECESITAS: 40
 * INGRESA EL PRECIO UNITARIO DEL ARTICULO: 2.60
 * El costo total es de: 104.0
 */
