public class ExcusaTrivial extends Excusa {
    public ExcusaTrivial(IMotivo motivo, Empleado empleado) {
        super(motivo, empleado);
    }

    @Override
    public void procesar() {
        System.out.println("Excusa Trivial en proceso");
    }

    @Override
    public boolean serProcesadaPor(Encargado encargado) {
        return encargado.procesar(this);
    }
}
