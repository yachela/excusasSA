package ar.edu.davinci.Factory;

import ar.edu.davinci.Dominio.Empleado;
import ar.edu.davinci.Dominio.Excusa.Excusa;

public abstract class CreadorExcusa {
    public abstract Excusa crearExcusa(Empleado empleado);
}
