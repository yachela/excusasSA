package ar.edu.davinci.Factory;

import ar.edu.davinci.Dominio.Empleado;
import ar.edu.davinci.Dominio.Excusa.Excusa;
import ar.edu.davinci.Dominio.Excusa.ExcusaTrivial;
import ar.edu.davinci.Dominio.Excusa.Motivo.MotivoSimple;

public class CreadorExcusasTriviales extends CreadorExcusa {
    @Override
    public Excusa crearExcusa(Empleado empleado) {
        return new ExcusaTrivial(new MotivoSimple(), empleado);
    }
}
