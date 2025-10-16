package ar.edu.davinci.Factory;

import ar.edu.davinci.Dominio.Empleado;
import ar.edu.davinci.Dominio.Excusa.Excusa;
import ar.edu.davinci.Dominio.Excusa.ExcusaModerada;
import ar.edu.davinci.Dominio.Excusa.Motivo.IMotivo;

public class CreadorExcusasModeradas extends CreadorExcusa {
    private final IMotivo motivo;
    public CreadorExcusasModeradas(IMotivo motivo) { this.motivo = motivo; }

    @Override
    public Excusa crearExcusa(Empleado empleado) {
        return new ExcusaModerada(motivo, empleado);
    }
}