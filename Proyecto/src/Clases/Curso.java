/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;

public class Curso {
    private ArrayList<Alumno> alumnos;

    public Curso() {
        alumnos = new ArrayList<>();
    }

    // Método para registrar un curso con una cantidad de alumnos (ahora solo crea la lista vacía)
    public void registrarCurso(int cantidadAlumnos) {
        alumnos.clear(); // Limpiamos la lista en caso de que ya existan alumnos
        System.out.println("Curso preparado para registrar " + cantidadAlumnos + " alumnos.");
    }

    // Método para registrar un alumno
    public void registrarAlumno(String rut, String nombre) {
        Alumno alumno = new Alumno(rut, nombre);
        alumnos.add(alumno);
    }

    // Método para registrar notas para un alumno específico
    public void registrarNotas(String rut, double nota1, double nota2, double nota3) {
        for (Alumno alumno : alumnos) {
            if (alumno.getRut().equals(rut)) {
                alumno.registrarNotas(nota1, nota2, nota3);
                return;
            }
        }
        System.out.println("Alumno con RUT " + rut + " no encontrado.");
    }

    // Método para mostrar la información completa del curso
    public void mostrarInformacionCurso() {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados en el curso.");
            return;
        }
        System.out.println("Curso con " + alumnos.size() + " alumnos:");
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println((i + 1) + ". " + alumnos.get(i));
        }
    }
}
