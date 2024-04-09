/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package clases;

import java.time.LocalDate;
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
public class PersonaTest {

    public PersonaTest() {
    }

    @Test
    public void testGetEdad() {
        // Creamos una persona con una fecha de nacimiento específica
        Persona persona = new Persona(123456789, "Juan Perez", 'M', 15, 4, 1990);
        // Calculamos la edad esperada (en este caso, la fecha actual es 9 de abril de 2024)
        int edadEsperada = 34;
        // Comprobamos que la edad calculada coincide con la esperada
        assertEquals(edadEsperada, persona.getEdad());
    }

    @Test
    public void testToString() {
        // Creamos una persona con datos específicos
        Persona persona = new Persona(123456789, "Maria Rodriguez", 'F', 25, 8, 1985);
        // Generamos la representación en cadena esperada
        String representacionEsperada = "123456789\tMaria\tRodriguez\t\t38";
        // Comprobamos que la representación en cadena generada coincide con la esperada
        assertEquals(representacionEsperada, persona.toString());
    }

    @Test
    public void testEquals() {
        // Creamos dos personas con el mismo NIF
        Persona persona1 = new Persona(123456789, "Juan Perez", 'M', 15, 4, 1990);
        Persona persona2 = new Persona(123456789, "Maria Rodriguez", 'F', 25, 8, 1985);
        // Comprobamos que son iguales (ya que comparan por NIF)
        assertTrue(persona1.equals(persona2));
    }

    @Test
    public void testCompareTo() {
        // Creamos dos personas con NIFs diferentes
        Persona persona1 = new Persona(123456789, "Juan Perez", 'M', 15, 4, 1990);
        Persona persona2 = new Persona(987654321, "Maria Rodriguez", 'F', 25, 8, 1985);
        // Comprobamos que la comparación devuelve un valor negativo (el primero es menor que el segundo)
        assertTrue(persona1.compareTo(persona2) < 0);
        // Creamos dos personas con el mismo NIF
        Persona persona3 = new Persona(123456789, "Pedro Gomez", 'M', 25, 8, 1985);
        // Comprobamos que la comparación devuelve un valor cero (son iguales)
        assertEquals(0, persona1.compareTo(persona3));
    }

}
