/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import Clases.Curso;
import java.util.Scanner;

public class Proyecto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Curso curso = new Curso();
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Preparar curso (cantidad de alumnos)");
            System.out.println("2. Registrar alumno");
            System.out.println("3. Registrar notas de un alumno");
            System.out.println("4. Mostrar información del curso");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad de alumnos en el curso: ");
                    int cantidadAlumnos = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    curso.registrarCurso(cantidadAlumnos);
                    break;

                case 2:
                    System.out.print("Ingrese el RUT del alumno: ");
                    String rut = scanner.nextLine();
                    System.out.print("Ingrese el nombre del alumno: ");
                    String nombre = scanner.nextLine();
                    curso.registrarAlumno(rut, nombre);
                    System.out.println("Alumno " + nombre + " registrado con RUT " + rut + ".");
                    break;

                case 3:
                    System.out.print("Ingrese el RUT del alumno para registrar notas: ");
                    String rutAlumno = scanner.nextLine();
                    System.out.print("Ingrese la primera nota: ");
                    double nota1 = scanner.nextDouble();
                    System.out.print("Ingrese la segunda nota: ");
                    double nota2 = scanner.nextDouble();
                    System.out.print("Ingrese la tercera nota: ");
                    double nota3 = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar el buffer
                    curso.registrarNotas(rutAlumno, nota1, nota2, nota3);
                    System.out.println("Notas registradas para el alumno con RUT " + rutAlumno + ".");
                    break;

                case 4:
                    curso.mostrarInformacionCurso();
                    break;

                case 5:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        }
        
        scanner.close();
    }
}
