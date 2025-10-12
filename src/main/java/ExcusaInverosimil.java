public class ExcusaInverosimil extends Excusa {
    public ExcusaInverosimil(IMotivo motivo, Empleado empleado) {
        super(motivo, empleado);
    }

    @Override
    public void procesar() {

    }

    @Override
    public boolean serProcesadaPor(Encargado encargado) {
        return false;
    }
}
