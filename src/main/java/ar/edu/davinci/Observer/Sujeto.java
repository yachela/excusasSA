package ar.edu.davinci.Observer;

public interface Sujeto {
    void agregarObservador(Observador o);
    void quitarObservador(Observador o);
}