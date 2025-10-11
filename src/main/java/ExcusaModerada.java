public class ExcusaModerada extends Excusa {
    public ExcusaModerada(IMotivo motivo, Empleado empleado) {
        super(motivo);
    }

    @Override
    public void procesar() {

    }

    @Override
    public boolean serProcesadaPor(Encargado encargado) {
        return false;
    }
}
