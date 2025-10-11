public class ExcusaCompleja extends Excusa {
    public ExcusaCompleja(IMotivo motivo) {
        super(motivo);
    }

    @Override
    public void procesar() {
        System.out.println("Excusa Compleja en proceso");
    }
}
