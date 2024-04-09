/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.TreeSet;

/**
 * Clase que representa un curso.
 */
public class Curso {

    private String nombre;
    private TreeSet<Persona> listaAlumnos;

    /**
     * Constructor de la clase Curso.
     *
     * @param nombre El nombre del curso.
     */
    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }

    /**
     * Método para obtener el nombre del curso.
     *
     * @return El nombre del curso.
     */
    protected String getNombre() {
        return nombre;
    }

    /**
     * Método para añadir un alumno al curso.
     *
     * @param p El objeto Persona que representa al alumno a añadir.
     */
    public void aniadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }

    /**
     * Método que genera una representación en forma de cadena de texto del
     * curso.
     *
     * @return Una cadena de texto que representa el curso y la lista de alumnos
     * inscritos en él.
     */
    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }
}
