public class ExcusaTrivial extends Excusa {
    public ExcusaTrivial(IMotivo motivo) {
        super(motivo);
    }

    @Override
    public void procesar() {
        System.out.println("Excusa Trivial en proceso");
    }
}
