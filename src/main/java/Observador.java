public interface Observador {
    void notificar(CEO ceoOriginador, Excusa excusa);

    void agregarObservador(Observador o);

    void sacarObservador(Observador o);

    void notificarObservadores(Excusa excusa);
}