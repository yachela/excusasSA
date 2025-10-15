import java.util.ArrayList;
import java.util.List;

public class SistemaDeNotificacionesCEO implements Sujeto {
    private static SistemaDeNotificacionesCEO instance;
    private final List<Observador> observadores = new ArrayList<>();

    private SistemaDeNotificacionesCEO() {}

    public static SistemaDeNotificacionesCEO getInstance() {
        if (instance == null) {
            instance = new SistemaDeNotificacionesCEO();
        }
        return instance;
    }

    public void nuevoProntuarioRegistrado(CEO ceoOriginador, Excusa excusa) {
        this.notificarObservadores(ceoOriginador, excusa);
    }

    @Override
    public void agregarObservador(Observador o) {
        observadores.add(o);
    }

    @Override
    public void quitarObservador(Observador o) {
        observadores.remove(o);
    }

    private void notificarObservadores(CEO ceoOriginador, Excusa excusa) {
        for (Observador obs : observadores) {
            obs.notificar(ceoOriginador, excusa);
        }
    }

    public void reset() {
    }
}