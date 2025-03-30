package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class InscripcionTest {
    @Test
    void testAprobada() {
        assertTrue(true);
    }
    @Test
    public void testInscripcionAprobada() {
        Materia algoritmos = new Materia("Algoritmos");
        Materia paradigmas = new Materia("Paradigmas");
        paradigmas.agregarCorrelativa(algoritmos);

        Alumno juan = new Alumno("Juan");
        juan.aprobarMateria(algoritmos);

        Inscripcion inscripcion = new Inscripcion(juan, Arrays.asList(paradigmas));

        assertTrue(inscripcion.aprobada(), "La inscripción debería aprobarse.");
    }

    @Test
    public void testInscripcionRechazada() {
        Materia algoritmos = new Materia("Algoritmos");
        Materia paradigmas = new Materia("Paradigmas");
        paradigmas.agregarCorrelativa(algoritmos);

        Alumno maria = new Alumno("Maria");

        Inscripcion inscripcion = new Inscripcion(maria, Arrays.asList(paradigmas));

        assertFalse(inscripcion.aprobada(), "La inscripción debería rechazarse.");
    }
}
