package org.example;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasSolicitadas;

    public Inscripcion(Alumno alumno, List<Materia> materiasSolicitadas) {
        this.alumno = alumno;
        this.materiasSolicitadas = materiasSolicitadas;
    }

    public boolean aprobada() {
        return materiasSolicitadas.stream().allMatch(unaMateria -> unaMateria.cumpleCorrelativas(alumno.getMateriasAprobadas()));
    }
}
