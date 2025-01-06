/**
 * Crea un programa que gestione el inventario de una tienda, así como la emisión de facturas.
 * Utiliza una matriz bidimensional para almacenar los productos disponibles en la tienda,
 * con información como nombre, precio y cantidad. El programa debe permitir facturar un producto dado su código,
 * y unidades deseadas. Adicional se debe agregar a la factura al 15% del IVA, y si la compra superar los $100,
 * se debe aplicar un descuento.
 *
 * @author hansa
 */

import java.util.Scanner;
public class Ejercicio5 {

    public static void main(String[] args) {
        int opcion, cantidad, stock;
        double precio, subtotal, iva, total;
        Scanner tcl = new Scanner(System.in);
        String[][] inventario = {
            {"001", "producto1", "10.0", "50"},
            {"002", "producto2", "15.5", "30"},
            {"003", "producto3", "20.0", "40"},
            {"004", "producto4", "5.0", "100"}
        };
        while (true) {
            System.out.println("\n- Inventario -");
            System.out.println("1. Facturar producto");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = tcl.nextInt();
            if (opcion == 1) {
                System.out.print("Ingrese el codigo del producto: ");
                String codigo = tcl.next();
                int cod = -1;
                for (int i = 0; i < inventario.length; i++) {
                    if (inventario[i][0].equals(codigo)) {
                        cod = i;
                        break;
                    }
                }
                if (cod != -1) {
                    System.out.println("Producto: " + inventario[cod][1]);
                    System.out.print("Ingrese la cantidad deseada: ");
                    cantidad = tcl.nextInt();
                    stock = Integer.parseInt(inventario[cod][3]);
                    if (cantidad <= stock) {
                        precio = Double.parseDouble(inventario[cod][2]);
                        subtotal = cantidad * precio;
                        iva = subtotal * 0.15;
                        total = subtotal + iva;
                        if (total > 100) {
                            total = total * 0.9; 
                            System.out.println("Se aplico un descuento del 10%");
                        }
                        inventario[cod][3] = Integer.toString(stock - cantidad);
                        System.out.println("\n- Factura -");
                        System.out.println("Subtotal: $" + subtotal);
                        System.out.println("IVA (15%): $" + iva);
                        System.out.println("Total: $" + total);
                    } else {
                        System.out.println("No esta disponible: " + stock);
                    }
                } else {
                    System.out.println("Producto no encontrado");
                }
            } else if (opcion == 2) {
                System.out.print("Salio del sistema");
                break;
            } else {
                System.out.println("Opción invalida");
            }
        }
    }
}
/***
 * Run
- Inventario -
1. Facturar producto
2. Salir
Seleccione una opcion: 1
Ingrese el codigo del producto: 003
Producto: producto3
Ingrese la cantidad deseada: 30
Se aplico un descuento del 10%

- Factura -
Subtotal: $600.0
IVA (15%): $90.0
Total: $621.0

- Inventario -
1. Facturar producto
2. Salir
Seleccione una opcion: 2
Salio del sistema
 */