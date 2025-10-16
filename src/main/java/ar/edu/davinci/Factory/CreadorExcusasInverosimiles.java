package ar.edu.davinci.Factory;

import ar.edu.davinci.Dominio.Empleado;
import ar.edu.davinci.Dominio.Excusa.Excusa;
import ar.edu.davinci.Dominio.Excusa.ExcusaInverosimil;
import ar.edu.davinci.Dominio.Excusa.Motivo.IMotivo;
import ar.edu.davinci.Dominio.Excusa.Motivo.MotivoInverosimil;

public class CreadorExcusasInverosimiles extends CreadorExcusa{
    private IMotivo motivo;

    public CreadorExcusasInverosimiles(MotivoInverosimil motivo) {
        this.motivo = motivo;
    }

    @Override
    public Excusa crearExcusa(Empleado empleado) {
        return new ExcusaInverosimil(this.motivo, empleado);
    }
}
