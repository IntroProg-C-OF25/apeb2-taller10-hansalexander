/**
 * El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuáles al finalizar el periodo,
 * la Dirección de la carrera de Computación a solicitado las siguientes estadísticas de la materia
 * INTRODUCCIÓN A LA PROGRAMACIÓN en función a los promedios por estudiante, dichos promedios se deben calcular
 *(ponderar, ya que el docente ingresa todo sobre 10pts.) de 3 calificaciones
 *(ACD que representa el 35% de la nota, APE del 35% y la nota del AA con un peso del 30%).
 * En resumen, los requerimientos son los siguientes:
 * Registre los nombres de cada estudiante de dicho paralelo.
 * Genere aleatoriamente las notas ACD, APE, AA, para cada uno de los 28 estudiantes de 0-10 pts.
 * Calcule el promedio de cada uno de los estudiantes del paralelo dada la siguiente ponderación: ACD->35%, APE->35%, y el AA->30%.
 * Obtenga el promedio del curso, del paralelo C.
 * Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por encima del promedio del curso.
 * Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por debajo del promedio del curso.
 * Muestre el estudiante con su calificación, si es el del mayor promedio (el más alto de la clase).
 * Muestre el estudiante con su calificación, si es el del menor promedio (el más bajo de la clase).
 *
 * @author hansa
 */

import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int totalestudiantes = 28;
        double sumatotal = 0, promediocurso;
        String[] nombres = new String[totalestudiantes];
        double[] ACD = new double[totalestudiantes]; 
        double[] APE = new double[totalestudiantes]; 
        double[] AA = new double[totalestudiantes];  
        double[] promedios = new double[totalestudiantes];
        System.out.println("Ingrese los nombres de los " + totalestudiantes + " estudiantes:");
        for (int i = 0; i < totalestudiantes; i++) {
            System.out.print("Estudiante " + (i + 1) + ": ");
            nombres[i] = tcl.nextLine();
        }
        for (int i = 0; i < totalestudiantes; i++) {
            ACD[i] = Math.random() * 10;
            APE[i] = Math.random() * 10;
            AA[i] = Math.random() * 10;
            promedios[i] = ACD[i] * 0.35 + APE[i] * 0.35 + AA[i] * 0.30;
            sumatotal += promedios[i];
        }
        promediocurso = sumatotal / totalestudiantes;
        System.out.println("\nPromedio del curso: " + promediocurso);
        System.out.println("\nEstudiantes por encima del promedio del curso:");
        for (int i = 0; i < totalestudiantes; i++) {
            if (promedios[i] > promediocurso) {
                System.out.println(nombres[i] + " - Promedio: " + promedios[i]);
            }
        }
        System.out.println("\nEstudiantes por debajo del promedio del curso:");
        for (int i = 0; i < totalestudiantes; i++) {
            if (promedios[i] < promediocurso) {
                System.out.println(nombres[i] + " - Promedio: " + promedios[i]);
            }
        }
        int mayor = 0, menor = 0;
        for (int i = 1; i < totalestudiantes; i++) {
            if (promedios[i] > promedios[mayor]) {
                mayor = i;
            }
            if (promedios[i] < promedios[menor]) {
                menor = i;
            }
        }
        System.out.println("\nEstudiante con el mayor promedio:");
        System.out.println(nombres[mayor] + " - Promedio: " + promedios[mayor]);

        System.out.println("\nEstudiante con el menor promedio:");
        System.out.println(nombres[menor] + " - Promedio: " + promedios[menor]);
    }
}
/***
 * Run
Ingrese los nombres de los 28 estudiantes:
Estudiante 1: patricio
Estudiante 2: juan
Estudiante 3: pablo
Estudiante 4: pedro
Estudiante 5: julian
Estudiante 6: luis
Estudiante 7: javier
Estudiante 8: julio
Estudiante 9: cristel
Estudiante 10: aliss
Estudiante 11: david
Estudiante 12: hans
Estudiante 13: tatiana
Estudiante 14: alejandra
Estudiante 15: necis
Estudiante 16: diego
Estudiante 17: bryan
Estudiante 18: dalton
Estudiante 19: rene
Estudiante 20: jose
Estudiante 21: gabriel
Estudiante 22: dayanna
Estudiante 23: luis
Estudiante 24: hans
Estudiante 25: seabstian
Estudiante 26: jorge
Estudiante 27: fernando
Estudiante 28: katty

Promedio del curso: 5.219397546946214

Estudiantes por encima del promedio del curso:
patricio - Promedio: 7.496635736344395
pablo - Promedio: 6.595497575677539
pedro - Promedio: 5.761634217255633
julian - Promedio: 6.690421632530704
julio - Promedio: 5.880308870511969
cristel - Promedio: 6.123632637843379
hans - Promedio: 5.3369303760625435
alejandra - Promedio: 6.999948123110212
diego - Promedio: 6.1961429384991025
bryan - Promedio: 7.771355033237869
rene - Promedio: 6.573738850593914
dayanna - Promedio: 6.679575478791827
seabstian - Promedio: 5.753325090904619
jorge - Promedio: 6.501969538924657

Estudiantes por debajo del promedio del curso:
juan - Promedio: 5.217876800991462
luis - Promedio: 3.29469968998745
javier - Promedio: 4.4545553143780765
aliss - Promedio: 4.195357763555996
david - Promedio: 4.452653091676349
tatiana - Promedio: 3.055013074726622
necis - Promedio: 4.68082706255853
dalton - Promedio: 4.957709426852349
jose - Promedio: 0.82234812177389
gabriel - Promedio: 4.236137603436119
luis - Promedio: 4.180571827106853
hans - Promedio: 3.9020119867968814
fernando - Promedio: 3.2958410302656964
katty - Promedio: 5.036412420099364

Estudiante con el mayor promedio:
bryan - Promedio: 7.771355033237869

Estudiante con el menor promedio:
jose - Promedio: 0.82234812177389
 */