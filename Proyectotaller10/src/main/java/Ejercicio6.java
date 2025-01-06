
/**
 * Crea un juego de tres en raya utilizando una matriz bidimensional de 3x3.
 * Permita a dos jugadores marcar sus movimientos alternativamente.
 * El juego debe verificar si alguno de los jugadores ha ganado o si hay un empate
 *
 * @author hansa
 */
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String[][] tablero = {
            {" ", " ", " "},
            {" ", " ", " "},
            {" ", " ", " "}
        };
        int turnos = 0;
        String jugadoractual = "X";
        while (true) {

            System.out.println("\nTablero:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tablero[i][j]);
                    if (j < 2) {
                        System.out.print(" | ");
                    }
                }
                System.out.println();
                if (i < 2) {
                    System.out.println("--+---+--");
                }
            }

            System.out.println("Turno del jugador " + jugadoractual);
            System.out.print("Ingrese fila (0, 1 o 2): ");
            int fila = tcl.nextInt();
            System.out.print("Ingrese columna (0, 1 o 2): ");
            int columna = tcl.nextInt();
            if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna].equals(" ")) {
                tablero[fila][columna] = jugadoractual;
                turnos++;
                boolean ganador = false;
                for (int i = 0; i < 3; i++) {
                    if (tablero[i][0].equals(jugadoractual) && tablero[i][1].equals(jugadoractual) && tablero[i][2].equals(jugadoractual)) {
                        ganador = true;
                    }
                    if (tablero[0][i].equals(jugadoractual) && tablero[1][i].equals(jugadoractual) && tablero[2][i].equals(jugadoractual)) {
                        ganador = true;
                    }
                }
                if (tablero[0][0].equals(jugadoractual) && tablero[1][1].equals(jugadoractual) && tablero[2][2].equals(jugadoractual)) {
                    ganador = true;
                }
                if (tablero[0][2].equals(jugadoractual) && tablero[1][1].equals(jugadoractual) && tablero[2][0].equals(jugadoractual)) {
                    ganador = true;
                }
                if (ganador) {
                    System.out.println("\n Jugador " + jugadoractual + " ha ganado");
                    break;
                }
                if (turnos == 9) {
                    System.out.println("\n¡Empate!");
                    break;
                }
                jugadoractual = jugadoractual.equals("X") ? "O" : "X";
            } else {
                System.out.println("Movimiento invalido. Intente de nuevo.");
            }
        }
    }
}
/***
 * Run
Tablero:
  |   |  
--+---+--
  |   |  
--+---+--
  |   |  
Turno del jugador X
Ingrese fila (0, 1 o 2): 1
Ingrese columna (0, 1 o 2): 1

Tablero:
  |   |  
--+---+--
  | X |  
--+---+--
  |   |  
Turno del jugador O
Ingrese fila (0, 1 o 2): 2
Ingrese columna (0, 1 o 2): 2

Tablero:
  |   |  
--+---+--
  | X |  
--+---+--
  |   | O
Turno del jugador X
Ingrese fila (0, 1 o 2): 0
Ingrese columna (0, 1 o 2): 0

Tablero:
X |   |  
--+---+--
  | X |  
--+---+--
  |   | O
Turno del jugador O
Ingrese fila (0, 1 o 2): 1
Ingrese columna (0, 1 o 2): 2

Tablero:
X |   |  
--+---+--
  | X | O
--+---+--
  |   | O
Turno del jugador X
Ingrese fila (0, 1 o 2): 0
Ingrese columna (0, 1 o 2): 2

Tablero:
X |   | X
--+---+--
  | X | O
--+---+--
  |   | O
Turno del jugador O
Ingrese fila (0, 1 o 2): 0
Ingrese columna (0, 1 o 2): 1

Tablero:
X | O | X
--+---+--
  | X | O
--+---+--
  |   | O
Turno del jugador X
Ingrese fila (0, 1 o 2): 2
Ingrese columna (0, 1 o 2): 0

 Jugador X ha ganado
 */