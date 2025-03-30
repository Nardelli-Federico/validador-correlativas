package org.example;
import java.util.HashSet;
import java.util.Set;

public class Alumno {
    private String nombre;
    private Set<Materia> materiasAprobadas;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.materiasAprobadas = new HashSet<>();
    }

    public boolean aproboMateria(Materia materia) {
        return materiasAprobadas.contains(materia);
    }

    public Set<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }
}
