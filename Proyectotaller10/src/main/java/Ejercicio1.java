
/** *
 * Dada una matriz cuadrada (m X m) de valores enteros aleatorios,
 * desarrollar su procesamiento para presentar los elementos:
 * De la diagonal principal.
 * De la diagonal segundaria.
 * Ubicados bajo la diagonal principal.
 * Ubicados sobre la diagonal principal.
 * Ubicados bajo la diagonal secundaria.
 * Ubicados sobre la diagonal secundaria.
 *
 * @author Hans
 */
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int tamaniomatriz = 0;
        System.out.print("Deme el tamanio de la matriz: ");
        tamaniomatriz = tcl.nextInt();
        int matriz[][] = new int[tamaniomatriz][tamaniomatriz];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }

        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("\ndiagonal principal");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + "\t");
        }
        System.out.println("\ndiagonal secundaria");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length - 1 - i] + "\t");
        }
        System.out.println("\nelementos bajo la diagonal principal");
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }

        System.out.println("\nelementos sobre la diagonal principal");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i + 1; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }

        System.out.println("\nelementos bajo la diagonal secundaria");
        for (int i = 1; i < matriz.length; i++) {
            for (int j = matriz.length - i; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }

        System.out.println(" \nelementos sobre la diagonal secuandaria");
        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = 0; j < matriz.length - 1 - i; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }

    }
}
/***
 * Run
 * Deme el tamanio de la matriz: 3
7	7	3	
3	7	9	
8	5	9	

diagonal principal
7	7	9	
diagonal secundaria
3	7	8	
elementos bajo la diagonal principal
3	8	5	
elementos sobre la diagonal principal
7	3	9	
elementos bajo la diagonal secundaria
9	5	9	 
elementos sobre la diagonal secuandaria
7	7	3	
 */
