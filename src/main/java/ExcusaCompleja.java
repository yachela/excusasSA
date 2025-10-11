public class ExcusaCompleja extends Excusa {
    public ExcusaCompleja(IMotivo motivo, Empleado empleado) {
        super(motivo, empleado);
    }

    @Override
    public void procesar() {
        System.out.println("Excusa Compleja en proceso");
    }

    @Override
    public boolean serProcesadaPor(Encargado encargado) {
        return encargado.procesar(this);
    }
}
