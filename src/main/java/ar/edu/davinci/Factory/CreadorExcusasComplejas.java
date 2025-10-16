package ar.edu.davinci.Factory;

import ar.edu.davinci.Dominio.Empleado;
import ar.edu.davinci.Dominio.Excusa.Excusa;
import ar.edu.davinci.Dominio.Excusa.ExcusaCompleja;
import ar.edu.davinci.Dominio.Excusa.Motivo.IMotivo;

public class CreadorExcusasComplejas extends CreadorExcusa {
    private final IMotivo motivo;

    public CreadorExcusasComplejas(IMotivo motivo) {
        this.motivo = motivo;
    }

    @Override
    public Excusa crearExcusa(Empleado empleado) {
        return new ExcusaCompleja(motivo, empleado);
    }
}