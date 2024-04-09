/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package clases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Diurno
 */
public class CursoTest {
    
    @Test
    public void testAniadirAlumno() {
        // Creamos un curso
        Curso curso = new Curso("Programación Avanzada");
        // Creamos una persona
        Persona alumno = new Persona(123456789, "Juan Perez", 'M', 15, 4, 1990);
        // Añadimos al alumno al curso
        curso.aniadirAlumno(alumno);
        // Verificamos que el alumno ha sido añadido correctamente
        assertTrue(curso.toString().contains(alumno.toString()));
    }

    @Test
    public void testGetNombre() {
        // Creamos un curso
        Curso curso = new Curso("Programación Avanzada");
        // Verificamos que el nombre del curso es correcto
        assertEquals("Programación Avanzada", curso.getNombre());
    }
    
}
