/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Mati Droid
 */
public class Alumno {
    private String rut;
    private String nombre;
    private ArrayList<Double> notas;

    public Alumno() {
    }

    public Alumno(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
        this.notas = new ArrayList<>(3);
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }
    
    // metodos custom. 
    
    public void registrarNotas(double nota1, double nota2, double nota3){
        notas.clear();
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
    }

    @Override
    public String toString() {
        return "Alumno{" + "rut=" + rut + ", nombre=" + nombre + ", notas=" + notas + '}';
    }
    
    
    
}
