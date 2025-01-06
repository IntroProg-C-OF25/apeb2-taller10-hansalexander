/**
 * Dadas dos matrices (cuadradas y/o rectangulares) de valores enteros aleatorios,
 * desarrollar su procesamiento para calcular y presentar:
 * La suma de las dos matrices (considerar las restricciones matematicas para ello).
 * La multiplicación de las dos matrices (considerar las reglas matemáticas para ello).
 *
 * @author hansa
 */

import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Numero de filas de la matriz 1: ");
        int fila1 = tcl.nextInt();
        System.out.print("Numero de columnas de la matriz 1: ");
        int columna1 = tcl.nextInt();
        System.out.print("Numero de filas de la matriz 2: ");
        int fila2 = tcl.nextInt();
        System.out.print("Numero de columnas de la matriz 2: ");
        int columna2 = tcl.nextInt();
        int[][] matriz1 = new int[fila1][columna1];
        int[][] matriz2 = new int[fila2][columna2];
       

        for (int i = 0; i < fila1; i++) {
            for (int j = 0; j < columna1; j++) {
                matriz1[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < fila2; i++) {
            for (int j = 0; j < columna2; j++) {
                matriz2[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Matriz 1:");
        for (int i = 0; i < fila1; i++) {
            for (int j = 0; j < columna1; j++) {
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("");
        System.out.println("Matriz 2:");
        for (int i = 0; i < fila2; i++) {
            for (int j = 0; j < columna2; j++) {
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("");
        if (fila1 == fila2 && columna1 == columna2) {
            System.out.println("Suma de las matrices:");
            int[][] suma = new int[fila1][columna1];
            for (int i = 0; i < fila1; i++) {
                for (int j = 0; j < columna1; j++) {
                    suma[i][j] = matriz1[i][j] + matriz2[i][j];
                    System.out.print(suma[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("No se pueden sumar las matrices porque tienen diferentes dimensiones.");
        }
        System.out.println("");
        if (columna1 == fila2) {
            System.out.println("Multiplicacion de las matrices:");
            int[][] producto = new int[fila1][columna2];
            for (int i = 0; i < fila1; i++) {
                for (int j = 0; j < columna2; j++) {
                    producto[i][j] = 0;
                    for (int k = 0; k < columna1; k++) {
                        producto[i][j] += matriz1[i][k] * matriz2[k][j];
                    }
                    System.out.print(producto[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("No se pueden multiplicar las matrices porque tienen diferentes dimensiones.");
        }
    }
}
/***
 * Run
 * Numero de filas de la matriz 1: 
 * Numero de columnas de la matriz 1: 3
 * Numero de filas de la matriz 2: 3
 * Numero de columnas de la matriz 2: 3
Matriz 1:
9	0	2	
9	8	0	
7	7	3	

Matriz 2:
9	0	2	
0	6	6	
7	4	7	

Suma de las matrices:
18	0	4	
9	14	6	
14	11	10	

Multiplicacion de las matrices:
95	8	32	
81	48	66	
84	54	77	
 */