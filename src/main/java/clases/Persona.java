/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 * Clase que representa una persona.
 */
public class Persona implements Comparable<Persona> {

    private Nif nif;
    private String nombre;
    private char genero;
    private LocalDate nacimiento;

    /**
     * Constructor por defecto de la clase Persona. Inicializa los valores
     * predeterminados.
     */
    public Persona() {
        nif = new Nif();
        nombre = "";
        genero = ' ';
        nacimiento = LocalDate.of(1990, 1, 1);
    }

    /**
     * Constructor de la clase Persona con un NIF dado.
     *
     * @param nif El número de identificación fiscal (NIF) de la persona.
     */
    public Persona(int nif) {
        this();
        this.nif = new Nif(nif);
    }

    /**
     * Constructor de la clase Persona con todos los atributos.
     *
     * @param nif El número de identificación fiscal (NIF) de la persona.
     * @param nombre El nombre de la persona.
     * @param genero El género de la persona.
     * @param dia El día de nacimiento de la persona.
     * @param mes El mes de nacimiento de la persona.
     * @param ano El año de nacimiento de la persona.
     */
    public Persona(int nif, String nombre, char genero,
            int dia, int mes, int ano) {
        this.nif = new Nif(nif);
        this.nombre = nombre;
        this.genero = genero;
        this.nacimiento
                = LocalDate.of(ano, mes, dia);
    }

    /**
     * Método para obtener el NIF de la persona.
     *
     * @return El NIF de la persona.
     */
    public Nif getNif() {
        return nif;
    }

    /**
     * Método para establecer el NIF de la persona.
     *
     * @param nif El NIF de la persona a establecer.
     */
    public void setNif(Nif nif) {
        this.nif = nif;
    }

    /**
     * Método para obtener el nombre de la persona.
     *
     * @return El nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre de la persona.
     *
     * @param nombre El nombre de la persona a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el género de la persona.
     *
     * @return El género de la persona.
     */
    public char getGenero() {
        return genero;
    }

    /**
     * Método para establecer el género de la persona.
     *
     * @param genero El género de la persona a establecer.
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * Método para obtener la fecha de nacimiento de la persona.
     *
     * @return La fecha de nacimiento de la persona.
     */
    public LocalDate getNacimiento() {
        return nacimiento;
    }

    /**
     * Método para establecer la fecha de nacimiento de la persona.
     *
     * @param nacimiento La fecha de nacimiento de la persona a establecer.
     */
    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    /**
     * Método para obtener la edad de la persona.
     *
     * @return La edad de la persona.
     */
    public int getEdad() {
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

    /**
     * Método que genera una representación en forma de cadena de texto de la
     * persona.
     *
     * @return Una cadena de texto que representa a la persona con su NIF,
     * nombre y edad.
     */
    @Override
    public String toString() {
        if (nombre.split(" ").length > 1) {
            return nif + "\t" + nombre.split(" ")[0]
                    + '\t' + nombre.split(" ")[1] + "\t\t" + getEdad();
        } else {
            return nif + "\t" + nombre + "\t\t\t" + getEdad();
        }
    }

    /**
     * Método para comparar si dos personas son iguales.
     *
     * @param a La persona a comparar.
     * @return true si las personas tienen el mismo NIF, false de lo contrario.
     */
    public boolean equals(Persona a) {
        if (a == null) {
            return false;
        }
        return a.nif.toString().equals(this.nif.toString());
    }

    /**
     * Método para comparar si dos objetos Persona son iguales.
     *
     * @param obj El objeto a comparar.
     * @return true si los objetos tienen el mismo NIF, false de lo contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;

        return Objects.equals(this.nif, other.nif);
    }

    /**
     * Método para comparar dos personas basado en su NIF.
     *
     * @param o La persona a comparar.
     * @return Un valor negativo si el NIF de esta persona es menor que el de la
     * otra, cero si son iguales, o un valor positivo si el NIF de esta persona
     * es mayor que el de la otra.
     */
    @Override
    public int compareTo(Persona o) {
        return this.nif.toString().compareTo(o.nif.toString());
    }

}
